package com.currentbp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAsync
@EnableCaching
@SpringBootApplication(scanBasePackages = {"com.currentbp"})
@MapperScan(basePackages = {"com.currentbp.dao"})
@EnableScheduling
public class SimpleSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleSpringBootApplication.class, args);
    }

}
