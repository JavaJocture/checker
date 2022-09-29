package jocture.checker.checker;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CheckerExecutor {

    private final List<Checker> checkers;

    @EventListener(ApplicationReadyEvent.class)
    public void executeChecker() {
        checkers.forEach(Checker::check);
    }
}
