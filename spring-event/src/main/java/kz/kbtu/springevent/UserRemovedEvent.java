package kz.kbtu.springevent;

public class UserRemovedEvent {
    private String name;

    UserRemovedEvent(String name) {
        this.name = name;
    }
}
