package com.immor.ecmall.ware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EcmallWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcmallWareApplication.class, args);
    }

}
