package com.example.simplerest.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.simplerest.demo.KafkaProducerService;

@RestController
public class PostKafka {

    @Autowired
    private KafkaProducerService kafkaProducerService;

    @PostMapping("/hello")
    public String hello(@RequestBody String message) {
        kafkaProducerService.sendMessage(message); // Call the sendMessage method
        return "Message sent to Kafka topic: " + message;
    }
}