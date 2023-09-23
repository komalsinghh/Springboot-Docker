FROM openjdk:11
EXPOSE 8086
ADD target/docker-springboot.jar docker-springboot.jar
ENTRYPOINT ["java","-jar","/docker-springboot.jar"]