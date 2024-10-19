package fr.ylorthioir.demomodulith.book.infrastructure.bridge.mapper;

import fr.ylorthioir.demomodulith.book.application.dto.request.BookBorrowDTO;
import fr.ylorthioir.demomodulith.borrow.application.dto.response.BorrowDTO;
import org.springframework.stereotype.Component;

@Component
public class BorrowToBookBridgeMapper {
    public BookBorrowDTO toBookBorrowDTO (BorrowDTO dto){
        return new BookBorrowDTO(dto.bookId(), dto.borrowDate());
    }
}
