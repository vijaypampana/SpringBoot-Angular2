package com.vijay.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.vijay")
class SBApplication {

    static void main(String[] args) {
        SpringApplication.run(SBApplication.class, args);
    }

}