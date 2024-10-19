package fr.ylorthioir.demomodulith.book.application.mapper;

import fr.ylorthioir.demomodulith.book.application.dto.response.BookDTO;
import fr.ylorthioir.demomodulith.book.domain.entity.Book;

public interface BookApplicationMapper {
    BookDTO toDTO(Book book);
}
