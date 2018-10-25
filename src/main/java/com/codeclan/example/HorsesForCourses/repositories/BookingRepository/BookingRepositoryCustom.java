package com.codeclan.example.HorsesForCourses.repositories.BookingRepository;

import com.codeclan.example.HorsesForCourses.models.Booking;

import java.util.List;

public interface BookingRepositoryCustom {
    public List<Booking> getBookingsByDate(String date);
}
