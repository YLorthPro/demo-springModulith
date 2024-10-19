package fr.ylorthioir.demomodulith.book.application.port.in;

import fr.ylorthioir.demomodulith.book.application.dto.request.BookCreationRequest;
import fr.ylorthioir.demomodulith.book.application.dto.response.BookDTO;
import fr.ylorthioir.demomodulith.book.application.mapper.BookApplicationMapper;
import fr.ylorthioir.demomodulith.book.domain.entity.Book;
import fr.ylorthioir.demomodulith.book.domain.repository.BookDomainRepository;
import fr.ylorthioir.demomodulith.book.domain.service.BookDomainService;

import java.util.UUID;

public class BookInputPort {
    private final BookDomainRepository bookDomainRepository;
    private final BookApplicationMapper bookApplicationMapper;
    private final BookDomainService bookDomainService;

    public BookInputPort(BookDomainRepository bookDomainRepository,
                         BookApplicationMapper bookApplicationMapper,
                         BookDomainService bookDomainService) {
        this.bookDomainRepository = bookDomainRepository;
        this.bookApplicationMapper = bookApplicationMapper;
        this.bookDomainService = bookDomainService;
    }
    
    public BookDTO createBook(BookCreationRequest request){
        Book book = bookDomainService.createBook(request.title(), request.author(), request.available());
        return bookApplicationMapper.toDTO(book);
    }

    public BookDTO borrowBook(UUID bookId) {
        Book book = bookDomainRepository.findById(bookId).orElseThrow(() -> new RuntimeException("Livre non trouvé"));
        book.borrow();
        book = bookDomainRepository.save(book);
        return bookApplicationMapper.toDTO(book);
    }
    
    public BookDTO returnBook(UUID bookId) {
        Book book = bookDomainRepository.findById(bookId).orElseThrow(() -> new RuntimeException("Livre non trouvé"));
        book.bookReturn();
        book = bookDomainRepository.save(book);
        return bookApplicationMapper.toDTO(book);
    }
}
