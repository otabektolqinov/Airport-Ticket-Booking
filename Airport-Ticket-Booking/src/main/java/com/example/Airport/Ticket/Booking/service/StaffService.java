package com.example.Airport.Ticket.Booking.service;

import com.example.Airport.Ticket.Booking.dto.ApiResponse;
import com.example.Airport.Ticket.Booking.dto.StaffDto;
import org.springframework.stereotype.Service;

@Service
public interface StaffService {

    ApiResponse<StaffDto> createStaff(StaffDto dto);
    ApiResponse<StaffDto> getStaffById(Integer id);
    ApiResponse<StaffDto> updateStaffById(StaffDto dto, Integer id);
    ApiResponse<StaffDto> deleteStaffById(Integer id);
    ApiResponse<StaffDto> getAllStaff();
}
