package fr.ylorthioir.demomodulith.book.infrastructure.persistence;

import fr.ylorthioir.demomodulith.book.domain.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BookSpringDataRepository extends JpaRepository<Book, UUID>{
}
