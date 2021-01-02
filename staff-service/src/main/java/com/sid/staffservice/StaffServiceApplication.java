package com.sid.staffservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class StaffServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(StaffServiceApplication.class, args);
    }

}
