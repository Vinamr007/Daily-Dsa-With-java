
# Session 2 — Spring Container & Configuration

### 15. What is `ApplicationContext`?

**Answer:**

> `ApplicationContext` is an interface that represents the Spring IoC container. It is responsible for managing Beans and provides methods to retrieve Beans and other Spring features.

Example:

```java
ApplicationContext context =
        SpringApplication.run(
                SpringLearningApplication.class,
                args
        );

Car car = context.getBean(Car.class);
```

---

### 16. What is `@Configuration`?

**Answer:**

> `@Configuration` is an annotation used to indicate that a class contains configuration information and Bean definitions for the Spring container.

Example:

```java
@Configuration
public class AppConfig {

}
```

Think:

```text
@Configuration
      ↓
Configuration class
      ↓
Contains Bean definitions
```

---

### 17. What is `@Bean`?

**Answer:**

> `@Bean` is used on a method to tell Spring that the object returned by that method should be managed as a Spring Bean.

Example:

```java
@Configuration
public class AppConfig {

    @Bean
    public Engine engine() {
        return new PetrolEngine();
    }
}
```

Here Spring manages the returned `PetrolEngine` object as a Bean.

---

### 18. What is the difference between `@Component` and `@Bean`?

**Answer:**

| `@Component`                                          | `@Bean`                                          |
| ----------------------------------------------------- | ------------------------------------------------ |
| Applied to a class                                    | Applied to a method                              |
| Spring discovers the class through component scanning | Spring manages the object returned by the method |
| Usually used for your own classes                     | Useful when you need explicit Bean creation      |

Example:

```java
@Component
class PetrolEngine {
}
```

vs.

```java
@Configuration
class AppConfig {

    @Bean
    public PetrolEngine engine() {
        return new PetrolEngine();
    }
}
```

### Easy interview line:

> **`@Component` tells Spring to manage the class, while `@Bean` tells Spring to manage the object returned by a method.**

---

### 19. Why do we use `@Bean`?

**Answer:**

> We use `@Bean` when we want to explicitly configure and register an object as a Spring Bean, especially when we cannot or do not want to add `@Component` to the class.

For example, a class from an external/third-party library cannot normally be modified to add `@Component`, so we can create its object using `@Bean`.

---

### 20. What happens when Spring starts?

**Answer:**

At a basic level:

```text
SpringApplication.run()
        ↓
Spring Container starts
        ↓
Finds configuration/components
        ↓
Creates Beans
        ↓
Injects dependencies
        ↓
Application is ready
```

---

### 21. How does Spring inject `Engine` into `Car`?

Suppose:

```java
@Bean
public Engine engine() {
    return new PetrolEngine();
}
```

and:

```java
@Bean
public Car car(Engine engine) {
    return new Car(engine);
}
```

Spring sees that `Car` requires an `Engine`.

It finds the `Engine` Bean and provides it to `Car`.

Conceptually:

```java
Engine engine = new PetrolEngine();

Car car = new Car(engine);
```

Spring manages this process.

---

### 22. Can we create a Bean without `@Component`?

**Answer:**

> Yes. We can create a Spring Bean using `@Bean` inside a `@Configuration` class.

Example:

```java
@Configuration
public class AppConfig {

    @Bean
    public PetrolEngine engine() {
        return new PetrolEngine();
    }
}
```

---

# ⭐ Most Important Questions for Interview

If the interviewer gives you only **5 minutes**, make sure you can confidently answer these:

```text
1. Why Spring?
2. What is IoC?
3. What is Dependency Injection?
4. IoC vs DI?
5. What is a Spring Bean?
6. What is Spring Container?
7. Constructor vs Setter vs Field Injection?
8. What is ApplicationContext?
9. @Component vs @Bean?
10. What is @Configuration?
```

