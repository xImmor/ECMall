package com.immor.ecmall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 开启服务注册发现
 * 配置 nacos 注册中心地址
 */
@EnableDiscoveryClient
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class EcmallGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcmallGatewayApplication.class, args);
    }

}
