package com.lingbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Redis02SpringbootApplication {

    public static void main(String[] args) {
        System.out.println("second commit!");
        System.out.println("third commit!");
        System.out.println("hot-fix commit!!!");
        System.out.println("hot-fix second commit!!!");
        SpringApplication.run(Redis02SpringbootApplication.class, args);
    }

}
