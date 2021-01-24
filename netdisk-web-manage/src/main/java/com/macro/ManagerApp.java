package com.macro;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ManagerApp {
	
	public static void main(String[] args) {
		SpringApplication.run(ManagerApp.class, args);
	}
}

