FROM amazoncorreto:17-allpine-jdk
MAINTAINER DROJAS
COPY target/drojas-0.0.1-SNAPSHOT.jar drojas-app.jar
ENTRYPOINT ["java","-jar","/drojas-app-jar"]
