package ro.uvt.info.splab2023;

import java.util.List;
import java.util.ArrayList;

public class Book {
    private String title;
    private List<Author> authors;
    private List<Object> contents;

    public Book(String title) {
        this.title = title;
        authors = new ArrayList<>();
        contents = new ArrayList<>();
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void addContent(Object content) {
        contents.add(content);
    }

    public void print() {
        // Print book title
        System.out.println("Book: " + title);

        // Print authors
        System.out.println("Authors:");
        for (Author author : authors) {
            System.out.println("Author: " + author.getName());
        }

        // Print contents
        for (Object content : contents) {
            if (content instanceof Paragraph) {
                System.out.println("Paragraph: " + ((Paragraph)content).getContent());
            } else if (content instanceof Section) {
                ((Section)content).print();
            }
        }
    }
}