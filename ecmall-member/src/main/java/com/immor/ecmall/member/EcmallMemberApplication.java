package com.immor.ecmall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.immor.ecmall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class EcmallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcmallMemberApplication.class, args);
    }

}
