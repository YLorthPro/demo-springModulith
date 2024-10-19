package fr.ylorthioir.demomodulith.book.infrastructure.config.beans.domain.service;

import fr.ylorthioir.demomodulith.book.domain.repository.BookDomainRepository;
import fr.ylorthioir.demomodulith.book.domain.service.BookDomainService;
import org.springframework.stereotype.Component;

@Component
public class BookSpringDomainService extends BookDomainService {
    public BookSpringDomainService(BookDomainRepository bookDomainRepository) {
        super(bookDomainRepository);
    }
}
