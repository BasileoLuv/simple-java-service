# simple-java-service
A simple Java service that shows system info and performs arithmetic operations

# How to run tests
```
mvn test
```
# How to package and run tests
```
mvn package test
```
# How to run the App
```
java -cp target/Calc-1.0-SNAPSHOT.jar com.clc.AppCalculator 3 + 5
```
# How to run checkstyle
```
mvn checkstyle:checkstyle -Dcheckstyle.config.location=checkstyle.xml
```

# How to run webservice app
```
mvn clean package && java -jar target/Calc-*.jar
```
Then go to http://localhost:8080/add?a=3&b=4

# Commit-plugin

We get information about commit from the git.properties after package
