package ro.uvt.info.splab2023.models;

public class BookStatistics implements Visitor {
    private int paragraphCount = 0;
    private int imageCount = 0;
    private int tableCount = 0;
    private StringBuilder statistics = new StringBuilder();

    @Override
    public void visitBook(Book book) {

    }

    @Override
    public void visitSection(Section section) {

    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        paragraphCount++;
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        imageCount++;
    }

    @Override
    public void visitImage(Image image) {
        imageCount++;
    }

    @Override
    public void visitTable(Table table) {
        tableCount++;
    }

    @Override
    public void visitTableOfContents(ToC toC) {

    }


    public void printStatistics() {
        statistics.append("Book Statistics:\n");
        statistics.append("***Number of paragraphs: ").append(paragraphCount).append("\n");
        statistics.append("***Number of images: ").append(imageCount).append("\n");
        statistics.append("***Number of tables: ").append(tableCount).append("\n");
    }

    public String getStatistics() {
        return statistics.toString();
    }
}