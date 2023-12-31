package kz.kbtu.springevent;

import org.springframework.context.ApplicationEvent;


public class UserCreatedEvent extends ApplicationEvent {
    private static final long serialVersionUID = 1L;
    private String name;

    public UserCreatedEvent(Object source, String name) {
        super(source);
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}
