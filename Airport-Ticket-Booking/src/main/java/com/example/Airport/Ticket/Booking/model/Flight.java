package com.example.Airport.Ticket.Booking.model;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Flight {

    private Long id;
    private String flightNumber;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private Airport departureAirport;
    private Airport arrivalAirport;
    private Aircraft aircraft;

    private List<Passenger> passengers;
}
