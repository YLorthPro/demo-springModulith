package fr.ylorthioir.demomodulith.book.infrastructure.internal;

import fr.ylorthioir.demomodulith.book.application.mapper.BookApplicationMapper;
import fr.ylorthioir.demomodulith.book.application.port.in.BookInputPort;
import fr.ylorthioir.demomodulith.book.domain.event.BookBorrowedDomainEvent;
import fr.ylorthioir.demomodulith.book.domain.repository.BookDomainRepository;
import fr.ylorthioir.demomodulith.book.domain.service.BookDomainService;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class BookInternalInputAdapter extends BookInputPort {
    public BookInternalInputAdapter(BookDomainRepository bookDomainRepository, BookApplicationMapper bookApplicationMapper, BookDomainService bookDomainService) {
        super(bookDomainRepository, bookApplicationMapper, bookDomainService);
    }
    
    public void bookReturned(UUID bookId) {
        super.returnBook(bookId);
    }
}
