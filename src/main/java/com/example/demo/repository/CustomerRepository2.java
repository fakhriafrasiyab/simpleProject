package com.example.demo.repository;

import com.example.demo.model.CustomerDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


public interface CustomerRepository2 extends JpaRepository<CustomerDto,Integer> {
}
