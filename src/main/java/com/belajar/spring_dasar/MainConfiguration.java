package com.belajar.spring_dasar;

import com.belajar.spring_dasar.configuration.BarConfiguration;
import com.belajar.spring_dasar.configuration.FooConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
    FooConfiguration.class,
    BarConfiguration.class
})
public class MainConfiguration {

}
