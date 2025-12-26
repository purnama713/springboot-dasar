package com.belajar.spring_dasar;

import com.belajar.spring_dasar.repository.CategoryRepository;
import com.belajar.spring_dasar.repository.CustomerRepository;
import com.belajar.spring_dasar.repository.ProductRepository;
import com.belajar.spring_dasar.service.CategoryService;
import com.belajar.spring_dasar.service.CustomerService;
import com.belajar.spring_dasar.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    // Test Bean Component
    @Test
    void testService() {
        ProductService productService1 = applicationContext.getBean(ProductService.class);
        ProductService productService2 = applicationContext.getBean("productService", ProductService.class);

        Assertions.assertSame(productService1, productService2);
    }

    // Constructor/Getter Dependency Injection
    @Test
    void testConstructorDependencyInjection() {
        ProductService productService = applicationContext.getBean(ProductService.class);
        ProductRepository productRepository = applicationContext.getBean(ProductRepository.class);

        Assertions.assertSame(productRepository, productService.getProductRepository());
    }

    // Setter Dependency Injection
    @Test
    void testSetterDependencyInjection() {

        CategoryService categoryService = applicationContext.getBean(CategoryService.class);
        CategoryRepository categoryRepository = applicationContext.getBean(CategoryRepository.class);

        Assertions.assertSame(categoryRepository, categoryService.getCategoryRepository());
    }

    // Field Dependency Injection
    @Test
    void testFieldDependencyInjection() {
         CustomerService customerService = applicationContext.getBean(CustomerService.class);

         CustomerRepository normalCustomerRepository = applicationContext.getBean("normalCustomerRepository", CustomerRepository.class);
         CustomerRepository premiumCustomerRepository = applicationContext.getBean("premiumCustomerRepository", CustomerRepository.class);

         Assertions.assertSame(normalCustomerRepository, customerService.getNormalCustomerRepository());
         Assertions.assertSame(premiumCustomerRepository, customerService.getPremiumCustomerRepository());
    }
}
