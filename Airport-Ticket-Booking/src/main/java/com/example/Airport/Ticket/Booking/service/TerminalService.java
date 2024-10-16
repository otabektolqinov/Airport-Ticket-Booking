package com.example.Airport.Ticket.Booking.service;

import com.example.Airport.Ticket.Booking.dto.ApiResponse;
import com.example.Airport.Ticket.Booking.dto.TerminalDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TerminalService {

    ApiResponse<TerminalDto> createTerminal(TerminalDto dto);
    ApiResponse<TerminalDto> getTerminalById(Integer id);
    ApiResponse<TerminalDto> updateTerminalById(TerminalDto dto, Integer id);
    ApiResponse<TerminalDto> deleteTerminalById(Integer id);
    ApiResponse<List<TerminalDto>> getAllTerminals();

}
