package ro.uvt.info.splab2023;

public class Paragraph implements Document {
    private String content;
    private AlignStrategy alignStrategy;

    public Paragraph(String content) {
        this.content = content;
    }

    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
    }

    public void print() {
        if (alignStrategy != null) {
            content = alignStrategy.align(content);
        }
        System.out.println(content);
    }

    /*public String getContent() {
        return content;
    }*/
}

