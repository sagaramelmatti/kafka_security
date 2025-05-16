package com.chat.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootKafkaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKafkaClientApplication.class, args);
		System.out.println("spring boot kafka running..");
	}

}
