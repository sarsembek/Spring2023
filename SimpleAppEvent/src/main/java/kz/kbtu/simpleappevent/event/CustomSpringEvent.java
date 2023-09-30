package kz.kbtu.simpleappevent.event;

import lombok.Data;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class CustomSpringEvent extends ApplicationEvent {
    private String message;
    public CustomSpringEvent(Object source, String message) {
        super(source);
        this.message = message;
    }
}
