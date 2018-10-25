package com.codeclan.example.HorsesForCourses.components;

import com.codeclan.example.HorsesForCourses.models.Booking;
import com.codeclan.example.HorsesForCourses.models.Course;
import com.codeclan.example.HorsesForCourses.models.Customer;
import com.codeclan.example.HorsesForCourses.repositories.BookingRepository.BookingRepository;
import com.codeclan.example.HorsesForCourses.repositories.CourseRepository.CourseRepository;
import com.codeclan.example.HorsesForCourses.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Dataloader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public Dataloader() {
    }


    @Override
    public void run(ApplicationArguments args) throws Exception {
        Course course1 = new Course("My First Git Repo", "Wick", 1);
        Course course2 = new Course("My First JVM", "Edinburgh", 4);
        courseRepository.save(course1);
        courseRepository.save(course2);

        Customer cust1 = new Customer("Bob", "Glasgow", 20);
        Customer cust2 = new Customer("Alice", "North Berwick", 18);
        Customer cust3 = new Customer("Kevin", "Edinburgh", 30);
        Customer cust4 = new Customer("Jenny", "Edinburgh", 21);

        customerRepository.save(cust1);
        customerRepository.save(cust2);
        customerRepository.save(cust3);
        customerRepository.save(cust4);

        Booking booking1 = new Booking("12-10-2018", cust1, course1);
        Booking booking2 = new Booking("04-09-2018", cust2, course2);
        Booking booking3 = new Booking("04-09-2018", cust3, course2);
        Booking booking4 = new Booking("04-09-2018", cust4, course2);
        bookingRepository.save(booking1);
        bookingRepository.save(booking2);
        bookingRepository.save(booking3);
        bookingRepository.save(booking4);
    }
}
