package com.example.Airport.Ticket.Booking.model;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Ticket {

    private Long id;
    private Flight flight;
    private String seatNumber;
    private Double price;
    private LocalDateTime bookingDate;

}
