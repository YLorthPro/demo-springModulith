package fr.ylorthioir.demomodulith.book.application.dto.request;

import java.time.LocalDate;
import java.util.UUID;

public record BookBorrowDTO(
        UUID bookId,
        LocalDate returnDate
){
}
