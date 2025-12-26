package com.belajar.spring_dasar;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({
        "com.belajar.spring_dasar.service",
        "com.belajar.spring_dasar.repository",
        "com.belajar.spring_dasar.configuration"
})
public class ComponentConfiguration {

}
