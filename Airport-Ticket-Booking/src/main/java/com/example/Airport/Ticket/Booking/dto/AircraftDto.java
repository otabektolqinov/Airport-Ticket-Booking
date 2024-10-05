package com.example.Airport.Ticket.Booking.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AircraftDto {

    private Long id;
    private String model;
    private int capacity;
    private AirlineDto airline;

}
