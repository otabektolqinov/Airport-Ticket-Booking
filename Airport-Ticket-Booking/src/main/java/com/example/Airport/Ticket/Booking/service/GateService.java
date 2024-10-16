package com.example.Airport.Ticket.Booking.service;

import com.example.Airport.Ticket.Booking.dto.ApiResponse;
import com.example.Airport.Ticket.Booking.dto.GateDto;
import org.springframework.stereotype.Service;

@Service
public interface GateService {

    ApiResponse<GateDto> createGate(GateDto dto);
    ApiResponse<GateDto> getGateById(Integer id);
    ApiResponse<GateDto> updateGateById(GateDto dto, Integer id);
    ApiResponse<GateDto> deleteGateById(Integer id);
    ApiResponse<GateDto> getAllGates();

}
