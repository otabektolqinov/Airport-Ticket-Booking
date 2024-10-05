package com.example.Airport.Ticket.Booking.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AirportDto {

    private Long id;
    private String name;
    private String code;
    private String location;
    private List<FlightDto> flights;

}
