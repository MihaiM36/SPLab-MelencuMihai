package ro.uvt.info.splab2023.services;

public class UpdateBookCommand implements Command {
    private final BooksService booksService;
    private final Long id;
    private final String book;

    public UpdateBookCommand(BooksService booksService, String id, String book) {
        this.booksService = booksService;
        this.id = Long.valueOf(id);
        this.book = book;
    }

    @Override
    public String execute() {
        return String.valueOf(booksService.updateBook(id, book));
    }
}