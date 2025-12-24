package com.belajar.spring_dasar;

import com.belajar.spring_dasar.data.Connection;
import com.belajar.spring_dasar.data.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifeCycleConfiguration {

    @Bean
    public Connection connection() {
        return new Connection();
    }

//    @Bean(initMethod = "start", destroyMethod = "stop") // Method inisialisasi dan destroy custom
    @Bean // Menggunakan PostConstruct dan PreDestroy
    public Server server() {
        return new Server();
    }
}
