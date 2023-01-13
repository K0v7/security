# Security App
## A Java App JWT authentication and authorization in a Spring Boot 3.0 application using Spring Security 6 and a Postgres database to store user credentials

Language: Java 17

Frameworks: Springboot 3 and Spring Security 6

DataBase: PostgreSQL to register users.

use the method `REGISTER` to generate a token to access
![img.png](img.png)

the `AUTHENTICATE` method to validate the access and renew the token
![img_1.png](img_1.png)

if are the correct token, it grants the access to user
![img_2.png](img_2.png)

if the token are invalid or have something wrong with token, don't return the access 
![img_3.png](img_3.png)