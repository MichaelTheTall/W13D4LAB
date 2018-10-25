package com.codeclan.example.HorsesForCourses.repositories.BookingRepository;

import com.codeclan.example.HorsesForCourses.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {
    public List<Booking> getBookingsByDate(String date);
}
