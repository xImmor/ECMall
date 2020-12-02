package com.immor.ecmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.immor.ecmall.product.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class EcmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcmallProductApplication.class, args);
    }

}
