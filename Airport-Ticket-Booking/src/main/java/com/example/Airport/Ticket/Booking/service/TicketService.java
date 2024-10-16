package com.example.Airport.Ticket.Booking.service;

import com.example.Airport.Ticket.Booking.dto.ApiResponse;
import com.example.Airport.Ticket.Booking.dto.TicketDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TicketService {

    ApiResponse<TicketDto> createTicket(TicketDto dto);
    ApiResponse<TicketDto> getTicketById(Long id);
    ApiResponse<TicketDto> updateTicketById(Long id, TicketDto dto);
    ApiResponse<TicketDto> deleteTicketById(Long id);
    ApiResponse<List<TicketDto>> getAllTickets();

}
