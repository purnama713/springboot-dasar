package com.belajar.spring_dasar;

import com.belajar.spring_dasar.data.Bar;
import com.belajar.spring_dasar.data.Foo;
import com.belajar.spring_dasar.scope.DoubletonScope;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
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

    // Registrasi custom scope
    @Bean
    public CustomScopeConfigurer customScopeConfigurer() {
        CustomScopeConfigurer configurer = new CustomScopeConfigurer();
        configurer.addScope("doubleton", new DoubletonScope());
        return configurer;
    }

    @Bean
    @Scope("doubleton")
    public Bar bar() {
        log.info("Create Bar");
        return new Bar();
    }

}
