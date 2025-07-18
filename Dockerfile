#FROM maven:3.9.6-eclipse-temurin-17

#WORKDIR /app

#COPY . .

#RUN mvn clean package -DskipTests

#EXPOSE 9099

#CMD ["java", "-jar", "target/app.jar"]

# Stage 1: Build with Maven and JDK
FROM maven:3.9.6-eclipse-temurin-17 AS builder

WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Stage 2: Run the app with lightweight JRE
FROM eclipse-temurin:17-jre-jammy

WORKDIR /app

# Copy the built jar from the builder stage
COPY --from=builder /app/target/app.jar app.jar

EXPOSE 9099

ENTRYPOINT ["java", "-jar", "app.jar"]
