package ro.uvt.info.splab2023.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommandConfig {

    @Autowired
    private BooksService booksService;

    @Bean
    public GetAllBooksCommand getAllBooksCommand() {
        return new GetAllBooksCommand(booksService);
    }

}