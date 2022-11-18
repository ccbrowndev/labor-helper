package com.laborhelper.enterprise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class LaborHelperApplication {

    public static void main(String[] args) {
        SpringApplication.run(LaborHelperApplication.class, args);
    }

}
