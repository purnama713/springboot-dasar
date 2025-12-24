package com.belajar.spring_dasar;

import com.belajar.spring_dasar.data.Bar;
import com.belajar.spring_dasar.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

@Slf4j
@Configuration
public class DependsOnConfiguration {

    @Lazy // Agar bean foo tidak langsung diinisialisasi saat konteks dibuat
    @Bean
    @DependsOn({"bar"})
    public Foo foo() {
        log.info("Create Foo");
        return new Foo();
    }

    @Bean
    public Bar bar() {
        log.info("Create Bar");
        return new Bar();
    }
}
