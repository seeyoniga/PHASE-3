package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	
    @RequestMapping(value = "/send")
	public String sendMessage() {
		
		kafkaTemplate.send("GENERAL","Hello From My Apache Kafka");
		
		return "Please Check Console";
	}

}