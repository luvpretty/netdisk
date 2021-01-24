package com.macro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DiskServiceApp{
    public static void main(String[] args) {
        SpringApplication.run(DiskServiceApp.class, args);
    }
}
