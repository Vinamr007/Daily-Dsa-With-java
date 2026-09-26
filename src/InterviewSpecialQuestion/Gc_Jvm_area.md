Yes. For **Garbage Collection + JVM Memory Areas**, these are the important interview questions. I’ll keep it focused like the multithreading section.

````markdown
# Garbage Collection + JVM Memory Areas — Java Interview Questions & Answers

# PART 1 — GARBAGE COLLECTION

## 1. What is Garbage Collection in Java?

Garbage Collection (GC) is the JVM's automatic process of identifying and reclaiming heap memory occupied by objects that are no longer reachable by the application.

It helps manage memory automatically.

---

## 2. How does Garbage Collector know which object is eligible for GC?

GC mainly determines eligibility based on **reachability**.

If an object is no longer reachable from GC roots, it can become eligible for garbage collection.

Example:

```java
Student s = new Student();

s = null;
````

The `Student` object no longer has a reference from `s`, so it may become eligible for GC if there are no other reachable references to it.

---

## 3. What are GC Roots?

GC Roots are starting points used by the garbage collector to determine which objects are reachable.

Common examples include:

* Local variables/references in active stack frames
* Static references
* Active Java threads
* JNI references

If an object cannot be reached from the GC roots, it can become eligible for GC.

---

## 4. Can we force Garbage Collection?

No.

We can request the JVM to perform GC using:

```java
System.gc();
```

or:

```java
Runtime.getRuntime().gc();
```

But the JVM is not required to perform GC immediately.

---

## 5. What happens when an object becomes eligible for GC?

The object becomes eligible for reclamation.

The garbage collector may later reclaim the memory occupied by that object.

Important:

```text
Eligible for GC ≠ Immediately garbage collected
```

---

## 6. Can an object become eligible for GC even if it was created recently?

Yes.

GC eligibility depends on reachability, not on how old the object is.

Example:

```java
Student s = new Student();

s = null;
```

The object can become eligible even though it was just created.

---

## 7. Can an object become reachable again after becoming eligible for GC?

In some cases, code can make an otherwise unreachable object reachable again before it is actually reclaimed.

This is called **object resurrection**.

However, relying on resurrection is not recommended.

---

## 8. What is a memory leak in Java?

A memory leak occurs when objects are no longer needed by the application but are still reachable, so the garbage collector cannot reclaim them.

Example:

```text
Object no longer needed
        ↓
Still referenced
        ↓
GC considers it reachable
        ↓
Memory remains occupied
```

---

## 9. What is the difference between Stack and Heap?

### Stack

Stores information related to method execution, such as:

* Local variables
* Method call frames
* References to objects

Each thread has its own stack.

### Heap

Stores objects and arrays.

The heap is shared among threads.

```text
JVM
 |
 +--- Stack → Per Thread
 |
 +--- Heap  → Shared
```

---

## 10. What is Young Generation and Old Generation?

In generational garbage collectors, the heap is conceptually divided into generations.

### Young Generation

Used for relatively new objects.

### Old Generation

Used for objects that survive enough collections and are promoted.

The exact implementation depends on the garbage collector being used.

---

## 11. What are Eden and Survivor spaces?

In collectors that use the traditional generational layout:

```text
Young Generation
       |
       +--- Eden
       |
       +--- Survivor
              |
              +--- S0
              +--- S1
```

New objects are typically allocated in Eden.

Objects that survive young collections may be copied between survivor spaces and eventually promoted to the old generation.

---

## 12. What is Minor GC?

A Minor GC generally refers to garbage collection focused on the young generation in collectors that use generational collection.

It is usually more frequent than old-generation collection.

---

## 13. What is Major GC / Full GC?

Terminology can vary between JVMs and garbage collectors.

In interviews, you may hear:

* Major GC → collection involving the old generation
* Full GC → collection involving much or all of the heap and potentially other JVM memory areas

The exact behavior depends on the collector.

---

# PART 2 — JVM MEMORY AREAS

## 14. What are the main JVM memory areas?

Important JVM runtime memory areas are:

```text
JVM Runtime Data Areas
 |
 +--- Heap
 |
 +--- Stack
 |
 +--- Method Area
 |
 +--- PC Register
 |
 +--- Native Method Stack
```

---

## 15. What is Heap memory?

Heap is the runtime memory area where objects and arrays are allocated.

Example:

```java
Student s = new Student();
```

The `Student` object is allocated on the heap.

The heap is shared among threads.

---

## 16. What is Stack memory?

Each thread has its own JVM stack.

It contains stack frames for method calls.

A frame can contain:

* Local variables
* Operand stack
* Method execution information
* References to objects

Example:

```java
void test() {
    int x = 10;
}
```

`x` is a local variable associated with the current stack frame.

---

## 17. What is Method Area?

The Method Area is a JVM runtime data area that stores class-level information.

It can contain information such as:

* Class metadata
* Method information
* Runtime constant pool
* Field information

In HotSpot, class metadata is stored in **Metaspace**, which is native memory.

---

## 18. What is Metaspace?

Metaspace is the HotSpot JVM's native-memory area used for class metadata.

It replaced the PermGen implementation in Java 8.

Important:

```text
Java 7 and earlier → PermGen

Java 8+ HotSpot → Metaspace
```

---

## 19. What is PC Register?

PC stands for **Program Counter**.

Each thread has its own PC register.

It keeps track of the address of the JVM instruction currently being executed by that thread.

---

## 20. What is Native Method Stack?

The Native Method Stack supports execution of native methods.

Native methods are methods implemented in languages such as C or C++ and accessed through mechanisms such as JNI.

---

## 21. Is Stack memory shared between threads?

No.

Each thread has its own JVM stack.

```text
Thread 1 → Stack 1
Thread 2 → Stack 2
Thread 3 → Stack 3
```

The heap, however, is shared.

---

## 22. Is Heap memory shared between threads?

Yes.

All threads in the same JVM generally share the heap.

Therefore, shared objects can create concurrency issues if accessed without proper synchronization.

---

## 23. Where is an object stored?

Objects are generally allocated on the heap.

Example:

```java
Student s = new Student();
```

Conceptually:

```text
Stack:
s
 |
 ↓
Heap:
Student object
```

The exact JVM implementation may perform optimizations such as escape analysis, so this is the standard conceptual model rather than an absolute implementation rule.

---

## 24. What happens when Stack memory is exhausted?

A thread can throw:

```text
StackOverflowError
```

A common cause is very deep or infinite recursion.

Example:

```java
void test() {
    test();
}
```

---

## 25. What happens when Heap memory is exhausted?

The JVM can throw:

```text
OutOfMemoryError
```

For example, if the application keeps allocating objects and the JVM cannot reclaim enough memory.

---

## 26. StackOverflowError vs OutOfMemoryError?

### StackOverflowError

Usually related to a thread's stack being exhausted.

Common example:

```text
Infinite recursion
```

### OutOfMemoryError

Occurs when the JVM cannot allocate required memory.

Common example:

```text
Too many objects / insufficient heap
```

---

# IMPORTANT INTERVIEW SCENARIO

## 27. Consider this code:

```java
public static void main(String[] args) {

    Student s1 = new Student();

    Student s2 = new Student();

    s1 = null;
}
```

Which object is eligible for GC?

The first `Student` object becomes eligible for GC, assuming there are no other references to it.

The second object is still reachable through `s2`.

```text
s1 → null

First Student → Eligible for GC

s2 → Second Student

Second Student → Not eligible
```

---

## 28. What happens in this example?

```java
Student s1 = new Student();
Student s2 = s1;

s1 = null;
```

Is the object eligible for GC?

No.

Because `s2` still refers to the object.

```text
s1 → null

s2 ─────→ Student Object
```

The object is still reachable.

---

## 29. What happens in this example?

```java
Student s1 = new Student();
Student s2 = new Student();

s1 = s2;
```

The first `Student` object becomes eligible for GC, assuming no other references exist.

The second object is still referenced by `s1` and `s2`.

---

# QUICK REVISION

```text
Garbage Collection
        ↓
Automatic memory management
        ↓
Checks object reachability
        ↓
Unreachable object
        ↓
Eligible for GC
```

```text
JVM Memory Areas

Heap
→ Objects and arrays
→ Shared between threads

Stack
→ Method frames/local variables
→ Each thread has its own stack

Method Area
→ Class-level metadata

Metaspace
→ HotSpot implementation for class metadata
→ Native memory

PC Register
→ Current JVM instruction for each thread

Native Method Stack
→ Supports native method execution
```

# MOST IMPORTANT QUESTIONS TO REMEMBER

```text
1. What is Garbage Collection?

2. How does GC identify an object as eligible?

3. What are GC Roots?

4. Can we force GC?

5. What is memory leak?

6. Heap vs Stack?

7. Young Generation vs Old Generation?

8. Eden and Survivor spaces?

9. What is Minor GC?

10. What is Full GC?

11. What is Metaspace?

12. What is PC Register?

13. What is Native Method Stack?

14. StackOverflowError vs OutOfMemoryError?

15. Is Heap shared between threads?

16. Is Stack shared between threads?

17. Given a code snippet, identify which objects are eligible for GC.
```

### Progress

```text
1. OOP                         ✅
2. Constructors               ✅
3. Access Modifiers           ✅
4. static                     ✅
5. final                      ✅
6. this and super             ✅
7. String                     ✅
8. String Pool                ✅
9. Wrapper + Autoboxing       ✅
10. Exception Handling        ✅
11. Collections               ✅
12. Multithreading            ✅
13. Garbage Collection        ✅
14. JVM Memory Areas          ✅
```

**This covers the important GC + JVM-area interview concepts without going too deep into GC algorithms.**
