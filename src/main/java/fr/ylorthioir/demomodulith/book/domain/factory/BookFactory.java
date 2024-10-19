package fr.ylorthioir.demomodulith.book.domain.factory;

import fr.ylorthioir.demomodulith.book.domain.entity.Book;

public class BookFactory {
    public static Book build(
            String title,
            String author,
            boolean available
    ) {
        Book book = new Book();
        book.setTitle(title);
        book.setAuthor(author);
        book.setAvailable(available);
        return book;
    }
}
