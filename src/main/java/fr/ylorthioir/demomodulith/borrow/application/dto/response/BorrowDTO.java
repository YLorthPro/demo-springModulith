package fr.ylorthioir.demomodulith.borrow.application.dto.response;

import java.time.LocalDate;
import java.util.UUID;

public record BorrowDTO (
        UUID id,
        UUID bookId,
        LocalDate borrowDate,
        LocalDate returnDate
){
}
