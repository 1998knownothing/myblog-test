package com.example.multisource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.multisource.mapper1,com.example.multisource.mapper2")
public class MultisourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultisourceApplication.class, args);
    }

}
