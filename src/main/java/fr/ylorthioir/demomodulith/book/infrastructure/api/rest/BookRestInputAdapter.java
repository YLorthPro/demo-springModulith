package fr.ylorthioir.demomodulith.book.infrastructure.api.rest;


import fr.ylorthioir.demomodulith.book.application.dto.request.BookCreationRequest;
import fr.ylorthioir.demomodulith.book.application.dto.response.BookDTO;
import fr.ylorthioir.demomodulith.book.application.mapper.BookApplicationMapper;
import fr.ylorthioir.demomodulith.book.application.port.in.BookInputPort;
import fr.ylorthioir.demomodulith.book.domain.repository.BookDomainRepository;
import fr.ylorthioir.demomodulith.book.domain.service.BookDomainService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.reactive.TransactionalOperator;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/books")
public class BookRestInputAdapter extends BookInputPort {
    
    public BookRestInputAdapter(BookDomainRepository bookDomainRepository, BookApplicationMapper bookApplicationMapper, BookDomainService bookDomainService) {
        super(bookDomainRepository, bookApplicationMapper, bookDomainService);
    }
    
    @PostMapping
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public BookDTO createBook(@RequestBody BookCreationRequest request) {
        return super.createBook(request);
    }

    @PostMapping("/{id}/borrow")
    public BookDTO borrowBook(@PathVariable UUID id) {
        return super.borrowBook(id);
    }

    @PostMapping("/{id}/return")
    public BookDTO returnBook(@PathVariable UUID id) {
        return super.returnBook(id);
    }
}
