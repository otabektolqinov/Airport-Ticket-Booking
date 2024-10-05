package com.example.Airport.Ticket.Booking.dto;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PassengerDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String passportNumber;
    private String contractDetails;
    private TicketDto ticket;

}
