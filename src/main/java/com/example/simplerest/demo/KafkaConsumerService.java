package com.example.simplerest.demo;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "bbproduct", groupId = "group_id")
    public void consume(ConsumerRecord<String, String> record) {
        System.out.println(String.format("Consumed message: key = %s, value = %s", record.key(), record.value()));
    }
}