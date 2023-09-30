package kz.kbtu.simpleappevent.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import kz.kbtu.simpleappevent.event.CustomSpringEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class CustomSpringService {
    private final ApplicationEventPublisher eventPublisher;

    public String event(String message) throws JsonProcessingException {
        Thread customThread = new Thread();
        customThread.start();
        log.info(Thread.currentThread().getName());
        log.info("service:" + message);
        CustomSpringEvent event = new CustomSpringEvent(this, message);
        eventPublisher.publishEvent(event);
        return message;
    }

}

