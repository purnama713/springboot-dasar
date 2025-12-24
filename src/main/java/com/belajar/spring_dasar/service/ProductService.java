package com.belajar.spring_dasar.service;

import com.belajar.spring_dasar.repository.ProductRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope("prototype") // Jika scopenya dari singleton ingin menjadi prototype
//@Lazy
@Component
public class ProductService {

    @Getter // Lombok Getter
    private ProductRepository productRepository;

    @Autowired // Jika multiple constructor
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductService(ProductRepository productRepository, String name) {
        this.productRepository = productRepository;
    }
}
