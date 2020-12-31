package com.immor.ecmall.thirdparty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EcmallThirdPartyApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcmallThirdPartyApplication.class, args);
    }

}
