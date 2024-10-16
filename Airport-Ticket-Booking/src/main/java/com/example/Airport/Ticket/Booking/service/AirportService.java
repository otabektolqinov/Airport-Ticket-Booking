package com.example.Airport.Ticket.Booking.service;

import com.example.Airport.Ticket.Booking.dto.AirportDto;
import com.example.Airport.Ticket.Booking.dto.ApiResponse;
import org.springframework.stereotype.Service;

@Service
public interface AirportService {

    ApiResponse<AirportDto> createAirport(AirportDto dto);
    ApiResponse<AirportDto> getAirportById(Integer id);
    ApiResponse<AirportDto> updateAirportById(AirportDto dto, Integer id);
    ApiResponse<AirportDto> deleteAirportById(Integer id);
    ApiResponse<AirportDto> getAllAirports();

}
