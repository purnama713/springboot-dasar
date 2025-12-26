package com.belajar.spring_dasar.service;

import com.belajar.spring_dasar.repository.CustomerRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {

    // Field Dependency Injection
//    @Getter
//    @Autowired
//    private CustomerRepository customerRepository;

    // Menggunakan Qualifier untuk membedakan dua bean CustomerRepository
    @Getter
    @Autowired
    @Qualifier("normalCustomerRepository")
    private CustomerRepository normalCustomerRepository;

    @Getter
    @Autowired
    @Qualifier("premiumCustomerRepository")
    private CustomerRepository premiumCustomerRepository;
}
