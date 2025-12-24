package com.belajar.spring_dasar;

import com.belajar.spring_dasar.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependsOnTest {

    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(DependsOnConfiguration.class);
    }

    @Test
    void testDependsOn() {
        // Test untuk memastikan bahwa bean dengan dependsOn diinisialisasi terlebih dahulu
        Foo foo = applicationContext.getBean(Foo.class); // Ini akan memicu inisialisasi bean foo
    }
}
