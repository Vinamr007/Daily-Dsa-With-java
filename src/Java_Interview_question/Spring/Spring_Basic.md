Spring & Spring Boot Interview Notes
Session 1 — Spring Core Fundamentals
1. Why do we use Spring?

Answer:

Spring is a Java framework used to develop applications. It helps us create loosely coupled and maintainable applications by providing features like IoC, Dependency Injection, object management, and lifecycle management.

2. What is tight coupling?

Answer:

Tight coupling means one class is directly dependent on a specific implementation of another class.

Example:

class Car {
PetrolEngine engine = new PetrolEngine();
}

Here, Car is directly dependent on PetrolEngine.

3. What is loose coupling?

Answer:

Loose coupling means a class depends on an abstraction, such as an interface, rather than directly depending on a specific implementation.

Example:

class Car {

    Engine engine;

    Car(Engine engine) {
        this.engine = engine;
    }
}

Here, Car depends on the Engine interface instead of directly depending on PetrolEngine.

4. What is a dependency?

Answer:

A dependency is an object or class that another class requires to perform its functionality.

Example:

Car → Engine

Here, Engine is a dependency of Car.

5. What is Dependency Injection?

Answer:

Dependency Injection is the process of providing the required dependency to a class from outside instead of the class creating the dependency itself.

Example:

class Car {

    Engine engine;

    Car(Engine engine) {
        this.engine = engine;
    }
}

Here, Engine is provided to Car from outside.

6. What are the types of Dependency Injection?

Answer:

There are three common types:

Constructor Injection
Setter Injection
Field Injection
7. What is Constructor Injection?

Answer:

Constructor Injection is a type of Dependency Injection where the dependency is provided through the class constructor.

Example:

class Car {

    Engine engine;

    Car(Engine engine) {
        this.engine = engine;
    }
}
8. What is Setter Injection?

Answer:

Setter Injection is a type of Dependency Injection where the dependency is provided through a setter method.

Example:

class Car {

    Engine engine;

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
9. What is Field Injection?

Answer:

Field Injection is a type of Dependency Injection where Spring directly injects the dependency into a class field, generally using @Autowired.

Example:

class Car {

    @Autowired
    private Engine engine;
}
10. Which type of Dependency Injection is preferred?

Answer:

Constructor Injection is generally preferred because dependencies are explicit, required dependencies can be enforced during object creation, and the class is easier to test.

11. What is IoC?

Answer:

IoC stands for Inversion of Control. It is a principle where the control of object creation and dependency management is transferred from the application code to the Spring container.

Without Spring:

Developer
↓
Creates objects
↓
Manages dependencies

With Spring:

Spring Container
↓
Creates objects
↓
Manages dependencies
12. What is the difference between IoC and DI?

Answer:

IoC is a principle of transferring control of object creation and dependency management to the Spring container. Dependency Injection is a technique used to achieve IoC by providing dependencies from outside the class.

Easy way:

IoC → Principle
DI  → Technique
13. What is the Spring Container?

Answer:

The Spring Container is responsible for creating, configuring, managing Spring Beans, and injecting their dependencies.

Example:

Spring Container
|
|--- Car Bean
|
|--- Engine Bean
14. What is a Spring Bean?

Answer:

A Spring Bean is an object that is created, configured, and managed by the Spring IoC container.

Example:

@Component
class Car {
}

Spring creates and manages the Car object as a Bean.