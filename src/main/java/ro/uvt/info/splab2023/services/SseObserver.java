package ro.uvt.info.splab2023.services;

import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

public class SseObserver implements Observer {
    private final SseEmitter emitter;

    public SseObserver(SseEmitter emitter) {
        this.emitter = emitter;
    }

    @Override
    public void update(Object arg) {
        try {
            emitter.send(arg);
        } catch (Exception e) {
        }
    }


}