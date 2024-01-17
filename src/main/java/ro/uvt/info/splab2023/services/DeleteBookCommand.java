package ro.uvt.info.splab2023.services;

public class DeleteBookCommand implements Command {
    private final BooksService booksService;
    private final String id;

    public DeleteBookCommand(BooksService booksService, String id) {
        this.booksService = booksService;
        this.id = id;
    }

    @Override
    public String execute() {
        return booksService.deleteBook(id);
    }
}