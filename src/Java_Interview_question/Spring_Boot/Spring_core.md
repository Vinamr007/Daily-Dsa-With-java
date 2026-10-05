1. What is Spring Boot?
   Answer:
   Spring Boot is a framework built on top of Spring that simplifies the development of Spring applications by providing auto-configuration, starter dependencies, and embedded servers.
2. Why do we use Spring Boot?
   Answer:
   We use Spring Boot to develop Spring applications quickly and with less configuration.
   The main benefits are:
- Auto-configuration
- Starter dependencies
- Embedded server
- Less boilerplate configuration
- Easy development of REST APIs and web applications
3. Difference between Spring and Spring Boot?
   Answer:
   Spring	Spring Boot
   Core framework	Built on top of Spring
   Requires more configuration	Requires less configuration
   Dependencies are often configured individually	Provides starter dependencies
   External server may be required	Provides embedded server
   More setup	Faster development


Interview line:  
Spring provides the core features like IoC and Dependency Injection, while Spring Boot simplifies Spring application development using auto-configuration, starters, and embedded servers.

4. What is @SpringBootApplication?
   Answer:
   @SpringBootApplication is the main annotation used in a Spring Boot application. It tells Spring Boot to configure the application, enable auto-configuration, and scan Spring components.
   Example:
   @SpringBootApplication
   public class MyApplication {

   public static void main(String[] args) {
   SpringApplication.run(MyApplication.class, args);
   }
   }

5. What are the three annotations inside @SpringBootApplication?
   Answer:
   @SpringBootApplication is a combination of:
   @SpringBootConfiguration
   @EnableAutoConfiguration
   @ComponentScan

- @SpringBootConfiguration → Indicates that the class is a Spring Boot configuration class.
- @EnableAutoConfiguration → Enables Spring Boot's automatic configuration.
- @ComponentScan → Searches for Spring components such as @Component, @Service, @Repository, and @Controller.
6. What is Auto Configuration?
   Answer:
   Auto-configuration is a Spring Boot feature that automatically configures the application based on the dependencies available in the classpath and the application's configuration.
   For example, if we add:
   spring-boot-starter-web

Spring Boot automatically configures the required web-related components.
Simple line:
Auto-configuration reduces the amount of manual configuration required by the developer.

7. What are Spring Boot Starters?
   Answer:
   Spring Boot Starters are predefined dependency packages that provide the dependencies required for a particular functionality.
   For example:
   spring-boot-starter-web

is used for web and REST API development.
Other examples:
spring-boot-starter-data-jpa
spring-boot-starter-security
spring-boot-starter-test

Interview line:
Starters make dependency management easier by grouping commonly required dependencies for a specific feature.

8. What is application.properties?
   Answer:
   application.properties is a configuration file used to store application-specific settings in a Spring Boot application.
   Example:
   server.port=8081
   spring.application.name=StudentApp

It is normally located at:
src/main/resources/application.properties

9. What is pom.xml?
   Answer:
   pom.xml stands for Project Object Model. It is the main configuration file of a Maven project.
   It contains:
- Project information
- Dependencies
- Plugins
- Build configuration
- Version information
  Example:
  <dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-web</artifactId>
  </dependency>

10. What is an Embedded Server?
    Answer:
    An embedded server is a server that is included inside the Spring Boot application itself, so we don't need to install and configure a separate server.
    For example, Spring Boot commonly uses Tomcat as an embedded server.
    We can simply run:
    SpringApplication.run(MyApplication.class, args);

and the application starts with the embedded server.
11. Why is Tomcat called an Embedded Server?
    Answer:
    Tomcat is called an embedded server because it is included as a dependency inside the Spring Boot application and runs along with the application.
    We don't need to separately install Tomcat or deploy a WAR file manually.
    The flow is:
    Spring Boot Application
    ↓
    Embedded Tomcat
    ↓
    Application starts
    ↓
    http://localhost:8080

12. How does a Spring Boot application start?
    Answer:
    When we execute:
    SpringApplication.run(MyApplication.class, args);

Spring Boot performs several steps:
main()
↓
SpringApplication.run()
↓
Create ApplicationContext
↓
Component Scanning
↓
Auto Configuration
↓
Create Spring Beans
↓
Start Embedded Server
↓
Application Ready

Interview answer:
When SpringApplication.run() is called, Spring Boot creates the ApplicationContext, performs component scanning and auto-configuration, creates the required beans, starts the embedded server, and finally makes the application ready to handle requests.