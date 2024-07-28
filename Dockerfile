FROM openjdk:22
MAINTAINER priyobrato_das
COPY target/springboot-kubernetes-0.0.1-SNAPSHOT.jar springboot-k8s-1.0.0.jar
EXPOSE 9100
ENTRYPOINT ["java","-jar","/springboot-k8s-1.0.0.jar"]
