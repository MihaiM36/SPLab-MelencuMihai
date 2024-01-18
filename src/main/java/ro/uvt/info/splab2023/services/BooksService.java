package ro.uvt.info.splab2023.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.uvt.info.splab2023.models.Book;
import ro.uvt.info.splab2023.persistence.BooksRepository;
import java.util.List;
import java.util.Optional;

@Service
public class BooksService {

    private final BooksRepository booksRepository;

    @Autowired
    public BooksService(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    public Book addBook(String book) {
       // return booksRepository.save(book);

        return null;
    }

    public Optional<Book> getBook(Long id) {
        return booksRepository.findById(id);
    }

    public List<Book> getAllBooks() {
        return booksRepository.findAll();
    }

    public Book updateBook(Long id, String updatedBook) {
        return booksRepository.findById(id)
                .map(booksRepository::save)
                .orElseGet(() -> {
                    //updatedBook.setId(id);
                    //return booksRepository.save(updatedBook);
                    return null;
                });
    }

    public String deleteBook(Long id) {
        booksRepository.deleteById(id);
        return null;
    }
}