package ro.uvt.info.splab2023.services;

import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class BooksService {
    private final Map<String, String> books = new HashMap<>();

    public String getAllBooks() {
        return books.values().toString();
    }

    public String getBookById(String id) {
        return books.getOrDefault(id, "Book not found");
    }

    public String addBook(String book) {
        String id = String.valueOf(books.size() + 1); // Generate a simple ID
        books.put(id, book);
        return "Book added with ID: " + id;
    }

    public String updateBook(String id, String book) {
        if (books.containsKey(id)) {
            books.put(id, book);
            return "Book updated with ID: " + id;
        } else {
            return "Book not found with ID: " + id;
        }
    }

    public String deleteBook(String id) {
        if (books.containsKey(id)) {
            books.remove(id);
            return "Book deleted with ID: " + id;
        } else {
            return "Book not found with ID: " + id;
        }
    }
}