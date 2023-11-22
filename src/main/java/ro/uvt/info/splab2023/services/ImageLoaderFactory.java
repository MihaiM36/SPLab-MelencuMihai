package ro.uvt.info.splab2023.services;

public class ImageLoaderFactory {
    public ImageLoader create(String format) {
        if (format.equalsIgnoreCase("bmp")) {
            return new BMPLoader();
        } else if (format.equalsIgnoreCase("jpg")) {
            return new JPGImageLoader();
        } else {
            throw new IllegalArgumentException("Unsupported format: " + format);
        }
    }

}
