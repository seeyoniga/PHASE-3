package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.demo.controller")
public class P3l2ppApplication {

	public static void main(String[] args) {
		SpringApplication.run(P3l2ppApplication.class, args);
	}

}
