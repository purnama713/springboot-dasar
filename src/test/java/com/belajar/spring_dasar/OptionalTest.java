package com.belajar.spring_dasar;

import com.belajar.spring_dasar.data.Foo;
import com.belajar.spring_dasar.data.FooBar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OptionalTest {

    // Optional DI hanya mengambil bean jika ada, jika tidak ada maka null
    // contoh di OptionalConfiguration hanya ada bean Foo, tidak ada bean Bar

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(OptionalConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    // Test Optional Dependency Injection
    @Test
    void testOptional() {
        Foo foo = applicationContext.getBean(Foo.class);
        FooBar fooBar = applicationContext.getBean(FooBar.class);

        Assertions.assertNull(fooBar.getBar()); // Bar tidak ada di OptionalConfiguration, harusnya null
        Assertions.assertSame(foo, fooBar.getFoo()); // Foo ada, harusnya sama
    }
}
