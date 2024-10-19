package fr.ylorthioir.demomodulith.borrow.infrastructure.event.handler;

import fr.ylorthioir.demomodulith.borrow.application.eventHandler.BorrowDomainEventHandler;
import fr.ylorthioir.demomodulith.borrow.application.service.BorrowApplicationService;
import fr.ylorthioir.demomodulith.borrow.domain.event.BorrowReturnedDomainEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class BorrowReturnedSpringEventHandler extends BorrowDomainEventHandler {
    
    public BorrowReturnedSpringEventHandler(BorrowApplicationService borrowApplicationService) {
        super(borrowApplicationService);
    }

    @Override
    @EventListener
    public void handle(BorrowReturnedDomainEvent event) {
        super.handle(event);
    }
}
