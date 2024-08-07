FROM maven:3.8.3-jdk-8-openj9 as builder

COPY /kafka-oauth/src /usr/src/app/src
COPY /kafka-oauth/pom.xml /usr/src/app

RUN mvn -f /usr/src/app/pom.xml clean package

FROM apache/kafka:3.8.0

COPY --from=builder /usr/src/app/target/libkafka.oauthbearer-1.0.0.jar /opt/kafka/libs
COPY /kafka/server/*.conf /opt/kafka/kafka_server_jaas.conf

ENV KAFKA_OPTS=-Djava.security.auth.login.config=/opt/kafka/kafka_server_jaas.conf
