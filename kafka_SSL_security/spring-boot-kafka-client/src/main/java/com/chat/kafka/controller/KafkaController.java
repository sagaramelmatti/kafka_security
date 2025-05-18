package com.chat.kafka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chat.kafka.consume.MyTopicConsumer;

@RestController
public class KafkaController {

	@Autowired
	private MyTopicConsumer myTopicConsumer;

	@GetMapping("/kafka/messages")
	public List<String> getMessages() {
		return myTopicConsumer.getMessages();
	}

}
