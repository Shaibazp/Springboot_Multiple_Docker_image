FROM openjdk:17
ADD target/SB-Docker.jar SB-Docker.jar
EXPOSE 8181
ENTRYPOINT ["java", "-jar", "/SB-Docker.jar"]