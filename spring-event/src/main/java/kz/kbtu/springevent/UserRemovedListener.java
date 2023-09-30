package kz.kbtu.springevent;

import org.springframework.context.event.EventListener;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

public class UserRemovedListener {

    @TransactionalEventListener(phase= TransactionPhase.AFTER_COMPLETION)
    ReturnedEvent handleUserRemovedEvent(UserRemovedEvent event) {

        return new ReturnedEvent();
    }

    @EventListener
    void handleReturnedEvent(ReturnedEvent event) {
        // handle ReturnedEvent ...
    }

    @EventListener(condition = "#event.name eq 'reflectoring'")
    void handleConditionalListener(UserRemovedEvent event) {
        // handle UserRemovedEvent
    }
}
