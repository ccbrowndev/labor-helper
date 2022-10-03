package com.laborhelper.enterprise;
/**
*The use of @SpringBootApplication runs everything that @configuration, @EnableAutoConfiguration, and @ComponentScan with the default attributes
*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LaborHelperApplication {

    public static void main(String[] args) {
        SpringApplication.run(LaborHelperApplication.class, args);
    }

}
