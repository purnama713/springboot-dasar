package com.belajar.spring_dasar;

import com.belajar.spring_dasar.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Slf4j
@Configuration
public class ScopeConfiguration {

    @Bean
    @Scope("prototype") // Set scope bean menjadi prototype atau lainnya: singleton, request, session, application
    public Foo foo() {
        log.info("Create Foo");
        return new Foo();
    }

}
