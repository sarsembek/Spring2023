package kz.kbtu.springevent.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import kz.kbtu.springevent.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EventController {
    private final EventService eventService;
    @GetMapping("/event")
    String event(@RequestParam String name) throws JsonProcessingException {
        return eventService.publishEvent(name);
    }
}
