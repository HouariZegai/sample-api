# Build and generate Jar file
FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -Dmaven.test.skip

# Run the app
FROM openjdk:17-alpine
WORKDIR /app
COPY --from=build /app/target/backend-fat.jar ./backend.jar

CMD ["java", "-jar", "backend.jar"]
