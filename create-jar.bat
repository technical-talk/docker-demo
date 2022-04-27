@echo off

echo Creating Jar for Spring application
:execute
mvn clean install -DskipTests=true

