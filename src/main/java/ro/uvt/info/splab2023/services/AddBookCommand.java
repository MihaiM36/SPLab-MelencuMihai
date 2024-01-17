package ro.uvt.info.splab2023.services;

public class AddBookCommand implements Command {
    private final BooksService booksService;
    private final String book;

    public AddBookCommand(BooksService booksService, String book) {
        this.booksService = booksService;
        this.book = book;
    }

    @Override
    public String execute() {
        return booksService.addBook(book);
    }
}