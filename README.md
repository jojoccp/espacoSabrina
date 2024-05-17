# Estética

This is a simple system to control the flux of the payments of made in SpringBoot and Kotlin

## ANNOTATIONS
-all endpoints of Orders, Attendance and Clients are okay
## V.1
- implemented classes AesttheticAttendance, Client and Order
- configure and create database and tables


## V.2
- create db-migrations with liquibase


#### Wiremock
to execute wiremock in another port:
java -jar wiremock-jre8-standalone-2.35.0.jar --port 8082

#### Creating database Postgres on Docker
- docker pull postgres
- docker run --name postgres_db -e POSTGRES_PASSWORD=Leonardo16@ -p 5432:5432 -d postgres
- docker exec -it postgres_db bash
  - psql -h localhost -U postgres
  - CREATE DATABASE espaco_sabrina;
  - \l




### TO-DO
- create own exceptions
- create migrations using Liquibase or Flyway
- create tests
- adding comments in sqls liquibases
