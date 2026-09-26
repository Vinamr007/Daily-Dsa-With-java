Next topic: **`final` keyword**. Copy this directly into your GitHub `.md` file.

````markdown
# final Keyword — Java Interview Questions & Answers

## 1. What is the `final` keyword in Java?

The `final` keyword is used to restrict modification.

It can be used with:

- Variables
- Methods
- Classes

---

## 2. What is a final variable?

A final variable is a variable whose value cannot be reassigned after it has been initialized.

Example:

```java
final int age = 25;
````

We cannot do:

```java
age = 30; // Not allowed
```

---

## 3. Why do we use a final variable?

We use a final variable when we want a value that should not be reassigned.

Example:

```java
final double PI = 3.14159;
```

The reference/value cannot be reassigned after initialization.

---

## 4. What is a final method?

A final method is a method that cannot be overridden by a child class.

Example:

```java
class Parent {

    final void display() {
        System.out.println("Parent");
    }
}
```

The child class cannot override `display()`.

---

## 5. Why do we use a final method?

We use a final method when we want to prevent subclasses from changing the implementation of that method.

Example:

```java
class Bank {

    final void rules() {
        System.out.println("Bank rules");
    }
}
```

A child class cannot override `rules()`.

---

## 6. What is a final class?

A final class is a class that cannot be inherited by another class.

Example:

```java
final class Student {
}
```

We cannot write:

```java
class Child extends Student {
}
```

---

## 7. Why do we use a final class?

We use a final class when we do not want another class to extend it.

Example:

```java
final class SecurityManager {
}
```

A final class prevents inheritance.

---

## 8. Can a final class have methods?

Yes.

A final class can have normal methods, static methods, final methods, variables, constructors, etc.

Example:

```java
final class Student {

    void display() {
        System.out.println("Student");
    }
}
```

---

## 9. Can a final class be inherited?

No.

A final class cannot be extended.

Example:

```java
final class Parent {
}

class Child extends Parent {  // Not allowed
}
```

---

## 10. Can a final method be overloaded?

Yes.

A final method can be overloaded because overloading does not require overriding.

Example:

```java
class Test {

    final void display() {
    }

    final void display(int x) {
    }
}
```

This is valid.

---

## 11. Can a final method be overridden?

No.

A final method cannot be overridden by a child class.

Example:

```java
class Parent {

    final void display() {
    }
}

class Child extends Parent {

    // Not allowed
    // void display() {
    // }
}
```

---

## 12. Can a final variable be changed?

No.

Once a final variable has been assigned a value, it cannot be reassigned.

Example:

```java
final int x = 10;

x = 20; // Not allowed
```

---

## 13. Can a final variable be initialized later?

Yes.

A final variable can be initialized later, as long as it is assigned exactly once before it is used.

Example:

```java
class Test {

    final int x;

    Test() {
        x = 10;
    }
}
```

This is called a blank final variable.

---

## 14. What is a blank final variable?

A blank final variable is a final variable that is declared without an initial value and is initialized later exactly once.

Example:

```java
class Student {

    final int age;

    Student() {
        age = 20;
    }
}
```

---

## 15. What is a static final variable?

A `static final` variable is a class-level constant.

Example:

```java
class MathConstants {

    static final double PI = 3.14159;
}
```

`static` means it belongs to the class.

`final` means it cannot be reassigned.

---

## 16. What is the difference between final and finally?

`final` is a keyword used with variables, methods, and classes.

`finally` is a block used in exception handling.

Example of `final`:

```java
final int x = 10;
```

Example of `finally`:

```java
try {
    int x = 10 / 2;
}
finally {
    System.out.println("Finally block");
}
```

---

## 17. What is the difference between final and finalize()?

`final` is a Java keyword used to restrict modification.

`finalize()` was an old method associated with garbage collection, but it has been deprecated for removal and should not be used for resource cleanup.

For resource management, use mechanisms such as try-with-resources.

---

## 18. Can a constructor be final?

No.

A constructor cannot be declared `final` because constructors cannot be overridden.

Example:

```java
class Student {

    // final Student() { }  // Not allowed
}
```

---

## 19. Can a constructor be static?

No.

A constructor cannot be static because constructors are associated with object creation, while static members belong to the class.

---

## 20. Can an abstract method be final?

No.

An abstract method must be overridden by a concrete subclass, while a final method cannot be overridden.

Therefore, a method cannot be both `abstract` and `final`.

Example:

```java
abstract class Test {

    // abstract final void display(); // Not allowed
}
```

---

## 21. Can a final variable be static?

Yes.

Example:

```java
static final int MAX = 100;
```

This is commonly used to define constants.

---

## 22. Can a final variable be an object reference?

Yes.

A final reference variable cannot point to another object after initialization, but the object's internal state may still be changed if the object itself is mutable.

Example:

```java
final Student s = new Student();

s.name = "Vinamr";   // Allowed

// s = new Student(); // Not allowed
```

Here, the reference `s` cannot be reassigned, but the object's fields may be changed if they are accessible and mutable.

---

## 23. Does final make an object immutable?

No.

Making an object reference final does not automatically make the object immutable.

Example:

```java
final Student s = new Student();

s.name = "Vinamr";
```

The reference cannot change, but the object can still be modified.

---

## 24. What is the difference between final variable and constant?

A final variable cannot be reassigned.

A commonly used Java constant is a `static final` variable because it is shared at the class level.

Example:

```java
static final int MAX_USERS = 100;
```

---

## 25. What are the three main uses of final?

The three main uses are:

### 1. Final Variable

Prevents reassignment.

```java
final int x = 10;
```

### 2. Final Method

Prevents overriding.

```java
final void display() {
}
```

### 3. Final Class

Prevents inheritance.

```java
final class Student {
}
```

---

# Quick Revision

```text
final variable
      ↓
Cannot be reassigned

final method
      ↓
Cannot be overridden

final class
      ↓
Cannot be inherited
```

### Important Interview Points

```text
final variable      → Cannot be reassigned

final method        → Cannot be overridden

final class         → Cannot be extended

final reference     → Cannot point to another object

static final        → Commonly used for constants

final constructor   → Not allowed

abstract + final    → Not allowed
```

# Example

```java
final class Student {

    static final String COLLEGE = "JJMCOE";

    final int id;

    Student(int id) {
        this.id = id;
    }

    final void display() {
        System.out.println("Student ID: " + id);
    }
}
```

Here:

* `Student` is a final class.
* `COLLEGE` is a static final constant.
* `id` is a final variable.
* `display()` is a final method.

````

### Progress

```text
1. OOP                         ✅ DONE
2. Constructors               ✅ DONE
3. Access Modifiers           ✅ DONE
4. static                     ✅ DONE
5. final                      ✅ DONE
6. this and super             ← NEXT
7. String
8. String Pool
9. Wrapper Classes
10. Autoboxing and Unboxing
11. Exception Handling
12. Collections
13. ArrayList
14. LinkedList
15. HashSet
16. TreeSet
17. HashMap
18. TreeMap
19. Comparable and Comparator
20. Java 8 Features
21. Lambda Expressions
22. Functional Interfaces
23. Stream API
24. Multithreading
25. Garbage Collection
26. JVM Internals
````
