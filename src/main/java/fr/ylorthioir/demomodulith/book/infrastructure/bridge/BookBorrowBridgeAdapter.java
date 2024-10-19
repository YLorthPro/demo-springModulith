package fr.ylorthioir.demomodulith.book.infrastructure.bridge;

import fr.ylorthioir.demomodulith.book.application.dto.request.BookBorrowDTO;
import fr.ylorthioir.demomodulith.book.infrastructure.bridge.mapper.BorrowToBookBridgeMapper;
import fr.ylorthioir.demomodulith.book.infrastructure.internal.BookInternalInputAdapter;
import fr.ylorthioir.demomodulith.borrow.application.dto.response.BorrowDTO;
import fr.ylorthioir.demomodulith.borrow.application.port.out.BookOutputPort;
import org.springframework.stereotype.Component;

@Component
public class BookBorrowBridgeAdapter implements BookOutputPort {
    
    private final BookInternalInputAdapter bookInternalInputAdapter;
    private final BorrowToBookBridgeMapper borrowToBookBridgeMapper;
    
    public BookBorrowBridgeAdapter(BookInternalInputAdapter bookInternalInputAdapter, BorrowToBookBridgeMapper borrowToBookBridgeMapper) {
        this.bookInternalInputAdapter = bookInternalInputAdapter;
        this.borrowToBookBridgeMapper = borrowToBookBridgeMapper;
    }
    
    @Override
    public void returnedBook(BorrowDTO borrowDTO) {
        BookBorrowDTO dto = borrowToBookBridgeMapper.toBookBorrowDTO(borrowDTO);
        System.out.println("Book returned at: " + dto.returnDate());
        bookInternalInputAdapter.bookReturned(dto.bookId());
    }
}
