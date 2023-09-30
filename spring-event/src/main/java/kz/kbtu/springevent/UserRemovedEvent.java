package kz.kbtu.springevent;

public class UserRemovedEvent {
    private String name;

    public UserRemovedEvent(String name) {
        this.name = name;
    }
}
