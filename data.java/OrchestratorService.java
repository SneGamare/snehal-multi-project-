package com.example.orchestrator.service;

import com.example.datadistribution.service.DataService;
import com.example.commonlib.config.KafkaConsumerService;
import com.example.commonlib.config.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrchestratorService {

    private final KafkaConsumerService kafkaConsumerService;
    private final KafkaProducerService kafkaProducerService;
    private final DataService dataService;

    @Autowired
    public OrchestratorService(KafkaConsumerService kafkaConsumerService, 
                               KafkaProducerService kafkaProducerService,
                               DataService dataService) {
        this.kafkaConsumerService = kafkaConsumerService;
        this.kafkaProducerService = kafkaProducerService;
        this.dataService = dataService;
    }

    public void processMessage(String message) {
        // Example of processing: convert to uppercase
        String processedMessage = message.toUpperCase();

        // Save processed message to the database
        dataService.saveData(processedMessage);

        // Optionally send the processed message back to Kafka (as a producer)
        kafkaProducerService.sendMessage("my-topic", processedMessage);
    }

    public void consumeMessage(String message) {
        // Consuming message from Kafka and processing it
        processMessage(message);
    }
}
