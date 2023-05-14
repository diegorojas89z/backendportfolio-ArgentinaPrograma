FROM openjdk:17-oracle
COPY target/drojas-0.0.1-SNAPSHOT.jar drojasapp.jar
ENTRYPOINT ["java","-jar","/drojasapp.jar"]
