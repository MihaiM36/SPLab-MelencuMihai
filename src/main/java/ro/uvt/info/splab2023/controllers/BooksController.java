package ro.uvt.info.splab2023.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ro.uvt.info.splab2023.persistence.BookCrudRepository;
import ro.uvt.info.splab2023.services.*;

@RestController
@RequestMapping("/books")
public class BooksController {

    private final BooksService booksService;
    private final SynchronousCommandExecutor syncExecutor;
    private final AsynchronousCommandExecutor asyncExecutor;
    private final BookCrudRepository bookCrudRepository;
    private final Subject allBooksSubject; // Inject the Subject for Observer pattern

    @Autowired
    public BooksController(BooksService booksService,
                           SynchronousCommandExecutor syncExecutor,
                           AsynchronousCommandExecutor asyncExecutor,
                           BookCrudRepository bookCrudRepository,
                           Subject allBooksSubject) {
        this.booksService = booksService;
        this.syncExecutor = syncExecutor;
        this.asyncExecutor = asyncExecutor;
        this.bookCrudRepository = bookCrudRepository;
        this.allBooksSubject = allBooksSubject;
    }

    @GetMapping
    public String getAllBooks() {
        Command command = new GetAllBooksCommand(booksService);
        return syncExecutor.execute(command);
    }

    @PostMapping
    public String addBook(@RequestBody String book) {
        Command command = new AddBookCommand(booksService, book);
        String result = asyncExecutor.execute(command);

        allBooksSubject.notifyObservers(book);

        return result;
    }


    @PutMapping("/{id}")
    public String updateBook(@PathVariable String id, @RequestBody String book) {
        Command command = new UpdateBookCommand(booksService, id, book);
        return asyncExecutor.execute(command);
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable String id) {
        Command command = new DeleteBookCommand(booksService, id);
        return asyncExecutor.execute(command);
    }
}