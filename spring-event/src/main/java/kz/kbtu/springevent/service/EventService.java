package kz.kbtu.springevent.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import kz.kbtu.springevent.UserCreatedEvent;
import kz.kbtu.springevent.UserRemovedEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;



@Service
@Slf4j
@RequiredArgsConstructor
public class EventService {
    private final ApplicationEventPublisher publisher;

    public String publishEvent(final String name) throws JsonProcessingException {
        log.info("Event created: " + name);
        publisher.publishEvent(new UserCreatedEvent(this, name));
        publisher.publishEvent(new UserRemovedEvent(name));
        return name;
    }
}
