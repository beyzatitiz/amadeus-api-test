FROM maven:3.9.3-eclipse-temurin-20
WORKDIR /app
COPY pom.xml ./
RUN mvn -B test
COPY src ./src
CMD ["mvn", "test"]
