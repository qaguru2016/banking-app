# Getting Started

### Follow the below steps
* Install MySQL Server and Workbench
### Create a new user in MySQLServer
*Execute the following in MySQL WorkBench
*  CREATE USER 'auto'@'localhost' IDENTIFIED BY 'auto123';
*  GRANT ALL PRIVILEGES ON *.* TO 'auto'@'localhost' WITH GRANT OPTION;
*  FLUSH PRIVILEGES;
### Update the root password in file 
* src/main/resources/application.properties 
### Create Schema in the sql by executing 
* create database banking_app;
### How to build fat jar file
mvn package
### How to execute the app
* double click the jar file
### How to kill the server
* Find the process id by - ps -ef | grep java
* Kill the process with - kill -9 <id>
* In Window, kill javaw.exe from task manager
### APIs
* POST http://localhost:8080/api/accounts
* 