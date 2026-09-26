# Constructors — Java Interview Questions & Answers

````markdown
# Constructors — Java Interview Questions & Answers

## 1. What is a constructor?

A constructor is a special member of a class that is used to initialize an object.

Important points:

- Constructor name must be the same as the class name.
- A constructor does not have a return type.
- It is called automatically when an object is created.

Example:

```java
class Student {

    Student() {
        System.out.println("Constructor called");
    }
}

Student s = new Student();
````

---

## 2. Why do we use constructors?

We use constructors mainly to initialize the object when it is created.

Example:

```java
class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

Here, the constructor initializes `name` and `age`.

---

## 3. What are the types of constructors in Java?

The commonly discussed types are:

1. No-argument constructor
2. Parameterized constructor

A compiler-provided default constructor is also commonly discussed.

---

## 4. What is a no-argument constructor?

A no-argument constructor is a constructor that does not accept any parameters.

Example:

```java
class Student {

    Student() {
        System.out.println("Student created");
    }
}
```

---

## 5. What is a parameterized constructor?

A parameterized constructor is a constructor that accepts one or more parameters.

Example:

```java
class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

---

## 6. What is a default constructor?

If a class does not declare any constructor, the Java compiler provides a constructor with no parameters.

Example:

```java
class Student {

}
```

The compiler provides a no-argument constructor.

Important: If you define any constructor yourself, the compiler does not automatically provide this constructor.

---

## 7. What is the difference between default constructor and no-argument constructor?

A **default constructor** is the constructor automatically provided by the compiler when no constructor is declared.

A **no-argument constructor** is any constructor that has zero parameters, whether written by the programmer or provided by the compiler.

Example:

```java
class Student {

    Student() {
        // Programmer-defined no-argument constructor
    }
}
```

---

## 8. Can we have multiple constructors in one class?

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

## 9. What is constructor overloading?

Constructor overloading means having multiple constructors in the same class with different parameter lists.

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

## 10. Can a constructor be inherited?

No.

Constructors are not inherited by child classes.

However, the child constructor can call the parent constructor using `super()`.

Example:

```java
class Animal {

    Animal() {
        System.out.println("Animal constructor");
    }
}

class Dog extends Animal {

    Dog() {
        super();
    }
}
```

---

## 11. Can a constructor be overridden?

No.

Constructors cannot be overridden because constructors are not inherited.

Method overriding applies to methods, not constructors.

---

## 12. Can a constructor be static?

No.

A constructor cannot be `static` because a constructor is associated with object creation, while `static` members belong to the class.

---

## 13. Can a constructor be final?

No.

A constructor cannot be `final` because constructors cannot be overridden.

---

## 14. Can a constructor be private?

Yes.

A constructor can be private.

A private constructor prevents other classes from directly creating objects using that constructor.

Example:

```java
class Student {

    private Student() {
    }
}
```

A private constructor is commonly used in patterns such as Singleton.

---

## 15. Can an abstract class have a constructor?

Yes.

An abstract class can have a constructor.

The constructor is called when a concrete child class object is created.

Example:

```java
abstract class Animal {

    Animal() {
        System.out.println("Animal constructor");
    }
}

class Dog extends Animal {

    Dog() {
        System.out.println("Dog constructor");
    }
}
```

---

## 16. Can an interface have a constructor?

No.

An interface cannot have a constructor because we cannot create an object directly from an interface.

Example:

```java
interface Animal {

}
```

We cannot write:

```java
Animal a = new Animal(); // Not allowed
```

---

## 17. What happens if we don't create a constructor?

If we do not declare any constructor in a class, the compiler provides a default no-argument constructor.

Example:

```java
class Student {

}
```

The compiler provides a default constructor.

However, if we create a parameterized constructor:

```java
class Student {

    Student(String name) {
    }
}
```

The compiler will not automatically provide a no-argument constructor.

---

## 18. What is constructor chaining?

Constructor chaining means calling one constructor from another constructor.

It can be done using:

* `this()`
* `super()`

Example:

```java
class Student {

    Student() {
        this("Vinamr");
    }

    Student(String name) {
        System.out.println(name);
    }
}
```

---

## 19. What is `this()` in a constructor?

`this()` is used to call another constructor of the same class.

Example:

```java
class Student {

    Student() {
        this("Vinamr");
    }

    Student(String name) {
        System.out.println(name);
    }
}
```

Here, `this("Vinamr")` calls the parameterized constructor.

Important: `this()` must be the first statement in the constructor.

---

## 20. What is `super()` in a constructor?

`super()` is used to call the constructor of the immediate parent class.

Example:

```java
class Animal {

    Animal() {
        System.out.println("Animal constructor");
    }
}

class Dog extends Animal {

    Dog() {
        super();
        System.out.println("Dog constructor");
    }
}
```

Here, `super()` calls the parent class constructor.

Important: `super()` must be the first statement in the constructor.

---

## 21. What happens if we don't write `super()` in a child constructor?

If we do not explicitly write `super()`, Java implicitly inserts a call to the no-argument constructor of the parent class, provided such a constructor is accessible.

Example:

```java
class Animal {

    Animal() {
        System.out.println("Animal");
    }
}

class Dog extends Animal {

    Dog() {
        // super() is implicitly called
        System.out.println("Dog");
    }
}
```

---

## 22. What is the order of constructor execution in inheritance?

The parent class constructor executes first, followed by the child class constructor.

Example:

```java
class Animal {

    Animal() {
        System.out.println("Animal");
    }
}

class Dog extends Animal {

    Dog() {
        System.out.println("Dog");
    }
}
```

Output:

```text
Animal
Dog
```

---

## 23. Can we call `this()` and `super()` together in the same constructor?

No.

Both `this()` and `super()` must be the first statement of a constructor, so they cannot be used together in the same constructor.

You can use `this()` to call another constructor, and that constructor can eventually call `super()`.

---

## 24. Is constructor overloading compile-time polymorphism?

Yes.

Constructor overloading is resolved at compile time based on the arguments passed during object creation.

Example:

```java
class Student {

    Student() {
    }

    Student(String name) {
    }
}

Student s1 = new Student();
Student s2 = new Student("Vinamr");
```

The compiler determines which constructor should be called.

---

## 25. What is the difference between constructor and method?

| Constructor                   | Method                       |
| ----------------------------- | ---------------------------- |
| Used to initialize an object  | Used to perform an operation |
| Same name as class            | Can have any valid name      |
| Does not have a return type   | Can have a return type       |
| Called during object creation | Called explicitly            |
| Cannot be overridden          | Can be overridden            |
| Cannot be inherited           | Methods can be inherited     |

---

## 26. Can a constructor return a value?

No.

A constructor cannot have a return type.

Example:

```java
class Student {

    Student() {
    }
}
```

If we write:

```java
void Student() {
}
```

it is not a constructor. It is a method named `Student`.

---

## 27. Can we use access modifiers with constructors?

Yes.

Constructors can use:

* public
* protected
* private
* default

Example:

```java
public Student() {
}

protected Student() {
}

private Student() {
}

Student() {
}
```

---

## 28. Can a constructor be abstract?

No.

A constructor cannot be abstract because constructors must have an implementation and are used to initialize objects.

---

## 29. Can a constructor be synchronized?

No.

A constructor cannot be declared `synchronized`.

---

## 30. What happens when we create an object?

When we create an object:

```java
Student s = new Student();
```

The JVM allocates memory for the object, initializes its fields with default values, and then executes the appropriate constructor.

If the class has a parent class, the parent constructor is executed as part of the initialization process before the child constructor body completes.

````

#
...
````

**Next topic: Access Modifiers — we'll do the interview questions in the same format.**
