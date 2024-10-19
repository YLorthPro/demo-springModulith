package fr.ylorthioir.demomodulith.book.application.eventHandler;

import fr.ylorthioir.demomodulith.book.application.port.out.BorrowOutputPort;
import fr.ylorthioir.demomodulith.book.domain.event.BookBorrowedDomainEvent;

public class BookDomainEventHandler {
    
    private final BorrowOutputPort borrowOutputPort;

    public BookDomainEventHandler(BorrowOutputPort borrowOutputPort) {
        this.borrowOutputPort = borrowOutputPort;
    }
    
    public void handleBookBorrowed(BookBorrowedDomainEvent event) {
        borrowOutputPort.borrowBook(event.getBookId());
    }
}
