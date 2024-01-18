package ro.uvt.info.splab2023.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;
import ro.uvt.info.splab2023.services.SseObserver;
import ro.uvt.info.splab2023.services.Subject;

@CrossOrigin
@RestController
@RequestMapping("/books-sse")
public class BooksSseController {

    private final Subject allBooksSubject;

    public BooksSseController(Subject allBooksSubject) {
        this.allBooksSubject = allBooksSubject;
    }

    @GetMapping
    public SseEmitter getBooksSse() {
        final SseEmitter emitter = new SseEmitter(0L);
        allBooksSubject.attach(new SseObserver(emitter));
        return emitter;
    }

    // Additional methods and logic as needed...
}