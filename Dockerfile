FROM openjdk:8-alpine-jdk
MAINTAINER DROJAS
COPY target/drojas-0.0.1-SNAPSHOT.jar drojasapp.jar
ENTRYPOINT ["java","-jar","/drojasapp.jar"]
