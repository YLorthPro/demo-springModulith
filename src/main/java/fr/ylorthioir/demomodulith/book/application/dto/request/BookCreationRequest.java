package fr.ylorthioir.demomodulith.book.application.dto.request;

public record BookCreationRequest (
        String title,
        String author,
        boolean available
){ }
