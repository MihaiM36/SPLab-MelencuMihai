package ro.uvt.info.splab2023.models;

import java.util.ArrayList;
import java.util.List;

public class ToC implements Visitee {


    private List<String> titles;
    private List<String> entries;

    public ToC() {

        this.titles = new ArrayList<>();
        this.entries = new ArrayList<>();
    }

    public void addEntry(String entry) {
        entries.add(entry);
    }
    public void addTitle(String title) {
        titles.add(title);
    }

    public String getTitle(int index) {
        return titles.get(index);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTableOfContents(this);
    }

    public List<String> getTitles() {
        return titles;
    }
}
