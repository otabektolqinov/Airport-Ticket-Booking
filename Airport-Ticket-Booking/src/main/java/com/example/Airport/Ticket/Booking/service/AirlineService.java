package com.example.Airport.Ticket.Booking.service;

import com.example.Airport.Ticket.Booking.dto.AirlineDto;
import com.example.Airport.Ticket.Booking.dto.ApiResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AirlineService {

    ApiResponse<AirlineDto> createAirline(AirlineDto dto);
    ApiResponse<AirlineDto> getAirlineById(Integer id);
    ApiResponse<AirlineDto> updateAirlineById(AirlineDto dto, Integer id);
    ApiResponse<AirlineDto> deleteAirlineById(Integer id);
    ApiResponse<List<AirlineDto>> getAllAirlines();

}
