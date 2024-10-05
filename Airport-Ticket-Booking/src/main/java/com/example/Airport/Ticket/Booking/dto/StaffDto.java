package com.example.Airport.Ticket.Booking.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StaffDto {

    private Long id;
    private String name;
    private String role;
    private List<FlightDto> assignedFlights;
}
