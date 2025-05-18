# Use an official OpenJDK runtime as a parent image
FROM openjdk:17

COPY ./target/spring-boot-kafka-server-0.0.1-SNAPSHOT.jar spring-boot-kafka-server.jar

CMD ["java","-jar","spring-boot-kafka-server.jar"]