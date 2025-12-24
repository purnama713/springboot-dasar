package com.belajar.spring_dasar;

import com.belajar.spring_dasar.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeTest {

    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
         applicationContext = new AnnotationConfigApplicationContext(ScopeConfiguration.class);
    }

    @Test
    void testPrototypeScope() {
        // Test untuk memastikan bahwa bean dengan scope prototype menghasilkan instance baru setiap kali diambil
        Foo foo1 = applicationContext.getBean(Foo.class);
        Foo foo2 = applicationContext.getBean(Foo.class);
        Foo foo3 = applicationContext.getBean(Foo.class);

        Assertions.assertNotSame(foo1, foo2); // Memastikan bahwa kedua instance berbeda
        Assertions.assertNotSame(foo1, foo3);
        Assertions.assertNotSame(foo2, foo3);
    }

    // Test untuk scope custom doubleton
    @Test
    void testDoubletonScope() {
        // Test untuk memastikan bahwa bean dengan scope doubleton menghasilkan dua instance yang bergantian
        var bar1 = applicationContext.getBean("bar");
        var bar2 = applicationContext.getBean("bar");
        var bar3 = applicationContext.getBean("bar");
        var bar4 = applicationContext.getBean("bar");

        Assertions.assertNotSame(bar1, bar2); // Memastikan bahwa kedua instance berbeda
        Assertions.assertSame(bar1, bar3);    // Memastikan bahwa instance pertama dan ketiga sama
        Assertions.assertSame(bar2, bar4);    // Memastikan bahwa instance kedua dan keempat sama
    }
}
