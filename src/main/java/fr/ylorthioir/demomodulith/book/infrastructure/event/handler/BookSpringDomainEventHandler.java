package fr.ylorthioir.demomodulith.book.infrastructure.event.handler;

import fr.ylorthioir.demomodulith.book.application.eventHandler.BookDomainEventHandler;
import fr.ylorthioir.demomodulith.book.application.port.out.BorrowOutputPort;
import fr.ylorthioir.demomodulith.book.domain.event.BookBorrowedDomainEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class BookSpringDomainEventHandler extends BookDomainEventHandler {
    
    public BookSpringDomainEventHandler(BorrowOutputPort borrowOutputPort) {
        super(borrowOutputPort);
    }
    
    @Override
    @EventListener
    public void handleBookBorrowed(BookBorrowedDomainEvent event) {
        super.handleBookBorrowed(event);
    }
    
}
