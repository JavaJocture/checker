package jocture.checker.checker;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ExitCodeGenerator;

@Slf4j
public abstract class AbstractChecker implements Checker, ExitCodeGenerator {

    private int exitCode = 0;

    @Override
    public int getExitCode() {
        return exitCode;
    }

    protected void setExitCodeToError() {
        exitCode = 1;
    }

    @Override
    public void check() { // 템플릿 메서드 패턴 (전략 패턴과 비슷; 전략 패턴은 스프링의 템플릿 콜백 패턴과 유사)
        log.info(">>> Starting Checker... {}", getClass().getSimpleName());
        doCheck();
        log.info(">>> Completed Checker... {}", getClass().getSimpleName());
    }

    protected abstract void doCheck(); // 추상 메서드
}
