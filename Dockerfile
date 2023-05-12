# Start with a base image containing Java runtime (Here we are pulling a JDK 17 slim image)
FROM openjdk:17-jdk-slim

# The application's .jar file
ARG JAR_FILE=build/libs/*SNAPSHOT.jar

# Add the application's .jar to the container
COPY ${JAR_FILE} app.jar

# Run the jar file
ENTRYPOINT ["java","-jar","/app.jar"]
