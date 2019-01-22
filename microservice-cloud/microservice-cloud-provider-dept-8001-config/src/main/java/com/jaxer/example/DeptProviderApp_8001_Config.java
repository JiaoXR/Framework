package com.jaxer.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by jaxer on 2018/10/31
 * 测试配置版
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class DeptProviderApp_8001_Config {
    public static void main(String[] args) {
        SpringApplication.run(DeptProviderApp_8001_Config.class, args);
    }
}
