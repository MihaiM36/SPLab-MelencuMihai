package ro.uvt.info.splab2023.models;

import ro.uvt.info.splab2023.services.AlignmentStrategy;

public class Paragraph implements Visitee {
    private String text;
    private AlignmentStrategy alignStrategy;

    public Paragraph(String text) {
        this.text = text;

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public AlignmentStrategy getAlignStrategy() {
        return alignStrategy;
    }

    public void setAlignStrategy(AlignmentStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitParagraph(this);
    }

}