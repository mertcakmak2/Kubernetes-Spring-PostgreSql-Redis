FROM adoptopenjdk/openjdk11:alpine-jre

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} springboot-postgres-k8s.jar

ENTRYPOINT ["java","-jar","/springboot-postgres-k8s.jar"]