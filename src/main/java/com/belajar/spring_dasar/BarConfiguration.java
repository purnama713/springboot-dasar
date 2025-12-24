package com.belajar.spring_dasar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BarConfiguration {

    @Bean
    public String bar() {
        return "Bar Bean";
    }

}
