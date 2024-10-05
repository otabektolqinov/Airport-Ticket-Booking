package com.example.Airport.Ticket.Booking.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TicketDto {

    private Long id;
    private FlightDto flight;
    private String seatNumber;
    private Double price;
    private LocalDateTime bookingDate;

}
