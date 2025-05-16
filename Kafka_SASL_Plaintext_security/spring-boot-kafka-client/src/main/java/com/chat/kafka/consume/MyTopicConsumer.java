package com.chat.kafka.consume;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MyTopicConsumer {

	private final List<String> messages = new ArrayList<>();
	private final Logger logger = LoggerFactory.getLogger(getClass());

	@KafkaListener(topics = "message-topic", groupId = "group_id")
	public void listen(String message) {
		logger.info("**** -> Consumed message This message has been consumed -> {}", message);
	}

	public List<String> getMessages() {
		return messages;
	}

}
