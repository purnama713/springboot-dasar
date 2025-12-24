package com.belajar.spring_dasar.data;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Server {

    // Pakai PostConstruct dan PreDestroy untuk inisialisasi dan destroy custom
    // jika tidak menggunakan InitializingBean dan DisposableBean

    @PostConstruct // Method inisialisasi custom
    public void start() {
        log.info("Server started");
    }

    @PreDestroy // Method destroy custom
    public void stop() {
        log.info("Server stopped");
    }

}
