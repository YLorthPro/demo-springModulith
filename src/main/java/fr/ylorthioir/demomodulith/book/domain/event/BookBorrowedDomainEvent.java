package fr.ylorthioir.demomodulith.book.domain.event;

import java.util.UUID;

public class BookBorrowedDomainEvent{
    private UUID bookId;

    public BookBorrowedDomainEvent(UUID bookId) {
        this.bookId = bookId;
    }

    public UUID getBookId() {
        return bookId;
    }

    public void setBookId(UUID bookId) {
        this.bookId = bookId;
    }
}
