package com.example.orchestrator.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaListenerService {

    private final OrchestratorService orchestratorService;

    public KafkaListenerService(OrchestratorService orchestratorService) {
        this.orchestratorService = orchestratorService;
    }

    @KafkaListener(topics = "my-topic", groupId = "group1")
    public void consume(String message) {
        orchestratorService.consumeMessage(message);
    }
}
