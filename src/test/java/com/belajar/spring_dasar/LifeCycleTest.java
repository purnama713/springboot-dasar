package com.belajar.spring_dasar;

import com.belajar.spring_dasar.data.Connection;
import com.belajar.spring_dasar.data.Server;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeCycleTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
        applicationContext.registerShutdownHook();
    }

//    @AfterEach
//    void tearDown() {
//        applicationContext.close();
//    }

    @Test
    void testConnection() {
        Connection connection = applicationContext.getBean(Connection.class);
    }

    @Test
    void testServer() {
        // Server bean akan otomatis diinisialisasi saat konteks aplikasi dibuat
        // dan akan dihentikan saat konteks aplikasi ditutup
        applicationContext.getBean(Server.class);
    }
}
