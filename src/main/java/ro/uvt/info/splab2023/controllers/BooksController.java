package ro.uvt.info.splab2023.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.uvt.info.splab2023.models.*;


@RestController
@RequestMapping("/books")
public class BooksController {
    @GetMapping("/statistics")
    public ResponseEntity<String> printStatistics() {
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.addContent(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.addContent(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.addContent(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.addContent(p4);
        cap1.addContent(new ImageProxy("ImageOne"));
        cap1.addContent(new Image("ImageTwo"));
        cap1.addContent(new Paragraph("Some text"));
        cap1.addContent(new Table("Table 1"));
        BookStatistics stats = new BookStatistics();
        cap1.accept(stats);
        stats.printStatistics();
        return new ResponseEntity<>(stats.getStatistics(), HttpStatus.OK);
    }
}
