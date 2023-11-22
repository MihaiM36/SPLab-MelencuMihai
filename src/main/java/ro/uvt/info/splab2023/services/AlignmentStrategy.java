package ro.uvt.info.splab2023.services;

import ro.uvt.info.splab2023.models.Context;
import ro.uvt.info.splab2023.models.Paragraph;

public interface AlignmentStrategy{
        void render(Paragraph paragraph, Context context);

}
