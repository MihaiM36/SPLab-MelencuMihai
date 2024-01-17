package ro.uvt.info.splab2023;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ro.uvt.info.splab2023.models.*;


@SpringBootApplication
public class SpLabApplication {



    public static void main (String[]args){
        SpringApplication.run(SpLabApplication.class, args);
        createTableOfContent();
    }


    public static void createTableOfContent () {
        Book b = new Book("The book");
        Section cap1 = new Section("Chapter 1");
        Section cap11 = new Section("Subchapter 1.1");
        Section cap2 = new Section("Chapter 2");

        cap1.addContent(new Paragraph("Paragraph 1"));
        cap1.addContent(new Paragraph("Paragraph 2"));
        cap1.addContent(new Paragraph("Paragraph 3"));

        cap11.addContent(new ImageProxy("ImageOne"));
        cap11.addContent(new Image("ImageTwo"));
        cap1.addContent(cap11);

        Paragraph p4 = new Paragraph("Paragraph 4"); // Correctly defined here
        cap2.addContent(p4);

        cap1.addContent(new Paragraph("Some text"));
        cap1.addContent(new Table("Table 1"));
        b.addContent(cap1);
        b.addContent(cap2);

        // Use the visitor to create the table of contents
        TableOfContentUpdate tocUpdate = new TableOfContentUpdate();
        b.accept(tocUpdate);

        // Render the table of contents
        tocUpdate.getToC().accept(new RenderContentVisitor());
    }
}