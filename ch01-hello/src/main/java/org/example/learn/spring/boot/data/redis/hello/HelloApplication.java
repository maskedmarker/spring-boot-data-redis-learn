package org.example.learn.spring.boot.data.redis.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HelloApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(HelloApplication.class, args);
        Object redisTemplate = applicationContext.getBean("redisTemplate");
        System.out.println("redisTemplate = " + redisTemplate);
    }

}