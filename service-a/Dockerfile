# Use a base image with a JRE to create a minimal runtime environment
FROM openjdk:17

# Set the working directory in the container
WORKDIR /app

# Copy the Spring Boot JAR file from your local machine to the container
COPY target/service-a-1.0.jar /app/app.jar
COPY lib/opentelemetry-javaagent.jar /app/otel-javaagent.jar

# Expose the port on which the Spring Boot application will run (replace 8080 with your application's port if needed)
EXPOSE 9094

#ENV OTEL_RESOURCE_ATTRIBUTES="service.name=service-a"

# Command to run the Spring Boot application (with remote debugging)
CMD ["java", "-javaagent:otel-javaagent.jar", "-jar", "app.jar"]
