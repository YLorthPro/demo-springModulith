package fr.ylorthioir.demomodulith.borrow.domain.event;

import java.util.UUID;

public class BorrowReturnedDomainEvent{
    private final UUID borrowId;

    public BorrowReturnedDomainEvent(UUID borrowId) {
        this.borrowId = borrowId;
    }
    
    public UUID getBorrowId() {
        return borrowId;
    }
}
