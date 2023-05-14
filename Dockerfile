FROM amazoncorretto:8-alpine-jdk
COPY target/drojas-0.0.1-SNAPSHOT.jar drojasapp.jar
ENTRYPOINT ["java","-jar","/drojasapp.jar"]
