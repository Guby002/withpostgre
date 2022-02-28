package com.example.withpostgre.error;

public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public BookNotFoundException() {
    }

    public BookNotFoundException(String message) {
        super(message);
    }
}