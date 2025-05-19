
Implementing SASL_PLAINTEXT Security in Kafka with Spring Boot and Docker Compose

In this article, we will explore how to implement SASL_PLAINTEXT security for a Kafka broker and a Spring Boot application. The setup involves using Docker Compose to orchestrate the Kafka broker and a Spring Boot application. Additionally, a separate Spring Boot client application will consume messages from the Kafka broker.

Apache Kafka provides multiple security mechanisms to secure communication between clients and brokers. One of these mechanisms is SASL (Simple Authentication and Security Layer) with PLAINTEXT, which is used for authentication without encryption.

----------------------------------------------------------
Prerequisite to run below application:

Install docker and docker-compose" Docker Compose version v2.29.1"

Install Open JDK 17

Note - Here I am running confluent kafka using docker.

----------------------------------------------------
Kafka Broker Configuration: The broker is set up with SASL_PLAINTEXT enabled on multiple listeners (INTERNAL, PLAINTEXT_HOST, EXTERNAL). The authentication mechanism used is PLAIN.
JAAS Configuration: The broker reads the JAAS configuration from a file mounted at /etc/kafka/kafka_server_jaas.conf.
Spring Boot Application: The Spring Boot Kafka application is defined as a service that depends on the Kafka broker.
Here we are exposing kafka data using EXTERNAL listener so client can connect with broker using external IP (server IP address) & port (172.22.56.120:7802).
Key Points:
Bootstrap Servers: The Kafka broker addresses include localhost, the internal Docker network (broker:29092), and the external IP (172.22.56.120:7802).
Security Configuration: SASL_PLAINTEXT is configured with the PLAIN mechanism, and credentials are provided via the jaas config.
Consumer and Producer Settings: De serializers and serializers are configured for JSON and string data, and the consumer group ID is set.

------------------------------------------------
Steps to run Kafka server:
I am running server application in ubuntu server :

1) Create Volume on host system :

/home/viadmin/kafka/secrets/
