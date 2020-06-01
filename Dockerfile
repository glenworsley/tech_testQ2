# Simple Dockerfile.  TODO: create multistage build and use a smaller runtime image
FROM openjdk:11-slim
RUN addgroup --system spring && adduser --system spring --ingroup spring
USER spring
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]