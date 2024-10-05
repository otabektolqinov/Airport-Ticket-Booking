package com.example.Airport.Ticket.Booking.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Terminal {

    private Long id;
    private String name;
    private List<Gate> gates;
}
