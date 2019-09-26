package com.example.demo.controller;

import com.example.demo.model.CustomerDto;
import com.example.demo.repository.CustomerRepository2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController2 {

    @Autowired
    CustomerRepository2 customerRepository2;

    @GetMapping(value = "/all")
    public List<CustomerDto> getAll() {
        return customerRepository2.findAll();
    }

    @PostMapping(value = "/load")
    public List<CustomerDto> persist(@RequestBody final CustomerDto customerDto) {
        customerRepository2.save(customerDto);
        return customerRepository2.findAll();
    }
}
