package ro.uvt.info.splab2023.models;

public interface Element {
    void print();
    void add(Element element);
    void remove(Element element);
    Element get(int index);

    void accept(TableOfContentUpdate tableOfContentUpdate);
}
