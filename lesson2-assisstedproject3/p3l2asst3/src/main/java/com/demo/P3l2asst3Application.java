package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class P3l2asst3Application {

	public static void main(String[] args) {
		SpringApplication.run(P3l2asst3Application.class, args);
	}

}
