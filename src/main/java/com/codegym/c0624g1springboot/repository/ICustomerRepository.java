package com.codegym.c0624g1springboot.repository;

import com.codegym.c0624g1springboot.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ICustomerRepository extends JpaRepository<Customer, Long> {
}