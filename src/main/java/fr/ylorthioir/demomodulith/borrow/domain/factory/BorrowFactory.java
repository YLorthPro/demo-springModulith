package fr.ylorthioir.demomodulith.borrow.domain.factory;

import fr.ylorthioir.demomodulith.borrow.domain.entity.Borrow;

import java.time.LocalDate;
import java.util.UUID;

public class BorrowFactory {
    public static Borrow build(UUID bookId){
        Borrow borrow = new Borrow();
        borrow.setBookId(bookId);
        borrow.setBorrowDate(LocalDate.now());
        return borrow;
    }
}
