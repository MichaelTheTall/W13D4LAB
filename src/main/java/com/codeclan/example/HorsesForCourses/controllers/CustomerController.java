package com.codeclan.example.HorsesForCourses.controllers;

import com.codeclan.example.HorsesForCourses.models.Customer;
import com.codeclan.example.HorsesForCourses.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/course/{id}")
    public List<Customer> getCustomerByCourse(@PathVariable Long id) {
        return customerRepository.getCustomerByCourse(id);
    }

    @GetMapping(value = "/towncourse/{town}/{id}")
    public List<Customer> getCustomerByTownAndCourse(@PathVariable String town, @PathVariable Long id) {
        return customerRepository.getCustomerByTownAndCourse(town, id);
    }

    @GetMapping(value = "/agetowncourse/{age}/{town}/{id}")
    public List<Customer> getCustomerOverAgeByTownAndCourse(@PathVariable int age, @PathVariable String town, @PathVariable Long id) {
        return customerRepository.getCustomerOverAgeByTownAndCourse(age,town,id);
    }
}
