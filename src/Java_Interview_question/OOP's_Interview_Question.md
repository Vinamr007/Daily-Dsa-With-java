

````markdown
# OOPs Interview Questions & Answers

## 1. What is OOP?

OOP stands for Object-Oriented Programming.

It is a programming approach where we design a program using classes and objects.

The four main pillars of OOP are:

1. Encapsulation
2. Inheritance
3. Polymorphism
4. Abstraction

---

## 2. What are the four pillars of OOP?

The four pillars of OOP are:

1. Encapsulation
2. Inheritance
3. Polymorphism
4. Abstraction

---

## 3. What is a class?

A class is a blueprint or template used to create objects.

It defines the properties and behaviors of an object.

Example:

```java
class Student {

    String name;
    int age;

    void study() {
        System.out.println("Student is studying");
    }
}
````

Here, `Student` is a class.

---

## 4. What is an object?

An object is an instance of a class.

It represents a real-world entity and contains state and behavior.

Example:

```java
Student s = new Student();
```

Here, `s` is an object of the `Student` class.

---

## 5. What is encapsulation?

Encapsulation means wrapping data and methods together inside a class and controlling access to the data.

It is commonly achieved using:

* `private` variables
* Getter methods
* Setter methods

Example:

```java
class Student {

    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
```

Here, the variable `age` is private and is accessed through getter and setter methods.

---

## 6. Why do we use encapsulation?

We use encapsulation for:

* Data hiding
* Security
* Controlling access to data
* Better maintainability
* Validation of data

Example:

```java
public void setAge(int age) {

    if (age > 0) {
        this.age = age;
    }
}
```

Here, we can control what value is assigned to `age`.

---

## 7. What is data hiding?

Data hiding means restricting direct access to the internal data of a class.

It is commonly achieved using the `private` access modifier.

Example:

```java
class Student {

    private int age;
}
```

The `age` variable cannot be directly accessed from outside the class.

---

## 8. What is inheritance?

Inheritance is a mechanism where one class acquires properties and methods of another class.

It promotes code reusability.

We use the `extends` keyword.

Example:

```java
class Animal {

    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
}
```

Here, `Dog` inherits the `eat()` method from `Animal`.

---

## 9. Why do we use inheritance?

Inheritance is mainly used for:

* Code reusability
* Reducing duplicate code
* Establishing an IS-A relationship
* Supporting runtime polymorphism

Example:

```text
Dog IS-A Animal
Car IS-A Vehicle
```

---

## 10. What are the types of inheritance?

The commonly discussed types are:

1. Single Inheritance
2. Multilevel Inheritance
3. Hierarchical Inheritance

Java does not support multiple inheritance through classes.

Multiple inheritance can be achieved using interfaces.

---

## 11. What is single inheritance?

When one child class inherits from one parent class, it is called single inheritance.

Example:

```java
class Animal {
}

class Dog extends Animal {
}
```

---

## 12. What is multilevel inheritance?

When a class inherits from another class and another class inherits from it, it is called multilevel inheritance.

Example:

```text
Animal
   ↓
Dog
   ↓
Puppy
```

```java
class Animal {
}

class Dog extends Animal {
}

class Puppy extends Dog {
}
```

---

## 13. What is hierarchical inheritance?

When multiple child classes inherit from the same parent class, it is called hierarchical inheritance.

Example:

```text
        Animal
        /    \
      Dog    Cat
```

```java
class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}
```

---

## 14. Does Java support multiple inheritance?

Java does not support multiple inheritance through classes.

For example, this is not allowed:

```java
class C extends A, B {
}
```

Java supports multiple inheritance of type through interfaces.

Example:

```java
interface A {
}

interface B {
}

class C implements A, B {
}
```

---

## 15. Why does Java not support multiple inheritance through classes?

Java does not support multiple inheritance through classes mainly to avoid ambiguity.

For example:

```text
       A
      / \
     B   C
      \ /
       D
```

If both `B` and `C` have the same method, it can become unclear which implementation `D` should inherit.

This is commonly known as the diamond problem.

---

## 16. What is polymorphism?

Polymorphism means "many forms".

It allows the same method name or reference to behave differently in different situations.

Java mainly supports two types:

1. Compile-time polymorphism
2. Runtime polymorphism

---

## 17. What is compile-time polymorphism?

Compile-time polymorphism is achieved through method overloading.

The compiler decides which method should be called based on the method parameters.

Example:

```java
class Calculator {

    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}
```

This is called compile-time polymorphism.

---

## 18. What is runtime polymorphism?

Runtime polymorphism is achieved through method overriding.

The JVM decides which overridden method should execute at runtime.

Example:

```java
class Animal {

    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
```

---

## 19. What is method overloading?

Method overloading means having multiple methods with the same name but different parameter lists in the same class.

Example:

```java
class Calculator {

    void add(int a, int b) {
    }

    void add(int a, int b, int c) {
    }

    void add(double a, double b) {
    }
}
```

---

## 20. What are the rules for method overloading?

Methods can be overloaded by changing:

* Number of parameters
* Type of parameters
* Order of parameters

Example:

```java
void add(int a, int b) {
}

void add(int a, int b, int c) {
}

void add(double a, int b) {
}

void add(int a, double b) {
}
```

Changing only the return type is not enough.

---

## 21. Can we overload a method by changing only the return type?

No.

Return type alone cannot differentiate overloaded methods.

Example:

```java
int add(int a, int b) {
    return a + b;
}

// Not allowed
double add(int a, int b) {
    return a + b;
}
```

The parameter list is the same.

---

## 22. What is method overriding?

Method overriding occurs when a child class provides its own implementation of a method already defined in the parent class.

Example:

```java
class Animal {

    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
```

---

## 23. What are the rules of method overriding?

Important rules include:

* The method must have the same name.
* The parameter list must be the same.
* The child method cannot reduce access visibility.
* Static methods are hidden, not overridden.
* Final methods cannot be overridden.
* Private methods cannot be overridden.

---

## 24. What is the difference between overloading and overriding?

| Method Overloading                | Method Overriding                  |
| --------------------------------- | ---------------------------------- |
| Same class usually                | Parent-child relationship          |
| Parameters must be different      | Parameters must be same            |
| Compile-time polymorphism         | Runtime polymorphism               |
| Inheritance is not required       | Inheritance is required            |
| Return type alone cannot overload | Compatible return type is required |

---

## 25. What is abstraction?

Abstraction means hiding implementation details and showing only the necessary information to the user.

Example:

A user knows how to use an ATM but does not need to know the internal implementation of the ATM.

In Java, abstraction can be achieved using:

* Abstract classes
* Interfaces

---

## 26. What is an abstract class?

An abstract class is a class declared using the `abstract` keyword.

It can contain:

* Abstract methods
* Concrete methods
* Variables
* Constructors
* Static methods

Example:

```java
abstract class Animal {

    abstract void sound();

    void eat() {
        System.out.println("Eating");
    }
}
```

---

## 27. What is an abstract method?

An abstract method is a method that does not have a body.

Example:

```java
abstract void sound();
```

A concrete child class normally needs to provide its implementation.

---

## 28. Can we create an object of an abstract class?

No.

We cannot directly create an object of an abstract class.

Example:

```java
abstract class Animal {
}

Animal a = new Animal();   // Not allowed
```

We can create a reference of an abstract class and point it to a child object.

```java
Animal a = new Dog();
```

---

## 29. Can an abstract class have a constructor?

Yes.

An abstract class can have a constructor.

The constructor is called when an object of a concrete child class is created.

Example:

```java
abstract class Animal {

    Animal() {
        System.out.println("Animal constructor");
    }
}
```

---

## 30. Can an abstract class have normal methods?

Yes.

An abstract class can contain both abstract and concrete methods.

Example:

```java
abstract class Animal {

    abstract void sound();

    void eat() {
        System.out.println("Eating");
    }
}
```

---

## 31. What is an interface?

An interface is used to define a contract that implementing classes must follow.

Example:

```java
interface Animal {

    void sound();
}
```

A class implements the interface:

```java
class Dog implements Animal {

    public void sound() {
        System.out.println("Bark");
    }
}
```

---

## 32. Can a class implement multiple interfaces?

Yes.

A class can implement multiple interfaces.

Example:

```java
interface A {
}

interface B {
}

class C implements A, B {
}
```

This is one way Java supports multiple inheritance of type.

---

## 33. What is the difference between abstract class and interface?

### Abstract Class

* Can contain abstract and concrete methods.
* Can have constructors.
* Can have instance variables.
* A class can extend only one class.

### Interface

* Defines a contract.
* A class can implement multiple interfaces.
* A class uses `implements`.
* Modern Java interfaces can contain default and static methods.

---

## 34. What is the difference between encapsulation and abstraction?

### Encapsulation

Encapsulation focuses on **hiding and controlling data**.

Example:

```java
private int salary;
```

### Abstraction

Abstraction focuses on **hiding implementation details** and showing only necessary functionality.

Example:

```java
abstract void calculateSalary();
```

Simple way to remember:

```text
Encapsulation → How to protect data?

Abstraction   → What should be shown?
```

---

## 35. What is the difference between abstraction and inheritance?

Abstraction is used to hide implementation details and define required behavior.

Inheritance is used to acquire properties and methods from another class.

```text
Abstraction → Hiding implementation

Inheritance → Code reusability / IS-A relationship
```

---

## 36. What is the difference between inheritance and composition?

Inheritance represents an **IS-A** relationship.

Composition represents a **HAS-A** relationship.

Example of inheritance:

```java
class Dog extends Animal {
}
```

Dog IS-A Animal.

Example of composition:

```java
class Car {

    Engine engine;
}
```

Car HAS-A Engine.

---

## 37. What is IS-A relationship?

IS-A relationship represents inheritance.

Example:

```java
class Dog extends Animal {
}
```

Dog IS-A Animal.

---

## 38. What is HAS-A relationship?

HAS-A relationship represents composition or aggregation.

Example:

```java
class Car {

    Engine engine;
}
```

Car HAS-A Engine.

---

## 39. What is composition?

Composition is a strong HAS-A relationship where one object contains another object and their lifecycles are closely related.

Example:

```java
class House {

    private Room room = new Room();
}
```

The `House` contains a `Room`.

---

## 40. What is aggregation?

Aggregation is a weaker HAS-A relationship where one object uses another object, but both can exist independently.

Example:

```java
class Department {

    Teacher teacher;
}
```

The teacher can exist independently of the department.

---

## 41. What is the difference between composition and aggregation?

| Composition                   | Aggregation                     |
| ----------------------------- | ------------------------------- |
| Strong HAS-A relationship     | Weak HAS-A relationship         |
| Objects are closely dependent | Objects can exist independently |
| Strong ownership              | Weak ownership                  |

---

## 42. What is dynamic method dispatch?

Dynamic method dispatch is the mechanism by which Java determines at runtime which overridden method should be called.

Example:

```java
//Animal a = new Dog();
//
//a.sound();
```

If `Dog` overrides `sound()`, the `Dog` implementation is executed.

This is an example of runtime polymorphism.

---

## 43. What is upcasting?

Upcasting means assigning a child class object to a parent class reference.

Example:

```java
Animal a = new Dog();
```

Here, `Dog` is the child class and `Animal` is the parent class.

Upcasting is automatic.

---

## 44. What is downcasting?

Downcasting means converting a parent class reference back to a child class reference.

Example:

```java
Animal a = new Dog();

Dog d = (Dog) a;
```

Downcasting should be done carefully because an invalid cast can cause `ClassCastException`.

---

## 45. Can we override a static method?

No.

Static methods are associated with the class, not the object.

If a child class defines a static method with the same signature, it is called **method hiding**, not overriding.

---

## 46. Can we override a final method?

No.

A final method cannot be overridden by a child class.

Example:

```java
class Parent {

    final void show() {
    }
}
```

The child class cannot override `show()`.

---

## 47. Can we override a private method?

No.

Private methods are accessible only within their own class and are not inherited by child classes.

Therefore, they cannot be overridden.

---

## 48. Can we overload a static method?

Yes.

Static methods can be overloaded.

Example:

```java
static void display() {
}

static void display(int x) {
}
```

---

## 49. Can constructors be overloaded?

Yes.

A class can have multiple constructors with different parameter lists.

Example:

```java
class Student {

    Student() {
    }

    Student(String name) {
    }

    Student(String name, int age) {
    }
}
```

---

## 50. Can constructors be overridden?

No.

Constructors cannot be overridden because constructors are not inherited.

---

## 51. Can an interface have variables?

Yes.

Variables declared in an interface are implicitly:

```text
public static final
```

Example:

```java
interface Test {

    int VALUE = 10;
}
```

The variable is effectively a constant.

---

## 52. Can an interface have methods with implementation?

Yes.

Modern Java interfaces can contain:

* Abstract methods
* Default methods
* Static methods
* Private methods

Example:

```java
interface Test {

    default void show() {
        System.out.println("Hello");
    }
}
```

---

## 53. What is the `this` keyword in OOP?

`this` refers to the current object.

It is commonly used to differentiate instance variables from local variables.

Example:

```java
class Student {

    int age;

    Student(int age) {
        this.age = age;
    }
}
```

---

## 54. What is the `super` keyword in OOP?

`super` refers to the immediate parent class.

It can be used to:

* Access parent class variables
* Call parent class methods
* Call parent class constructor

Example:

```java
class Animal {

    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {

    void sound() {
        super.sound();
        System.out.println("Dog sound");
    }
}
```

---

## 55. What is the `final` keyword in OOP?

The `final` keyword is used to restrict modification.

It can be used with:

* Variables
* Methods
* Classes

### Final variable

Cannot be reassigned.

### Final method

Cannot be overridden.

### Final class

Cannot be inherited.

---

## 56. What is an immutable class?

An immutable class is a class whose object state cannot be changed after the object is created.

A common example in Java is `String`.

Typical steps for creating an immutable class include:

* Make the class final.
* Make fields private and final.
* Initialize fields through the constructor.
* Do not provide setters.
* Return defensive copies for mutable fields when necessary.

---

## 57. What is the difference between class and object?

| Class                                  | Object                         |
| -------------------------------------- | ------------------------------ |
| Blueprint or template                  | Instance of a class            |
| Does not represent a specific instance | Represents a specific instance |
| Defines properties and behavior        | Contains actual state          |
| Example: `Student`                     | Example: `new Student()`       |

---

## 58. What is the difference between interface and class?

| Class                               | Interface                              |
| ----------------------------------- | -------------------------------------- |
| Can create objects if concrete      | Cannot directly create objects         |
| Can contain instance variables      | Fields are constants by default        |
| Can have constructors               | Cannot have constructors               |
| Can extend one class                | Can be implemented by multiple classes |
| Defines implementation and behavior | Mainly defines a contract              |

---

## 59. What is the difference between IS-A and HAS-A?

### IS-A

Represents inheritance.

```java
class Dog extends Animal {
}
```

Dog IS-A Animal.

### HAS-A

Represents composition or aggregation.

```java
class Car {

    Engine engine;
}
```

Car HAS-A Engine.

---

## 60. Why is OOP important?

OOP helps us build software that is:

* Reusable
* Maintainable
* Secure
* Modular
* Easier to understand
* Easier to extend

It allows us to model real-world entities using classes and objects.

```

This gives you a **60-question OOP interview set** covering the questions most relevant to your Java preparation.
```
