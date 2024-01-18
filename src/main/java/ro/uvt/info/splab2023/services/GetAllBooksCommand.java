package ro.uvt.info.splab2023.services;

public class GetAllBooksCommand implements Command {
    private BooksService booksService;

    public GetAllBooksCommand(BooksService booksService) {
        this.booksService = booksService;
    }

    @Override
    public String execute() {
        return booksService.getAllBooks().toString();
    }
}
