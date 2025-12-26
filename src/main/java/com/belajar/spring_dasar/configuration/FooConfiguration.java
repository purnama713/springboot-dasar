package com.belajar.spring_dasar.configuration;

import com.belajar.spring_dasar.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class FooConfiguration {

    @Bean
    @Primary // Agar tidak merusak unit test sebelumnya
    public Foo foo() {
        return new Foo();
    }

    // Object Provider
    @Bean
    public Foo foo2() {
        return new Foo();
    }

    @Bean
    public Foo foo3() {
        return new Foo();
    }

}
