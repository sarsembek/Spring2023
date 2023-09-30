package kz.kbtu.simpleappevent;

import kz.kbtu.simpleappevent.service.CustomSpringEventPublisher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SimpleAppEventApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleAppEventApplication.class, args);
    }

}
