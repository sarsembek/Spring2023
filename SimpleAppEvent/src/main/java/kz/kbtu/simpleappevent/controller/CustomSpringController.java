package kz.kbtu.simpleappevent.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import kz.kbtu.simpleappevent.service.CustomSpringService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CustomSpringController {
    private final CustomSpringService customSpringService;
    @GetMapping("/event")
    String event(@RequestParam String message) throws JsonProcessingException {
        return customSpringService.event(message);
    }
}
