# Spring Boot 3 Rest API example

## Introduction

Spring Boot 3 JSON Web Token REST API Login Example

### Available resources

The following resources are available:

#### Auth

+ ``POST /api/auth/signup`` (``JSON``) : signup new account
+ ``POST /api/auth/signin`` (``JSON``) : login an account
+ ``POST /api/auth/signout`` (``JSON``) : logout the account
+ ``POST /api/auth/refreshtoken`` (``JSON``) : 	generate new Access Token

#### Test

+ ``GET /api/test/all`` (``JSON``) : retrieve public content
+ ``GET /api/test/admin`` (``JSON``) : access User’s content
+ ``GET /api/test/mod`` (``JSON``) : access Moderator’s content
+ ``GET /api/test/user`` (``JSON``) : access Admin’s content

* The access Token is stored in HttpOnly Cookie

### Back-end

The back-end is using an [H2 database](https://www.h2database.com/) behind to store the post.

## How to build and execute it

### Requirements

+ git
+ Java 17
+ Spring Boot 3.0.2
+ Gradle 7.6

### Dependency

+ springboot-web
+ springboot-data-jpa
+ springboot-security
+ springboot-validation
+ jjwt
+ h2

### Run Spring Boot application

```
ADD VM Options

-Dspring.datasource.username=sa
-Dspring.datasource.password=
-Djsjro.app.jwtCookieName=jsjro-jwt
-Djsjro.app.jwtRefreshCookieName=jsjro-jwt-refresh
-Djsjro.app.jwtSecret=2366HKxscwd7LZA5NldnKj7NrGMICPKYxyHKqMFlG8lplhvyB1uMcCB4sQfx6buYO2LrMnD1GO9uXX1nuDdLFsodqM9VqZMk

mvn spring-boot:run
```

### To connect to Swagger UI

```
http://localhost:8080/swagger-ui/index.html
```

### To connect to H2 Console

```
http://localhost:8080/h2-console
```