package fr.ylorthioir.demomodulith.book.application.port.out;

import java.util.UUID;

public interface BorrowOutputPort {
    void borrowBook(UUID bookId);
}
