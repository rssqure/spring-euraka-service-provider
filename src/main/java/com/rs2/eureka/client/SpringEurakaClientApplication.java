package com.rs2.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringEurakaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurakaClientApplication.class, args);
	}
}
