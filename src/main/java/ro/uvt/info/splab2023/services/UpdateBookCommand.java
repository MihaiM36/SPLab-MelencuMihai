package ro.uvt.info.splab2023.services;

public class UpdateBookCommand implements Command {
    private final BooksService booksService;
    private final String id;
    private final String book;

    public UpdateBookCommand(BooksService booksService, String id, String book) {
        this.booksService = booksService;
        this.id = id;
        this.book = book;
    }

    @Override
    public String execute() {
        return booksService.updateBook(id, book);
    }
}