FROM openjdk:17-alpine
MAINTAINER DROJAS
COPY target/drojas-0.0.1-SNAPSHOT.jar drojas-app.jar
ENTRYPOINT ["java","-jar","/drojas-app.jar"]
