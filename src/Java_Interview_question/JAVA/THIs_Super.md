Next topic: **`this` and `super`**. Copy this directly into your GitHub `.md` file.

````markdown
# this and super — Java Interview Questions & Answers

## 1. What is `this` keyword in Java?

`this` is a reference variable that refers to the current object.

It is mainly used to access the current object's variables, methods, and constructors.

---

## 2. Why do we use `this` keyword?

The most common use is to differentiate between instance variables and local variables when they have the same name.

Example:

```java
class Student {

    String name;

    Student(String name) {
        this.name = name;
    }
}
````

Here:

* `this.name` → instance variable
* `name` → constructor parameter

---

## 3. Can `this` be used to call a method?

Yes.

`this` can be used to call the current object's method.

Example:

```java
class Student {

    void display() {
        System.out.println("Student");
    }

    void show() {
        this.display();
    }
}
```

`this.display()` calls the method of the current object.

---

## 4. Can `this` be used to access an instance variable?

Yes.

Example:

```java
class Student {

    String name;

    void display() {
        System.out.println(this.name);
    }
}
```

Here, `this.name` refers to the instance variable of the current object.

---

## 5. What is `this()` in Java?

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

Here, `this("Vinamr")` calls the parameterized constructor of the same class.

---

## 6. What is the difference between `this` and `this()`?

### `this`

Refers to the current object.

```java
this.name;
```

### `this()`

Calls another constructor of the same class.

```java
this("Vinamr");
```

---

## 7. Where should `this()` be written in a constructor?

`this()` must be the first statement of the constructor.

Example:

```java
class Student {

    Student() {
        this(10);
    }

    Student(int age) {
        System.out.println(age);
    }
}
```

This is not allowed:

```java
Student() {
    System.out.println("Hello");
    this(10);  // Not allowed
}
```

---

## 8. Can we use `this()` and `super()` together in the same constructor?

No.

Both `this()` and `super()` must be the first statement of a constructor, so they cannot be directly used together in the same constructor.

---

## 9. Can we use `this` inside a static method?

No.

`this` refers to the current object, but a static method belongs to the class and does not have a current object reference.

Example:

```java
class Test {

    static void display() {
        // System.out.println(this); // Not allowed
    }
}
```

---

# super Keyword

## 10. What is `super` keyword in Java?

`super` is a reference used to refer to the immediate parent class.

It can be used to:

* Access parent class variables
* Call parent class methods
* Call parent class constructor

---

## 11. Why do we use `super`?

We use `super` when we want to access members of the immediate parent class.

Example:

```java
class Animal {

    String name = "Animal";
}

class Dog extends Animal {

    String name = "Dog";

    void display() {
        System.out.println(super.name);
    }
}
```

Output:

```text
Animal
```

---

## 12. How do we access a parent class variable using `super`?

We use:

```java
super.variableName;
```

Example:

```java
class Parent {

    int x = 10;
}

class Child extends Parent {

    int x = 20;

    void display() {
        System.out.println(super.x);
    }
}
```

Output:

```text
10
```

---

## 13. How do we call a parent class method using `super`?

We use:

```java
super.methodName();
```

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

Output:

```text
Animal sound
Dog sound
```

---

## 14. What is `super()`?

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

Output:

```text
Animal constructor
Dog constructor
```

---

## 15. Where should `super()` be written?

`super()` must be the first statement in a constructor.

Example:

```java
class Dog extends Animal {

    Dog() {
        super();
        System.out.println("Dog");
    }
}
```

---

## 16. What happens if we don't write `super()`?

If we don't explicitly write `super()`, Java implicitly calls the no-argument constructor of the immediate parent class, provided such a constructor is accessible.

Example:

```java
class Animal {

    Animal() {
        System.out.println("Animal");
    }
}

class Dog extends Animal {

    Dog() {
        // super() is automatically called
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

## 17. What happens if the parent class does not have a no-argument constructor?

If the child constructor does not explicitly call an accessible parent constructor, Java tries to insert `super()` automatically.

If the parent has no accessible no-argument constructor, compilation fails.

Example:

```java
class Animal {

    Animal(String name) {
        System.out.println(name);
    }
}

class Dog extends Animal {

    Dog() {
        // Compilation error
    }
}
```

We must explicitly call the parent constructor:

```java
class Dog extends Animal {

    Dog() {
        super("Animal");
    }
}
```

---

## 18. Can `super` be used inside a static method?

No.

`super` refers to the parent part of the current object, while a static method does not have a current object reference.

---

## 19. What is the difference between `this` and `super`?

| `this`                                   | `super`                            |
| ---------------------------------------- | ---------------------------------- |
| Refers to current object                 | Refers to immediate parent class   |
| Accesses current class members           | Accesses parent class members      |
| `this()` calls current class constructor | `super()` calls parent constructor |
| Used with current class                  | Used with parent class             |

---

## 20. What is the difference between `this()` and `super()`?

### `this()`

Calls another constructor of the same class.

```java
this(10);
```

### `super()`

Calls a constructor of the immediate parent class.

```java
super(10);
```

---

## 21. Can `this` be passed as an argument?

Yes.

We can pass `this` as an argument to a method or constructor.

Example:

```java
class Student {

    void display(Student s) {
        System.out.println("Student");
    }

    void show() {
        display(this);
    }
}
```

Here, the current object is passed as an argument.

---

## 22. Can `this` be returned from a method?

Yes.

A method can return `this`.

Example:

```java
class Student {

    Student getObject() {
        return this;
    }
}
```

Here, the current object is returned.

---

## 23. Can `super` be used to access a private parent variable?

No.

Private members of a parent class are not directly accessible in a child class.

Example:

```java
class Parent {

    private int x = 10;
}

class Child extends Parent {

    void display() {
        // System.out.println(super.x); // Not allowed
    }
}
```

The parent class can provide a method to access the value if required.

---

## 24. Can `super` access a static member of the parent class?

It is technically possible to refer to an inherited accessible static member through `super`, but it is not the preferred style.

For static members, use the parent class name.

Example:

```java
class Parent {

    static int x = 10;
}

class Child extends Parent {

    void display() {
        System.out.println(Parent.x);
    }
}
```

---

## 25. What is constructor chaining using `this()` and `super()`?

Constructor chaining means one constructor calls another constructor.

Example:

```java
class Parent {

    Parent() {
        System.out.println("Parent");
    }
}

class Child extends Parent {

    Child() {
        this(10);
    }

    Child(int x) {
        super();
        System.out.println(x);
    }
}
```

Here:

```text
Child()
   ↓
Child(int)
   ↓
Parent()
```

---

## 26. What is the order of execution when `this()` and `super()` are involved?

The parent constructor executes before the child constructor body.

Example:

```java
class Parent {

    Parent() {
        System.out.println("Parent");
    }
}

class Child extends Parent {

    Child() {
        this(10);
    }

    Child(int x) {
        super();
        System.out.println("Child");
    }
}
```

Output:

```text
Parent
Child
```

---

# Quick Revision

## `this`

```text
this
 ↓
Current object

this.variable
 ↓
Current class variable

this.method()
 ↓
Current class method

this()
 ↓
Another constructor of same class
```

## `super`

```text
super
 ↓
Immediate parent class

super.variable
 ↓
Parent variable

super.method()
 ↓
Parent method

super()
 ↓
Parent constructor
```

# Important Interview Rules

```text
this()  → Must be first statement in constructor

super() → Must be first statement in constructor

this()  → Calls same-class constructor

super() → Calls parent-class constructor

this    → Cannot be used in static context

super   → Cannot be used in static context

this() and super() → Cannot both be directly used
                      in the same constructor
```

# Example

```java
class Animal {

    String name = "Animal";

    Animal() {
        System.out.println("Animal constructor");
    }

    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {

    String name = "Dog";

    Dog() {
        super();
    }

    void display() {

        System.out.println(this.name);
        System.out.println(super.name);

        this.sound();
        super.sound();
    }
}
```

Here:

* `this.name` → current class variable
* `super.name` → parent class variable
* `this.sound()` → current class method
* `super.sound()` → parent class method
* `super()` → parent constructor

````

### Progress

````
