package com.belajar.spring_dasar.data;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

@Slf4j
public class Connection implements InitializingBean, DisposableBean {

    // InitializingBean digunakan untuk inisialisasi setelah properti di set
    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("Connection is ready to be used");
    }

    // DisposableBean digunakan untuk clean up sebelum bean di destroy
    @Override
    public void destroy() throws Exception {
        log.info("Connection is closed");
    }

}
