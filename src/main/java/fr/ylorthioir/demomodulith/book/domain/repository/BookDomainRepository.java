package fr.ylorthioir.demomodulith.book.domain.repository;

import fr.ylorthioir.demomodulith.book.domain.entity.Book;

import java.util.Optional;
import java.util.UUID;

public interface BookDomainRepository {
    Optional<Book> findById(UUID id);
    Book save(Book book);
}
