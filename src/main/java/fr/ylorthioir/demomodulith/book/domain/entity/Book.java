package fr.ylorthioir.demomodulith.book.domain.entity;

import fr.ylorthioir.demomodulith.book.domain.exception.BookNotAvailableException;
import fr.ylorthioir.demomodulith.book.domain.event.BookBorrowedDomainEvent;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.data.domain.AbstractAggregateRoot;

import java.util.UUID;

/*
    Note: Si on veut respecter la clean architecture à 100% il faudrait aussi
    retirer les dépendances de jakarta et de spring restante de la couche domain.
    Il faudrait donc par exemple un dao dans la couche infrastructure pour pouvoir
    utiliser les annotations de jakarta. Par simplicité et rapidité, je laisse ça ici.
 */

@Entity
public class Book extends AbstractAggregateRoot<Book>{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String title;
    private String author;
    private boolean available;
    
    public void borrow() {
        if(!available)
            throw new BookNotAvailableException("Book unavailable");
        this.available = false;
        this.registerEvent(new BookBorrowedDomainEvent(id));
    }
    
    public void bookReturn() {
        available = true;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
