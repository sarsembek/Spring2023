package kz.kbtu.ioc.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class IoCService {
    private static String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public static void doSomething() {
        log.info("Doing something: " + message);
    }
}

