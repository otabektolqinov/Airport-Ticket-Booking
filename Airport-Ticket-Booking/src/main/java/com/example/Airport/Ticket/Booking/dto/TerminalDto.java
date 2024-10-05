package com.example.Airport.Ticket.Booking.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TerminalDto {

    private Long id;
    private String name;
    private List<GateDto> gates;

}
