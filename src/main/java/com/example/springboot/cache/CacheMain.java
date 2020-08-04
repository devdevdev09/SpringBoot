package com.example.springboot.cache;

import com.example.springboot.DemoApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class CacheMain {
    public static void main(String[] args) {
        SpringApplication.run(CacheMain.class, args);
    }
}
