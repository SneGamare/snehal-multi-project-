project-root/
│
├── common-lib/                   # Common Kafka producer/consumer logic (Reusable)
│   ├── pom.xml
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   ├── com/example/commonlib/
│   │   │   │   │   ├── kafka/
│   │   │   │   │   │   ├── KafkaConsumerConfig.java
│   │   │   │   │   │   ├── KafkaProducerConfig.java
│   │   │   │   │   │   ├── KafkaConsumerService.java
│   │   │   │   │   │   └── KafkaProducerService.java
│   ├── target/                  # Build output
│
├── data-distribution/            # H2 Database and persistence layer
│   ├── pom.xml
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   ├── com/example/datadistribution/
│   │   │   │   │   ├── model/
│   │   │   │   │   │   └── DataEntity.java
│   │   │   │   │   ├── repository/
│   │   │   │   │   │   └── DataRepository.java
│   │   │   │   │   ├── service/
│   │   │   │   │   │   └── DataService.java
│   ├── target/                  # Build output
│
├── orchestrator/                 # Orchestrator using common-lib and data-distribution
│   ├── pom.xml
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   ├── com/example/orchestrator/
│   │   │   │   │   ├── service/
│   │   │   │   │   │   ├── OrchestratorService.java
│   │   │   │   │   │   └── KafkaListenerService.java
│   │   │   │   │   ├── controller/
│   │   │   │   │   │   └── OrchestratorController.java
│   ├── target/                  # Build output
│
└── README.md                     # Documentation
