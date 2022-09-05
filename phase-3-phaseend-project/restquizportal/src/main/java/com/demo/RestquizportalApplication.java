package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com")
@EntityScan("com.entities")
@EnableJpaRepositories("com.repository")
public class RestquizportalApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestquizportalApplication.class, args);
	}

}
