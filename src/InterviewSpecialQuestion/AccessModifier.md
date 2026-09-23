Yes bro. ✅ **Next topic: Access Modifiers.**

Copy this directly into your GitHub `.md` file.

````markdown
# Access Modifiers — Java Interview Questions & Answers

## 1. What are access modifiers in Java?

Access modifiers are keywords used to control the visibility and accessibility of classes, variables, methods, and constructors.

Java has four access levels:

1. public
2. protected
3. default
4. private

---

## 2. What are the four access modifiers in Java?

The four access levels are:

- `public`
- `protected`
- `default`
- `private`

---

## 3. What is public access modifier?

The `public` access modifier provides the widest access.

A public member can generally be accessed from any class where the containing class is accessible.

Example:

```java
class Student {

    public String name;
}
````

The `name` variable can be accessed from other classes.

---

## 4. What is private access modifier?

The `private` access modifier provides the most restricted access.

A private member can be accessed only within the same class.

Example:

```java
class Student {

    private int age;

    void display() {
        System.out.println(age);
    }
}
```

Here, `age` can be directly accessed only inside the `Student` class.

---

## 5. What is protected access modifier?

The `protected` access modifier allows access:

* Within the same class
* Within the same package
* Through inheritance in subclasses in other packages

Example:

```java
class Animal {

    protected void eat() {
        System.out.println("Eating");
    }
}
```

A child class can access the protected method.

---

## 6. What is default access modifier?

When no access modifier is specified, Java provides package-private (default) access.

The member can be accessed within the same package.

Example:

```java
class Student {

    int age;
}
```

Here, `age` has default access.

---

## 7. Which is the most restrictive access modifier?

`private` is the most restrictive access modifier.

It allows access only within the same class.

---

## 8. Which is the least restrictive access modifier?

`public` is the least restrictive access modifier.

It provides the widest access.

---

## 9. What is the difference between public, protected, default, and private?

| Access Modifier | Same Class | Same Package | Subclass in Different Package | Other Package    |
| --------------- | ---------- | ------------ | ----------------------------- | ---------------- |
| public          | Yes        | Yes          | Yes                           | Yes              |
| protected       | Yes        | Yes          | Yes                           | No direct access |
| default         | Yes        | Yes          | No                            | No               |
| private         | Yes        | No           | No                            | No               |

Note: For `protected`, a subclass in another package can access the member through inheritance, subject to Java's protected-access rules.

---

## 10. Can we use private with a class?

A top-level class cannot be declared `private`.

Example:

```java
private class Student {
}
```

This is not allowed for a top-level class.

However, a nested class can be private.

Example:

```java
class Outer {

    private class Inner {
    }
}
```

---

## 11. Can we use protected with a class?

A top-level class cannot be declared `protected`.

`protected` can be used for members and nested classes.

Example:

```java
class Outer {

    protected class Inner {
    }
}
```

---

## 12. Can a top-level class be public?

Yes.

A top-level class can be declared `public`.

Example:

```java
public class Student {
}
```

If the class is public, the source file name must match the public class name.

Example:

```text
Student.java
```

for:

```java
public class Student {
}
```

---

## 13. What is the default access level in Java?

If no access modifier is specified, the member has package-private access.

Example:

```java
class Student {

    int age;
}
```

Here, `age` is accessible within the same package.

---

## 14. What is the difference between private and default?

### private

Accessible only within the same class.

### default

Accessible within the same package.

Example:

```java
class Student {

    private int age;

    int marks;
}
```

`age` can be accessed only inside `Student`.

`marks` can be accessed by classes in the same package.

---

## 15. What is the difference between protected and default?

### default

Accessible only within the same package.

### protected

Accessible within the same package and also through inheritance by subclasses in other packages.

---

## 16. Can a private variable be accessed outside the class?

No.

A private variable cannot be directly accessed outside its class.

Example:

```java
class Student {

    private int age;
}
```

This is not allowed:

```java
Student s = new Student();

System.out.println(s.age);
```

A getter method can be used instead.

```java
public int getAge() {
    return age;
}
```

---

## 17. Why do we use private variables?

Private variables are commonly used for data hiding and encapsulation.

Example:

```java
class BankAccount {

    private double balance;

    public double getBalance() {
        return balance;
    }
}
```

This prevents direct modification of `balance` from outside the class.

---

## 18. Can we access a protected member from another package?

A protected member can be accessed from another package through inheritance.

Example:

```java
package parent;

public class Animal {

    protected void eat() {
        System.out.println("Eating");
    }
}
```

A subclass in another package can access it:

```java
package child;

import parent.Animal;

class Dog extends Animal {

    void display() {
        eat();
    }
}
```

---

## 19. Can we reduce the visibility of an overridden method?

No.

When overriding a method, the child class cannot reduce the access level of the parent method.

Example:

```java
class Parent {

    public void show() {
    }
}

class Child extends Parent {

    // Not allowed
    // protected void show() {
    // }
}
```

The child method must have the same or wider access.

---

## 20. Can we increase the visibility of an overridden method?

Yes.

A child class can increase the visibility of an overridden method.

Example:

```java
class Parent {

    protected void show() {
    }
}

class Child extends Parent {

    public void show() {
    }
}
```

This is allowed.

---

## 21. Can constructors have access modifiers?

Yes.

Constructors can use:

* public
* protected
* private
* default

Example:

```java
class Student {

    public Student() {
    }

    protected Student(int age) {
    }

    private Student(String name) {
    }

    Student(double marks) {
    }
}
```

---

## 22. Why would we make a constructor private?

A private constructor prevents other classes from directly creating objects using that constructor.

It is commonly used in designs such as the Singleton pattern and utility classes.

Example:

```java
class Test {

    private Test() {
    }
}
```

---

## 23. Can methods have access modifiers?

Yes.

Methods can be declared using:

* public
* protected
* private
* default

Example:

```java
class Student {

    public void method1() {
    }

    protected void method2() {
    }

    private void method3() {
    }

    void method4() {
    }
}
```

---

## 24. Can variables have access modifiers?

Yes.

Instance variables and class variables can use access modifiers.

Example:

```java
class Student {

    public int a;
    protected int b;
    int c;
    private int d;
}
```

---

## 25. Why are access modifiers important?

Access modifiers help us:

* Control access to data
* Implement encapsulation
* Protect internal implementation
* Improve security
* Reduce unwanted modification
* Maintain clean class design

---

## 26. Which access modifier is commonly used for encapsulation?

`private` is commonly used for encapsulation.

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

Here, direct access to `age` is restricted.

---

## 27. What happens if no access modifier is specified?

If no access modifier is specified, Java gives the member package-private (default) access.

Example:

```java
class Student {

    int age;
}
```

The `age` variable can be accessed by classes in the same package.

---

## 28. Can an interface be private?

A top-level interface cannot be private.

However, a nested interface can have access modifiers such as `private`, depending on where it is declared.

---

## 29. Can an interface be protected?

A top-level interface cannot be protected.

A nested interface can be declared protected.

---

## 30. What is the most important difference between protected and public?

`public` members can be accessed broadly from outside packages.

`protected` members have more restricted access: they are accessible within the same package and through inheritance in other packages.

---

# Quick Revision

## Access Modifiers

```text
public
   ↓
protected
   ↓
default
   ↓
private
```

From widest access to most restricted access.

### Remember:

```text
public     → Everywhere
protected  → Same package + subclasses
default    → Same package
private    → Same class
```

---

# Interview Example

## Question: Why do we make variables private?

### Answer:

We make variables private to achieve data hiding and encapsulation. It prevents direct access from outside the class, and we can control access using methods such as getters and setters.

Example:

```java
class Student {

    private int age;

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }
}
```

````

### Progress

```text
1. OOP                         ✅ DONE
2. Constructors               ✅ DONE
3. Access Modifiers            ✅ DONE
4. static                      ← NEXT
5. final
6. this and super
7. String
8. String Pool
9. Wrapper Classes
10. Autoboxing and Unboxing
11. Exception Handling
12. Collections
...
````
