FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} eurcka.jar
ENTRYPOINT ["java","-jar","/eurcka.jar"]