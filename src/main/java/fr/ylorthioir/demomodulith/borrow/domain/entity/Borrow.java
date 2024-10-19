package fr.ylorthioir.demomodulith.borrow.domain.entity;

import fr.ylorthioir.demomodulith.borrow.domain.event.BorrowReturnedDomainEvent;
import fr.ylorthioir.demomodulith.borrow.domain.exception.BookBorrowedAlreadyReturnedException;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.data.domain.AbstractAggregateRoot;

import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Borrow extends AbstractAggregateRoot<Borrow> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private UUID bookId;
    private LocalDate borrowDate;
    private LocalDate returnDate;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getBookId() {
        return bookId;
    }

    public void setBookId(UUID bookId) {
        this.bookId = bookId;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public void isReturned() {
        if(returnDate != null)
            throw new BookBorrowedAlreadyReturnedException("Book already returned");
        
        returnDate = LocalDate.now();
        this.registerEvent(new BorrowReturnedDomainEvent(this.id));
    }
}
