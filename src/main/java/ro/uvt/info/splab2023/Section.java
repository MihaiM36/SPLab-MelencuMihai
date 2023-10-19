package ro.uvt.info.splab2023;

import java.util.ArrayList;
import java.util.List;

public class Section {
    private String title;
    private List<Object> contents;

    public Section(String title) {
        this.title = title;
        contents = new ArrayList<>();
    }

    public void add(Object content) {
        contents.add(content);
    }

    public void print() {
        System.out.println(title);
        for (Object content : contents) {
            if (content instanceof Paragraph) {
                System.out.println("Paragraph: " + ((Paragraph)content).getContent());
            } else if (content instanceof Section) {
                ((Section)content).print();
            } else if (content instanceof Image) {
                System.out.println("Image with name:" + ((Image)content).getName());
            }
        }
    }
}