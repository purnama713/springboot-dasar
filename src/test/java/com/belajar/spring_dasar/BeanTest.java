package com.belajar.spring_dasar;

import com.belajar.spring_dasar.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanTest {

    @Test
    void testCreateBean() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);

        Assertions.assertNotNull(context);
    }

    @Test
    void testGetBean() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);

        // Dipanggil atau tidaknya, getBean objectnya sudah ada di AppContext
        // terlebih dahulu
        Foo foo1 = context.getBean(Foo.class);
        Foo foo2 = context.getBean(Foo.class);

        // Jika getBean berkali-kali atau dengan objek yang sama
        // mengembalikan objek yang itu-itu juga
        Assertions.assertSame(foo1, foo2);
    }
}
