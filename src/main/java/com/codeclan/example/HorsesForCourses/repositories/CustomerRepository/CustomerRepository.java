package com.codeclan.example.HorsesForCourses.repositories.CustomerRepository;

import com.codeclan.example.HorsesForCourses.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {
}
