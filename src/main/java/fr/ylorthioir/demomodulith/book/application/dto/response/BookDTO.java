package fr.ylorthioir.demomodulith.book.application.dto.response;

import java.util.UUID;

public record BookDTO (
        UUID id, 
        String title,
        String author,
        boolean available
){
}
