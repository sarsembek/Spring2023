package kz.kbtu.springevent.service;

import kz.kbtu.springevent.ReturnedEvent;
import kz.kbtu.springevent.UserRemovedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

@Slf4j
public class UserRemovedListener {

    @TransactionalEventListener(phase= TransactionPhase.AFTER_COMPLETION)
    ReturnedEvent handleUserRemovedEvent(UserRemovedEvent event) {

        return new ReturnedEvent();
    }

    @EventListener
    void handleReturnedEvent(ReturnedEvent event) {
        log.info("User removed");
    }
}
