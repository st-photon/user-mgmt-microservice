package com.photon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UserMgmtApplication {

    public static void main(String... args) {
        SpringApplication.run(UserMgmtApplication.class, args);
    }
}
