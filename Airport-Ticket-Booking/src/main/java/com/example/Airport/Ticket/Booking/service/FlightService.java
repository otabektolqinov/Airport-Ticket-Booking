package com.example.Airport.Ticket.Booking.service;

import com.example.Airport.Ticket.Booking.dto.ApiResponse;
import com.example.Airport.Ticket.Booking.dto.FlightDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FlightService {

    ApiResponse<FlightDto> createFlight(FlightDto dto);
    ApiResponse<FlightDto> getFlightById(Long id);
    ApiResponse<FlightDto> updateFlightById(Long id, FlightDto dto);
    ApiResponse<FlightDto> deleteFlightById(Long id);
    ApiResponse<List<FlightDto>> getAllFlights();
}
