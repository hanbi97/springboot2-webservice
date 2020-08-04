package com.practice.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @EnableJpaAuditing , JPA auditing move to /config
@SpringBootApplication
public class Application { //main class
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}

