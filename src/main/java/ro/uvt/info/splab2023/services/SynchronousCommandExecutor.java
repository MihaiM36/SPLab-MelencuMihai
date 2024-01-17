package ro.uvt.info.splab2023.services;

import org.springframework.stereotype.Component;

@Component
public class SynchronousCommandExecutor implements CommandExecutor {
    @Override
    public String execute(Command command) {
        return command.execute();
    }
}
