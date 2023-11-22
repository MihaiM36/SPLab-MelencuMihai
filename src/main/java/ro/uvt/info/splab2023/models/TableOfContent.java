package ro.uvt.info.splab2023.models;

import java.util.ArrayList;
import java.util.List;

public class TableOfContent {
    private List<String> entries;

    public TableOfContent() {
        this.entries = new ArrayList<>();
    }

    public void addEntry(String entry) {
        entries.add(entry);
    }

    public List<String> getEntries() {
        return entries;
    }

    public void clear() {
        entries.clear();
    }

    public String getEntry(int index) {
        return entries.size() > index ? entries.get(index) : null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Table of Contents:\n");
        for (String entry : entries) {
            sb.append(entry).append("\n");
        }
        return sb.toString();
    }
}
