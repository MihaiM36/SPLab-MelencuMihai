package ro.uvt.info.splab2023.models;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Book implements Visitee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    @Transient
    private ToC toC;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Section> elements = new ArrayList<>();

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Visitee> contents = new ArrayList<>();


    public void addElement(Visitee element) {
        elements.add((Section) element);
        if (element instanceof Section) {
            Section section = (Section) element;
            toC.addTitle(section.getTitle());
        }
    }

    public void addContent(Visitee content) {
        contents.add(content);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBook(this);
        for (Visitee element : elements) {
            element.accept(visitor);
        }
        for (Visitee content : contents) {
            content.accept(visitor);
        }
        toC.accept(visitor);
    }

    public void setId(Long id) {
    }
}