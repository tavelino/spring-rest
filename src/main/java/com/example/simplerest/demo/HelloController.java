package com.example.simplerest.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class HelloController {

    @Autowired
    private KafkaProducerService kafkaProducerService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello bbassets!";
    }
    
    @PostMapping("/hello")
    public String hello(@RequestBody String message) {
        kafkaProducerService.sendMessage(message); // Call the sendMessage method
        return "Message sent to Kafka topic: " + message;
    }

}