package fr.ylorthioir.demomodulith.borrow.application.eventHandler;

import fr.ylorthioir.demomodulith.borrow.application.service.BorrowApplicationService;
import fr.ylorthioir.demomodulith.borrow.domain.event.BorrowReturnedDomainEvent;

public class BorrowDomainEventHandler {
    private final BorrowApplicationService borrowApplicationService;

    public BorrowDomainEventHandler(BorrowApplicationService borrowApplicationService) {
        this.borrowApplicationService = borrowApplicationService;
    }
    
    public void handle(BorrowReturnedDomainEvent event) {
        borrowApplicationService.bookReturned(event.getBorrowId());
    }
}
