# spring-boot-security-3.0 login

Creating a spring security login with jwt can be tedious and has a lot of boilerplate code. This is a basic pre-written 
boilerplate code for using spring security 3 with jwt. This can easily be customized and used for different projects.

## Usage

Rename application.propertiesExample to application.properties and fill all values.
Postgres, MySQL and h2 have been added to the dependencies, feel free to use your preference. 

Download the project dependencies and run the application.

Create some sample users. It takes a username, password and role to create a user. Please remember to encrypt the password. 
Since this is more on login, there is no new user endpoint. I'll probably add that later for test purposes. 
User roles should be prefixed with ROLE, for instance ROLE_ADMIN, ROLE_USER

Test the endpoints

### Endpoints

| ROUTE               | VERB | ACTION                                                                      | REQUIRES TOKEN |
|---------------------|------|-----------------------------------------------------------------------------|----------------|
| /api/v1/auth        | POST | Returns a token. 403 if username or password is invalid                     | False          |
| /api/v1/hello       | GET  | Return "Hello from secure endpoint". Can be accessed by both admin and user | True           |
| /api/v1/hello/admin | GET  | Return "For admin eyes only bro!". Can be accessed only  admin              | True           |
| /api/v1/hello/user  | GET  | Return "For user eyes only bro!". Can be accessed only  user                | True           |

## Sources
1. [Spring Boot 3.0 Security | Authentication and Authorization | [New Changes] | javaTechie](https://www.youtube.com/watch?v=R76S0tfv36w)
2. [Spring Boot 3.0 + Spring Security 6 | JWT Authentication & Authorization | JavaTechie](https://www.youtube.com/watch?v=NcLtLZqGu2M&t=33s)
3. [JwtUtils](https://github.com/koushikkothagal/spring-security-jwt/blob/master/src/main/java/io/javabrains/springsecurityjwt/util/JwtUtil.java)
Note that the deprecated methods in the Jwt Utils repo were fixed replaced by javatechie.


