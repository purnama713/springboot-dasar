package com.belajar.spring_dasar;

import com.belajar.spring_dasar.data.MultiFoo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan({
        "com.belajar.spring_dasar.service",
        "com.belajar.spring_dasar.repository",
        "com.belajar.spring_dasar.configuration"
})
@Import(MultiFoo.class)
public class ComponentConfiguration {

}
