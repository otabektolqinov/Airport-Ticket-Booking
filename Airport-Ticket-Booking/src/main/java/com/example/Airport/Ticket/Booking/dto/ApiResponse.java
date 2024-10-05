package com.example.Airport.Ticket.Booking.dto;

import java.util.List;

public class ApiResponse<T> {

    private String message;
    private Integer code;
    private List<ErrorDto> errors;
    private T content;

}
