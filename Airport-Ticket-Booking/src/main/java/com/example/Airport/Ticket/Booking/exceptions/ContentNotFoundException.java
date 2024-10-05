package com.example.Airport.Ticket.Booking.exceptions;

public class ContentNotFoundException extends RuntimeException {
    public ContentNotFoundException(String message) {
        super(message);
    }
}
