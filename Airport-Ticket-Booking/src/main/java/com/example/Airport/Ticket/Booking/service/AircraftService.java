package com.example.Airport.Ticket.Booking.service;

import com.example.Airport.Ticket.Booking.dto.AircraftDto;
import com.example.Airport.Ticket.Booking.dto.ApiResponse;
import com.example.Airport.Ticket.Booking.model.Aircraft;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AircraftService {

    ApiResponse<Aircraft> createAircraft(AircraftDto aircraftDto);
    ApiResponse<AircraftDto> getAircraftById(Long id);
    ApiResponse<AircraftDto> updateAircraftById(Long id, AircraftDto dto);
    ApiResponse<AircraftDto> deleteAircraftById(Long id);
    ApiResponse<List<AircraftDto>> getAllAircrafts();

}
