package com.xiaozcc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author xiaoczz
 * @date 2021/4/9 19:19
 */
@SpringBootApplication
@EnableEurekaServer //声明该类是一个 Eureka Server 微服务，提供服务注册和服务发现功能，即注册中心。
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}

