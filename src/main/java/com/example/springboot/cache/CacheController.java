package com.example.springboot.cache;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
public class CacheController {

    @Cacheable(value = "test")
    public void testCache() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("test cache~~~~");

    }
}