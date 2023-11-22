package ro.uvt.info.splab2023.models;

import java.util.ArrayList;
import java.util.List;

public class Section implements Visitee {
    private String title;
    private List<Visitee> content;
    private List<Element> elements;

    public Section(String title) {
        this.title = title;
        this.content = new ArrayList<>();
        this.elements = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void addContent(Visitee element) {
        content.add(element);
    }

    public List<Visitee> getContent() {
        return content;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSection(this);
        for (Visitee element : content) {
            element.accept(visitor);
        }
    }

    public List<Element> getElements() {
        return elements;
    }


}