package ro.uvt.info.splab2023.models;

public class Image implements Visitee {
    private String url;
    private ImageContent content;

    public Image(String url) {
        this.url = url;
        this.content = loadImageContent(url);
    }

    private ImageContent loadImageContent(String url) {
        return new ImageContent(url);
    }

    public String getUrl() {
        return url;
    }

    public ImageContent getContent() {
        return content;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitImage(this);
    }
}
