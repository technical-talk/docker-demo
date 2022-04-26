FROM openjdk
MAINTAINER brightlysoftware.com
COPY ./target/*.jar spring-application.jar
ENTRYPOINT ["java","-jar","/spring-application.jar"]
