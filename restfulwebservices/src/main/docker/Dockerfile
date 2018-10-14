FROM openjdk:8-jdk-alpine
RUN mkdir app
COPY app.jar /app/server.jar
ENTRYPOINT [ "sh", "-c", "java -jar /app/server.jar" ]
