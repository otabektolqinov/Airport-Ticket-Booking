package com.example.Airport.Ticket.Booking.dto;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FlightDto {

    private Long id;
    private String flightNumber;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private AirportDto departureAirport;
    private AirportDto arrivalAirport;
    private AircraftDto aircraft;

    private List<PassengerDto> passengers;

}
