package com.belajar.spring_dasar;

import com.belajar.spring_dasar.data.Bar;
import com.belajar.spring_dasar.data.Foo;
import com.belajar.spring_dasar.data.FooBar;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class DependencyInjectionConfiguration {

//    @Bean
//    public Foo foo() {
//        return new Foo();
//    }

    // Memilih bean mana yang akan di-inject ketika ada lebih dari satu bean dengan tipe yang sama
    @Primary
    @Bean
    public Foo fooFirst() {
        return new Foo();
    }

    @Bean
    public Foo fooSecond() {
        return new Foo();
    }

    @Bean
    public Bar bar() {
        return new Bar();
    }

//    @Bean
//    public FooBar fooBar(Foo foo, Bar bar) {
//        return new FooBar(foo, bar);
//    }

    // Menggunakan @Qualifier untuk menentukan bean mana yang akan di-inject
    @Bean
    public FooBar fooBar(@Qualifier("fooSecond") Foo foo, Bar bar) {
        return new FooBar(foo, bar);
    }

}
