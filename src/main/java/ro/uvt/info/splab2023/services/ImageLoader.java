package ro.uvt.info.splab2023.services;

import ro.uvt.info.splab2023.models.ImageContent;

public interface ImageLoader{
    ImageContent load(String url);
}
