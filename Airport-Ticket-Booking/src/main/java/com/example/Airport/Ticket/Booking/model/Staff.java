package com.example.Airport.Ticket.Booking.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Staff {

    private Long id;
    private String name;
    private String role;
    private List<Flight> assignedFlights;

}
