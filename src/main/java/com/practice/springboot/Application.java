package com.practice.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing //JPA auditing
@SpringBootApplication
public class Application { //main class
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}

