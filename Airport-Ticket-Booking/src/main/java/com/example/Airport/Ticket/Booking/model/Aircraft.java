package com.example.Airport.Ticket.Booking.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Aircraft {

    private Long id;
    private String model;
    private int capacity;
    private Airline airline;

}
