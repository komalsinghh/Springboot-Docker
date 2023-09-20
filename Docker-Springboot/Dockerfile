FROM openjdk:11
EXPOSE 8086
ADD target/demo-0.0.1-SNAPSHOT.jar springboot-docker.jar
ENTRYPOINT ["java","-jar","springboot-docker.jar"