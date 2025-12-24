package com.belajar.spring_dasar;

import com.belajar.spring_dasar.data.Bar;
import com.belajar.spring_dasar.data.Foo;
import com.belajar.spring_dasar.data.FooBar;
import org.springframework.context.annotation.Bean;

public class DependencyInjectionConfiguration {

    @Bean
    public Foo foo() {
        return new Foo();
    }

    @Bean
    public Bar bar() {
        return new Bar();
    }

    @Bean
    public FooBar fooBar(Foo foo, Bar bar) {
        return new FooBar(foo, bar);
    }

}
