FROM openjdk:8-jdk-alpine
VOLUME /opt
ADD target/*.jar api.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=aws","-jar","api.jar"]
