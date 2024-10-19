package fr.ylorthioir.demomodulith.borrow.application.port.out;

import fr.ylorthioir.demomodulith.borrow.application.dto.response.BorrowDTO;

public interface BookOutputPort {
    void returnedBook(BorrowDTO borrowDTO);
}
