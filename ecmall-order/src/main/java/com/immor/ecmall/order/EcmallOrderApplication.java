package com.immor.ecmall.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EcmallOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcmallOrderApplication.class, args);
    }

}
