FROM openjdk:8
COPY target/dockerDemo-1.0-SNAPSHOT.jar dockerdemo.jar
CMD java -jar dockerdemo.jar