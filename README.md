project-root/
│
├── common-lib/                   # Common Kafka producer/consumer logic
│   ├── pom.xml
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   ├── com/example/commonlib/
│   │   │   │   │   ├── config/
│   │   │   │   │   │   ├── KafkaConsumerService.java
│   │   │   │   │   │   ├── KafkaProducerService.java
│   │   │   │   │   │   └── KafkaConfiguration.java
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
├── orchestrator/                 # Orchestrator which uses both common-lib and data-distribution
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
