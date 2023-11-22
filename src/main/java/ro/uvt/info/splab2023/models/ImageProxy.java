package ro.uvt.info.splab2023.models;

import java.awt.*;

public class ImageProxy implements Visitee {
    private String url;
    private Image realImage;

    public ImageProxy(String url) {
        this.url = url;
        this.realImage = null;
    }

    public String getUrl() {
        return url;
    }

    public Image loadImage() {
        if (realImage == null) {
            realImage = new Image(url);
        }
        return realImage;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitImageProxy(this);
        // Optionally, load and render the real image as part of the visit
        if (realImage != null) {
            realImage.accept(visitor);
        }
    }
}

