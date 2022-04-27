# docker-demo

Prerequisite
1. Docker
2. Maven
3. Java

Step 1.
Pull this code on your local machine

Step 2.
run create-jar.bat file to create a jar file of the java application

Step 3.
execute the below command to start a mysql container

> docker run --name=mysql-container -e MYSQL_ROOT_PASSWORD=password -e MYSQL_USER=admin -e MYSQL_PASSWORD=password -e MYSQL_DATABASE=brightly mysql

Step 4
run create-docker-image.bat to create a docker image of the java application.

Step 5
Execute the below command to run the spring application and link it to the mysql container.
> docker run -p 8082:8082 --name=spring-application --link  mysql-container -d spring-application
