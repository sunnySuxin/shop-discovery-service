package com.sun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心启动类
 *
 * @author suxin
 * @date 2019.1.14
 */

@SpringBootApplication
@EnableEurekaServer
public class ShopDiscoveryService {

    public static void main(String[] args) {
        SpringApplication.run(ShopDiscoveryService.class, args);
    }
}

