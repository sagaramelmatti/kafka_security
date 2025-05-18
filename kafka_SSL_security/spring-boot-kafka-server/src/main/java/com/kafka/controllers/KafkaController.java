package com.kafka.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.service.ProducerService;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

	@Autowired
    private ProducerService producerService;

    @GetMapping(value = "/publish/hello")
    public String sendMessageToKafkaTopicHello() {
        return "Hello..!";
    }

    @GetMapping(value = "/publish")
    public String sendMessageToKafkaTopic(@RequestParam("message") String message) {
        producerService.sendMessage(message);
        return "Successfully publisher message..!";
    }
}
