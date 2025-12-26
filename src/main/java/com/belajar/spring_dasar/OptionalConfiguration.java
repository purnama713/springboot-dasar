package com.belajar.spring_dasar;

import com.belajar.spring_dasar.data.Bar;
import com.belajar.spring_dasar.data.Foo;
import com.belajar.spring_dasar.data.FooBar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Optional;

@Configuration
public class OptionalConfiguration {

    @Bean
    public Foo foo() {
        return new Foo();
    }

    @Bean
    public FooBar fooBar(Optional<Foo> foo, Optional<Bar> bar) { // menggunakan Optional untuk dependency Foo dan Bar
        return new FooBar(foo.orElse(null), bar.orElse(null)); // jika tidak ada bean Foo atau Bar, gunakan null
    }
}
