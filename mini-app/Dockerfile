FROM openjdk:8-jdk-alpine
MAINTAINER Marco San Juan
COPY target/*.jar app.jar
EXPOSE 8080
CMD ["java","-jar","/app.jar"]

# BUILD
# docker build -t mini-app .

# RUN
# docker run -d --rm --name mini-app -p 8080:8080 mini-app

