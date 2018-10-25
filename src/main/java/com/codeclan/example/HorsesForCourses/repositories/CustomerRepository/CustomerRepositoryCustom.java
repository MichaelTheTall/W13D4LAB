package com.codeclan.example.HorsesForCourses.repositories.CustomerRepository;

import com.codeclan.example.HorsesForCourses.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {
    public List<Customer> getCustomerByCourse(Long courseID);
}
