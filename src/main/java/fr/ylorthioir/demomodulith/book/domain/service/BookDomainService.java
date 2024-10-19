package fr.ylorthioir.demomodulith.book.domain.service;

import fr.ylorthioir.demomodulith.book.domain.entity.Book;
import fr.ylorthioir.demomodulith.book.domain.factory.BookFactory;
import fr.ylorthioir.demomodulith.book.domain.repository.BookDomainRepository;

/*
    Note: Le bean est instancié dans la couche infrastructure puisque cela vient du framework
    Spring (infrastructure/config/bean/...).
 */
public class BookDomainService {
    private final BookDomainRepository bookDomainRepository;
    
    public BookDomainService(BookDomainRepository bookDomainRepository) {
        this.bookDomainRepository = bookDomainRepository;
    }
    
    public Book createBook(String title, String author, boolean available) {
        Book book = BookFactory.build(title, author, available);
        return bookDomainRepository.save(book);
    }
    
    
}
