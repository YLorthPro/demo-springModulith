package fr.ylorthioir.demomodulith.borrow.domain.exception;

public class BookBorrowedAlreadyReturnedException extends RuntimeException{
    public BookBorrowedAlreadyReturnedException(String message) {
        super(message);
    }
}
