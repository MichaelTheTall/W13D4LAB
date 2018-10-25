package com.codeclan.example.HorsesForCourses.repositories.CustomerRepository;

import com.codeclan.example.HorsesForCourses.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {
    public List<Customer> getCustomerByCourse(Long courseID);
    public List<Customer> getCustomerByTownAndCourse(String town, Long courseID);
    public List<Customer> getCustomerOverAgeByTownAndCourse(int age, String town, Long courseID);
}
