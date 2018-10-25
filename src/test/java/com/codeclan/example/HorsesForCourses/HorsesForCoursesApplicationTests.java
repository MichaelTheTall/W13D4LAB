package com.codeclan.example.HorsesForCourses;

import com.codeclan.example.HorsesForCourses.models.Booking;
import com.codeclan.example.HorsesForCourses.models.Course;
import com.codeclan.example.HorsesForCourses.models.Customer;
import com.codeclan.example.HorsesForCourses.repositories.BookingRepository.BookingRepository;
import com.codeclan.example.HorsesForCourses.repositories.CourseRepository.CourseRepository;
import com.codeclan.example.HorsesForCourses.repositories.CustomerRepository.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HorsesForCoursesApplicationTests {

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canGetCourseByRating(){
		List<Course> results = courseRepository.getCourseByRating(4);
	}

	@Test
	public void canGetCustomersByCourse() {
		List<Customer> results = customerRepository.getCustomerByCourse(2L);
	}

	@Test
	public void canGetCoursesByCustomer() {
		List<Course> results = courseRepository.getCoursesForCustomer(2L);
	}

	@Test
	public void canGetBookingsByDate() {
		List<Booking> results = bookingRepository.getBookingsByDate("04-09-2018");
	}

	@Test
	public void canGetCustomerInTownOnCourse() {
		List<Customer> results = customerRepository.getCustomerByTownAndCourse("glasgow", 1L);
	}
}
