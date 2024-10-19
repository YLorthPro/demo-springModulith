package fr.ylorthioir.demomodulith.book.infrastructure.api.mapper;

import fr.ylorthioir.demomodulith.book.application.dto.response.BookDTO;
import fr.ylorthioir.demomodulith.book.application.mapper.BookApplicationMapper;
import fr.ylorthioir.demomodulith.book.domain.entity.Book;
import org.springframework.stereotype.Component;

@Component
public class BookSpringMapper implements BookApplicationMapper {
    @Override
    public BookDTO toDTO(Book book) {
        return new BookDTO(book.getId(),book.getTitle(),book.getAuthor(),book.isAvailable());
    }
}
