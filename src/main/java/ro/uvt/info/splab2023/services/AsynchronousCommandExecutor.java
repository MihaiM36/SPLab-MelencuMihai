package ro.uvt.info.splab2023.services;

import org.springframework.stereotype.Component;

import java.util.concurrent.*;

@Component
public class AsynchronousCommandExecutor implements CommandExecutor {

    private ExecutorService executorService = Executors.newFixedThreadPool(10);

    @Override
    public String execute(Command command) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(command::execute, executorService);
        // You might want to handle the result or completion of the future here
        return "Request is being processed asynchronously";
    }
}