package com.example.springboot.cache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableCaching
@RestController
public class CacheController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    int TEST_COUNT = 0;

    @Cacheable(value = "addCount")
    @RequestMapping(value="/add")
    public int testCache(@RequestParam int num) {
        logger.info("=========start=========");
        TEST_COUNT++;
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("=========end=========");

        return TEST_COUNT;
    }
}