FROM openjdk:8-jre-alpine
VOLUME /tmp
ADD Employee-service-kubernetes-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]



docker build -t employee-microservice-kubernetes .

docker run -d -p 8585:8080 employee-microservice-kubernetes

docker tag employee-microservice-kubernetes infomarcy/employee-microservice-kubernetes