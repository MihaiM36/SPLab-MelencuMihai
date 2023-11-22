package ro.uvt.info.splab2023.models;

public class RenderContentVisitor implements Visitor {

    @Override
    public void visitBook(Book book) {

        System.out.println("Rendering Book: " + book.getTitle());
        for (Visitee element : book.getElements()) {
            element.accept(this);
        }
    }

    @Override
    public void visitSection(Section section) {
        System.out.println("Rendering Section: " + section.getTitle());
        for (Visitee element : section.getContent()) {
            element.accept(this);
        }
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        System.out.println("Rendering Paragraph: " + paragraph.getText());
        if (paragraph.getAlignStrategy() != null) {
            paragraph.getAlignStrategy().render(paragraph, new Context());
        }
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {

        System.out.println("Rendering ImageProxy: " + imageProxy.getUrl());
        Image realImage = imageProxy.loadImage();
        realImage.accept(this);
    }

    @Override
    public void visitImage(Image image) {
        System.out.println("Rendering Image: " + image.getUrl());
    }

    @Override
    public void visitTable(Table table) {
        System.out.println("Rendering Table: " + table.getTitle());
    }

    @Override
    public void visitTableOfContents(ToC toC) {
        System.out.println("Rendering Table of Contents");
        for (String title : toC.getTitles()) {
            System.out.println(title);
        }
    }
}