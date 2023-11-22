package ro.uvt.info.splab2023.models;
import java.util.ArrayList;
import java.util.List;

public class Book implements Visitee {
    private String title;
    private List<Visitee> elements;
    private List<Visitee> contents;
    private ToC toC;

    public Book(String title) {
        this.title = title;
        this.elements = new ArrayList<>();
        this.toC = new ToC();
        this.contents = new ArrayList<>();
    }

    // Method to add elements to the book
    public void addElement(Visitee element) {
        elements.add(element);
        // If the element is a Section, add its title to the Table of Contents
        if (element instanceof Section) {
            Section section = (Section) element;
            toC.addTitle(section.getTitle());
        }
    }
    public void addContent(Visitee content) {
        contents.add(content);
    }
    public String getTitle() {
        return title;
    }

    public ToC getTableOfContents() {
        return toC;
    }

    public List<Visitee> getElements() {
        return elements;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBook(this);
        toC.accept(visitor);
    }

    public List<Visitee> getContents() {
        return contents;
    }
}