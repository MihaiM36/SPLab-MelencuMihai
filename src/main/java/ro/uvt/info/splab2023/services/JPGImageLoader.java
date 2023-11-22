package ro.uvt.info.splab2023.services;

import ro.uvt.info.splab2023.models.ImageContent;

public class JPGImageLoader implements ImageLoader {
    public ImageContent load(String url) {
        return new ImageContent(url);
    }
}
