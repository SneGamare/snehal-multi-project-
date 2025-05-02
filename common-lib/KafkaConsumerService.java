package com.example.commonlib.config;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "my-topic", groupId = "group1")
    public void consumeMessage(String message) {
        System.out.println("Consumed message: " + message);
    }
}
