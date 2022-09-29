package jocture.checker.external;

import jocture.checker.checker.AbstractChecker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ExternalSystemChecker extends AbstractChecker {

    @Override
    protected void doCheck() {
        checkExternalSystem();
    }

    public void checkExternalSystem() {
        log.debug("TODO... Checking external system...");
        // real check code
    }
}
