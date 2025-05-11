# Start with Java runtime image
FROM openjdk:17-jdk-slim

# Add a volume to store logs if needed
VOLUME /tmp

# Set the working directory
WORKDIR /app

# Copy the jar file into the container
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

# Expose the application port
EXPOSE 8080

# Command to run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
