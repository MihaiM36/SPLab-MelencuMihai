package ro.uvt.info.splab2023;

import java.util.ArrayList;
import java.util.List;

public class Section {
    private String title;
    private List<Document> elements;

    public Section(String title) {
        this.title = title;
        this.elements = new ArrayList<>();
    }

    public void add(Document element) {
        elements.add(element);
    }

    public void print() {
        System.out.println("Section: " + title);
        for (Document element : elements) {
            element.print();
        }
    }
}