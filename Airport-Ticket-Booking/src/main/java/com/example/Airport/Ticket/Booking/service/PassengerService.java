package com.example.Airport.Ticket.Booking.service;

import com.example.Airport.Ticket.Booking.dto.ApiResponse;
import com.example.Airport.Ticket.Booking.dto.PassengerDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PassengerService {

    ApiResponse<PassengerDto> createPassenger(PassengerDto dto);
    ApiResponse<PassengerDto> getPassengerById(Long id);
    ApiResponse<PassengerDto> updatePassengerById(Long id, PassengerDto dto);
    ApiResponse<PassengerDto> deletePassengerById(Long id);
    ApiResponse<List<PassengerDto>> getAllPassengers();

}
