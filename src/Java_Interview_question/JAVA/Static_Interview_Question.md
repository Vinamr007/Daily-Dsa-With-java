Next topic: **`static` in Java**. Copy this directly into your GitHub `.md` file.

````markdown
# static Keyword — Java Interview Questions & Answers

## 1. What is the `static` keyword in Java?

The `static` keyword is used to create members that belong to the class rather than to individual objects.

It can be used with:

- Variables
- Methods
- Blocks
- Nested classes

---

## 2. What is a static variable?

A static variable is a variable that belongs to the class rather than to individual objects.

Only one shared copy is maintained for the class.

Example:

```java
class Student {

    static String college = "JJMCOE";
    String name;
}
````

All Student objects share the same `college` variable.

---

## 3. Why do we use static variables?

We use static variables when a value needs to be shared among all objects of a class.

Example:

```java
class Student {

    static String college = "JJMCOE";
}
```

The college name is common for all students, so it can be static.

---

## 4. How can we access a static variable?

A static variable can be accessed using the class name.

Example:

```java
class Student {

    static String college = "JJMCOE";
}
```

We can access it as:

```java
//System.out.println(Student.college);
```

It can also be accessed through an object, but using the class name is preferred.

---

## 5. What is a static method?

A static method is a method that belongs to the class rather than to an object.

It can be called without creating an object.

Example:

```java
class Student {

    static void display() {
        System.out.println("Hello");
    }
}
```

Call:

```java
//Student.display();
```

---

## 6. Why is the main method static?

The main method is static so that the JVM can call it without creating an object of the class.

```java
public static void main(String[] args);
```

The JVM can directly call:

```java
//ClassName.main(args);
```

without creating an object first.

---

## 7. Can a static method access a non-static variable directly?

No.

A static method does not have a specific object reference, so it cannot directly access an instance variable.

Example:

```java
class Test {

    int x = 10;

    static void display() {

        // System.out.println(x); // Not allowed
    }
}
```

We need an object to access `x`.

```java
static void display() {

    Test obj = new Test();

    System.out.println(obj.x);
}
```

---

## 8. Can a static method access a static variable?

Yes.

A static method can directly access static variables.

Example:

```java
class Test {

    static int x = 10;

    static void display() {

        System.out.println(x);
    }
}
```

---

## 9. Can a static method access a non-static method directly?

No.

A static method cannot directly call an instance method because the instance method belongs to an object.

Example:

```java
class Test {

    void show() {
        System.out.println("Show");
    }

    static void display() {

        // show(); // Not allowed
    }
}
```

We need an object:

```java
static void display() {

    Test obj = new Test();

    obj.show();
}
```

---

## 10. Can a non-static method access a static variable?

Yes.

A non-static method can access both static and non-static members.

Example:

```java
class Test {

    static int x = 10;
    int y = 20;

    void display() {

        System.out.println(x);
        System.out.println(y);
    }
}
```

---

## 11. Can a static method be overridden?

No.

Static methods are not overridden. They are hidden when a child class defines a static method with the same signature.

Example:

```java
class Parent {

    static void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {

    static void show() {
        System.out.println("Child");
    }
}
```

This is called method hiding, not method overriding.

---

## 12. Can a static method be overloaded?

Yes.

Static methods can be overloaded.

Example:

```java
class Test {

    static void add(int a, int b) {
    }

    static void add(int a, int b, int c) {
    }
}
```

---

## 13. Can a static variable be inherited?

Yes.

Static members are associated with the class, but a child class can access an inherited static member if the access rules allow it.

Example:

```java
class Parent {

    static int x = 10;
}

class Child extends Parent {
}
```

We can access:

```java
//System.out.println(Child.x);
```

---

## 14. What is a static block?

A static block is a block of code declared using the `static` keyword.

It is executed when the class is initialized.

Example:

```java
class Test {

    static {
        System.out.println("Static block executed");
    }
}
```

---

## 15. Why do we use a static block?

A static block is commonly used to perform class-level initialization that needs to happen when the class is initialized.

Example:

```java
class Test {

    static int x;

    static {
        x = 100;
    }
}
```

---

## 16. When is a static block executed?

A static block is executed when the class is initialized by the JVM, generally before the first active use of that class.

Example:

```java
class Test {

    static {
        System.out.println("Static block");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
    }
}
```

Output:

```text
Static block
Main method
```

---

## 17. Can we have multiple static blocks?

Yes.

A class can contain multiple static blocks.

They execute in the order in which they appear in the class.

Example:

```java
class Test {

    static {
        System.out.println("Block 1");
    }

    static {
        System.out.println("Block 2");
    }
}
```

Output:

```text
Block 1
Block 2
```

---

## 18. Can a static block access a non-static variable directly?

No.

A static block does not have an object reference, so it cannot directly access instance variables.

Example:

```java
class Test {

    int x = 10;

    static {

        // System.out.println(x); // Not allowed
    }
}
```

---

## 19. Can a static block access a static variable?

Yes.

Example:

```java
class Test {

    static int x = 10;

    static {

        System.out.println(x);
    }
}
```

---

## 20. Can we use `this` inside a static method?

No.

The `this` keyword refers to the current object, but a static method belongs to the class and does not have a current object reference.

Example:

```java
class Test {

    static void display() {

        // System.out.println(this); // Not allowed
    }
}
```

---

## 21. Can we use `super` inside a static method?

No.

`super` refers to the parent-class part of the current object, while a static method does not have a current object reference.

---

## 22. What is the difference between static and non-static variables?

| Static Variable                         | Non-Static Variable             |
| --------------------------------------- | ------------------------------- |
| Belongs to the class                    | Belongs to an object            |
| One shared copy                         | Each object has its own copy    |
| Can be accessed using class name        | Usually accessed using object   |
| Created as part of class initialization | Associated with object creation |

Example:

```java
class Student {

    static String college = "JJMCOE";

    String name;
}
```

`college` is shared, while each object has its own `name`.

---

## 23. What is the difference between static and non-static methods?

| Static Method                           | Non-Static Method           |
| --------------------------------------- | --------------------------- |
| Belongs to class                        | Belongs to object           |
| Can be called using class name          | Usually called using object |
| Cannot directly access instance members | Can access instance members |
| Cannot use `this`                       | Can use `this`              |

---

## 24. Can we create an object inside a static method?

Yes.

Example:

```java
class Test {

    int x = 10;

    static void display() {

        Test obj = new Test();

        System.out.println(obj.x);
    }
}
```

---

## 25. Can a constructor be static?

No.

A constructor is used to initialize an object, while `static` members belong to the class.

Therefore, a constructor cannot be static.

---

## 26. Can an abstract method be static?

No.

An abstract method requires implementation in a subclass, while a static method belongs to the class and is not overridden.

Therefore, a method cannot be both `abstract` and `static`.

---

## 27. Can a static variable be final?

Yes.

A static final variable is commonly used to create a class-level constant.

Example:

```java
class MathConstants {

    static final double PI = 3.14159;
}
```

It can be accessed using:

```java
//MathConstants.PI;
```

---

## 28. What is a static final variable?

A static final variable is a class-level constant.

Example:

```java
static final int MAX_VALUE = 100;
```

`static` means it belongs to the class.

`final` means its value cannot be reassigned.

---

## 29. What is the difference between static variable and static final variable?

### Static variable

Its value can be changed.

```java
static int count = 10;
```

### Static final variable

Its reference/value cannot be reassigned after initialization.

```java
static final int MAX = 100;
```

---

## 30. Why is static useful in Java?

Static is useful when a member should belong to the class rather than individual objects.

Common uses include:

* Shared variables
* Utility methods
* Constants
* Class-level initialization
* The `main()` method

---

# Quick Revision

```text
static variable
       ↓
Belongs to class

static method
       ↓
Belongs to class

static block
       ↓
Class initialization

static final
       ↓
Class-level constant
```

### Important Interview Rules

```text
Static method → Cannot directly access instance members

Static method → Cannot use this

Static method → Cannot use super

Static method → Can access static members

Static method → Can create/use objects

Static method → Can be overloaded

Static method → Cannot be overridden
                  (method hiding instead)
```

# Example

```java
class Student {

    static String college = "JJMCOE";

    String name;

    static void displayCollege() {
        System.out.println(college);
    }

    void displayStudent() {
        System.out.println(name);
        System.out.println(college);
    }
}
```

Here:

* `college` is a static variable.
* `displayCollege()` is a static method.
* `name` is an instance variable.
* `displayStudent()` is a non-static method.

````




