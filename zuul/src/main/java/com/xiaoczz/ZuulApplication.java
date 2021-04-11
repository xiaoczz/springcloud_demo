package com.xiaoczz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author xiaoczz
 * @date 2021/4/10 19:41
 */
@EnableZuulProxy  //包含了 `@EnableZuulServer`，设置该类是网关的启动类。
@EnableAutoConfiguration  //可以帮助 Spring Boot 应用将所有符合条件的 `@Configuration` 配置加载到当前 Spring Boot 创建并使用的 IoC 容器中
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
    }
}
