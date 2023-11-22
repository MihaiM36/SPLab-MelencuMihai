package ro.uvt.info.splab2023.models;

import java.util.ArrayList;
import java.util.List;

public class Table implements Visitee {
    private String title;
    private List<List<String>> rows;

    public Table(String title) {
        this.title = title;
        this.rows = new ArrayList<>();
    }

    public void addRow(List<String> row) {
        rows.add(row);
    }

    public String getTitle() {
        return title;
    }

    public List<List<String>> getRows() {
        return rows;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTable(this);
    }

}

