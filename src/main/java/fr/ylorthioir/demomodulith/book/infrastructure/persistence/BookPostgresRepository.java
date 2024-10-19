package fr.ylorthioir.demomodulith.book.infrastructure.persistence;

import fr.ylorthioir.demomodulith.book.domain.entity.Book;
import fr.ylorthioir.demomodulith.book.domain.repository.BookDomainRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public class BookPostgresRepository implements BookDomainRepository {
    
    private final BookSpringDataRepository bookSpringDataRepository;

    public BookPostgresRepository(BookSpringDataRepository bookSpringDataRepository) {
        this.bookSpringDataRepository = bookSpringDataRepository;
    }

    @Override
    public Optional<Book> findById(UUID id) {
        return bookSpringDataRepository.findById(id);
    }

    @Override
    public Book save(Book book) {
        return bookSpringDataRepository.save(book);
    }
}
