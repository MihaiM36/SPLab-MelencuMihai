package ro.uvt.info.splab2023.models;

public class TableOfContentUpdate implements Visitor {
    private ToC toc;
    private int pageNumber;

    public TableOfContentUpdate() {
        this.toc = new ToC();
        this.pageNumber = 1; // Assuming the book starts at page 1
    }


    @Override
    public void visitParagraph(Paragraph paragraph) {
        pageNumber++; // Increment page number for each paragraph
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        pageNumber++; // Increment page number for each image proxy
    }

    @Override
    public void visitImage(Image image) {
        pageNumber++; // Increment page number for each image
    }

    @Override
    public void visitTable(Table table) {
        pageNumber++; // Increment page number for each table
    }

    @Override
    public void visitTableOfContents(ToC toC) {

    }

    @Override
    public void visitSection(Section section) {
        toc.addEntry(section.getTitle() + " ......................................................... " + pageNumber);
        for (Element element : section.getElements()) {
            element.accept(this);
        }
    }

    @Override
    public void visitBook(Book book) {

        for (Visitee content : book.getContents()) {
            content.accept(this);
        }
    }
    public ToC getToC() {
        return toc;
    }
}
