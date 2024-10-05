package com.example.Airport.Ticket.Booking.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GateDto {

    private Long id;
    private String number;
    private TerminalDto terminal;
    private List<FlightDto> assignedFlights;

}
