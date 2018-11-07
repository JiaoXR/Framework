package com.jaxer.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by jaxer on 2018/11/2
 */
@SpringBootApplication
@EnableEurekaClient
public class DeptConsumerApp {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerApp.class, args);
    }
}
