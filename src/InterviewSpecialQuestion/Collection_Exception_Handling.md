Yes bro. 👍 From now on I'll keep it **interview-focused**: only the important questions, but enough to cover the complete topic.

For this section, we'll combine **Exception Handling + Collections**.

````markdown
# Exception Handling + Collections — Java Interview Questions & Answers

# PART 1 — EXCEPTION HANDLING

## 1. What is Exception Handling in Java?

Exception handling is a mechanism used to handle runtime problems so that the normal flow of the program can continue.

Java mainly uses:

- try
- catch
- finally
- throw
- throws

---

## 2. What is the difference between Error and Exception?

### Exception

An exception is a problem that an application can potentially handle.

Example:

```java
ArithmeticException
NullPointerException
IOException
````

### Error

An Error usually represents a serious problem related to the JVM or system that applications generally should not try to handle.

Example:

```java
OutOfMemoryError
StackOverflowError
```

---

## 3. What is the difference between checked and unchecked exceptions?

### Checked Exception

Checked at compile time.

The compiler requires them to be handled or declared where applicable.

Examples:

```java
IOException
SQLException
```

### Unchecked Exception

Occurs at runtime and extends `RuntimeException`.

Examples:

```java
NullPointerException
ArithmeticException
ArrayIndexOutOfBoundsException
```

---

## 4. What is the difference between `throw` and `throws`?

### throw

Used to explicitly throw an exception.

```java
throw new ArithmeticException("Invalid value");
```

### throws

Used in a method declaration to declare that the method may pass an exception to its caller.

```java
void readFile() throws IOException {
}
```

---

## 5. What is try-catch?

`try` contains code that may throw an exception.

`catch` handles the exception.

```java
try {
    int x = 10 / 0;
}
catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
}
```

---

## 6. What is finally?

`finally` is a block that normally executes after the try/catch processing, whether an exception occurs or not.

It is commonly used for cleanup operations.

```java
try {
    System.out.println("Try");
}
catch (Exception e) {
    System.out.println("Catch");
}
finally {
    System.out.println("Finally");
}
```

---

## 7. Can we have try without catch?

Yes, if it is followed by a `finally` block.

```java
try {
    System.out.println("Hello");
}
finally {
    System.out.println("Finally");
}
```

---

## 8. Can we have multiple catch blocks?

Yes.

Example:

```java
try {
    int x = 10 / 0;
}
catch (ArithmeticException e) {
    System.out.println("Arithmetic");
}
catch (Exception e) {
    System.out.println("Exception");
}
```

The more specific exception should come before the more general exception.

---

## 9. What happens if an exception is not handled?

The exception propagates to the caller.

If nobody handles it, the JVM's default exception handler terminates the affected thread and prints the exception information and stack trace.

---

## 10. What is the difference between `final`, `finally`, and `finalize()`?

### final

Used with variables, methods, and classes.

### finally

Used with exception handling.

### finalize()

An old method associated with garbage collection; it has been deprecated for removal and should not be used for resource cleanup.

---

## 11. Can we create our own exception?

Yes.

We can create a custom exception by extending `Exception` or `RuntimeException`.

```java
class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {
        super(message);
    }
}
```

---

# PART 2 — COLLECTIONS

## 12. What is Collection Framework in Java?

The Java Collections Framework provides interfaces and classes for storing and manipulating groups of objects.

Important interfaces include:

```text
List
Set
Queue
Map
```

---

## 13. What is the difference between List, Set, and Map?

### List

* Maintains order
* Allows duplicates
* Access using index

Examples:

```java
ArrayList
LinkedList
```

### Set

* Does not allow duplicate elements
* Ordering depends on implementation

Examples:

```java
HashSet
TreeSet
```

### Map

* Stores key-value pairs
* Keys are unique

Examples:

```java
HashMap
TreeMap
```

---

## 14. What is ArrayList?

`ArrayList` is a resizable array implementation of the `List` interface.

Characteristics:

* Maintains insertion order
* Allows duplicates
* Allows null
* Fast random access using index
* Not synchronized

Example:

```java
ArrayList<String> list = new ArrayList<>();

list.add("Java");
list.add("Spring");
```

---

## 15. ArrayList vs Array?

### Array

* Fixed size
* Can store primitives and objects
* Faster for simple fixed-size storage

### ArrayList

* Resizable
* Stores objects
* Provides collection methods such as `add()`, `remove()`, and `contains()`

---

## 16. What is LinkedList?

`LinkedList` is a doubly-linked list implementation of both `List` and `Deque`.

It maintains insertion order and allows duplicates.

Example:

```java
LinkedList<String> list = new LinkedList<>();

list.add("Java");
list.add("Spring");
```

---

## 17. ArrayList vs LinkedList?

### ArrayList

Uses a dynamic array internally.

Good for:

* Frequent reading/access by index

### LinkedList

Uses linked nodes.

Good for:

* Frequent insertion/removal at the beginning or through an iterator/list operations

In most general-purpose cases, `ArrayList` is the preferred default choice.

---

## 18. What is HashSet?

`HashSet` is a Set implementation that stores unique elements.

Characteristics:

* Does not allow duplicates
* Allows one null element
* Does not guarantee insertion order
* Uses hashing internally

Example:

```java
HashSet<Integer> set = new HashSet<>();

set.add(10);
set.add(20);
set.add(10);
```

Only one `10` is stored.

---

## 19. HashSet vs ArrayList?

| ArrayList                 | HashSet                   |
| ------------------------- | ------------------------- |
| Allows duplicates         | Does not allow duplicates |
| Maintains insertion order | No guaranteed order       |
| Index-based access        | No index-based access     |
| List                      | Set                       |

---

## 20. What is TreeSet?

`TreeSet` is a Set implementation that stores unique elements in sorted order.

Example:

```java
TreeSet<Integer> set = new TreeSet<>();

set.add(30);
set.add(10);
set.add(20);
```

Output order:

```text
10
20
30
```

---

## 21. HashSet vs TreeSet?

### HashSet

* No guaranteed ordering
* Generally faster for basic add/search/remove operations

### TreeSet

* Maintains sorted order
* Generally `O(log n)` for basic operations

---

## 22. What is HashMap?

`HashMap` stores data in key-value pairs.

Characteristics:

* Keys are unique
* Allows one null key
* Allows multiple null values
* Does not guarantee insertion order
* Not synchronized

Example:

```java
HashMap<Integer, String> map = new HashMap<>();

map.put(1, "Java");
map.put(2, "Spring");
```

---

## 23. Can HashMap have duplicate keys?

No.

If the same key is inserted again, the old value is replaced.

```java
HashMap<Integer, String> map = new HashMap<>();

map.put(1, "Java");
map.put(1, "Spring");
```

The value associated with key `1` becomes:

```text
Spring
```

---

## 24. How does HashMap work internally?

HashMap uses hashing.

When we call:

```java
map.put(key, value);
```

Java uses the key's hash information to determine where the entry should be stored.

During lookup:

```java
map.get(key);
```

Hashing helps locate the appropriate bucket, and equality checks are used to identify the correct key.

In modern Java, heavily-collided buckets can be treeified under suitable conditions.

---

## 25. What is the difference between HashMap and TreeMap?

### HashMap

* No guaranteed sorting
* Generally faster
* Allows one null key

### TreeMap

* Keys are sorted
* Generally `O(log n)` for basic operations
* Does not allow a null key with natural ordering

---

## 26. What is the difference between Collection and Collections?

### Collection

`Collection` is an interface.

Example:

```java
List
Set
Queue
```

### Collections

`Collections` is a utility class containing static methods.

Example:

```java
Collections.sort(list);
Collections.reverse(list);
```

---

## 27. What is the difference between Collection and Map?

`Collection` represents a group of individual elements.

Examples:

```java
List
Set
Queue
```

`Map` stores key-value pairs.

Example:

```java
HashMap
TreeMap
```

`Map` is not a subtype of the `Collection` interface.

---

## 28. What is an Iterator?

`Iterator` is used to traverse elements of a collection.

Example:

```java
Iterator<Integer> itr = list.iterator();

while (itr.hasNext()) {
    System.out.println(itr.next());
}
```

---

## 29. What is the difference between Iterator and ListIterator?

### Iterator

* Works with Collection types
* Moves only forward

### ListIterator

* Works with List implementations
* Can move forward and backward
* Can add and set elements

---

## 30. What is Comparable?

`Comparable` is used to define the natural ordering of objects.

It provides:

```java
compareTo()
```

Example:

```java
class Student implements Comparable<Student> {

    int age;

    public int compareTo(Student s) {
        return this.age - s.age;
    }
}
```

---

## 31. What is Comparator?

`Comparator` is used to define custom ordering outside the class.

It provides:

```java
compare()
```

Example:

```java
Comparator<Student> comparator =
    (s1, s2) -> s1.age - s2.age;
```

---

## 32. Comparable vs Comparator?

| Comparable               | Comparator                    |
| ------------------------ | ----------------------------- |
| `compareTo()`            | `compare()`                   |
| Natural ordering         | Custom ordering               |
| Implemented by the class | Usually separate object/class |
| `java.lang`              | `java.util`                   |

---

## 33. What is the difference between HashSet and HashMap?

### HashSet

Stores only values.

```java
Set<Integer>
```

### HashMap

Stores key-value pairs.

```java
Map<Integer, String>
```

---

## 34. What is the difference between HashMap and Hashtable?

### HashMap

* Not synchronized
* Allows one null key
* Allows null values
* Generally preferred in modern applications when synchronization is not required

### Hashtable

* Synchronized
* Does not allow null keys or null values
* Legacy class

---

# Quick Collection Hierarchy

```text
Collection
   |
   +--- List
   |      |
   |      +--- ArrayList
   |      +--- LinkedList
   |
   +--- Set
   |      |
   |      +--- HashSet
   |      +--- TreeSet
   |
   +--- Queue

Map
 |
 +--- HashMap
 +--- TreeMap
```

# Most Important Interview Points

```text
ArrayList
→ Dynamic array
→ Fast random access

LinkedList
→ Doubly linked list
→ Useful for insert/remove operations

HashSet
→ Unique elements
→ Hashing
→ No guaranteed order

TreeSet
→ Unique + sorted elements

HashMap
→ Key-value pairs
→ Unique keys
→ Hashing

TreeMap
→ Key-value pairs
→ Sorted keys

Comparable
→ Natural ordering
→ compareTo()

Comparator
→ Custom ordering
→ compare()

Iterator
→ Traversal

Collection
→ Interface

Collections
→ Utility class
```

# Common Scenario Questions

## 1. I need to store duplicate values and maintain insertion order. Which collection?

Use:

```java
ArrayList
```

---

## 2. I need only unique values and don't care about order. Which collection?

Use:

```java
HashSet
```

---

## 3. I need unique values in sorted order. Which collection?

Use:

```java
TreeSet
```

---

## 4. I need key-value data and fast lookup by key. Which collection?

Use:

```java
HashMap
```

---

## 5. I need key-value data sorted by key. Which collection?

Use:

```java
TreeMap
```

---

## 6. I need to sort objects using multiple different criteria.

Use:

```java
Comparator
```

For example:

```text
Sort Student by:
1. Age
2. Name
3. Marks
```

A `Comparator` is suitable for defining different orderings.

````

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
12. ArrayList                 ✅
13. LinkedList                ✅
14. HashSet                   ✅
15. TreeSet                   ✅
16. HashMap                   ✅
17. TreeMap                   ✅
18. Comparable & Comparator   ✅
19. Java 8 Features           ← NEXT
20. Lambda Expressions
21. Functional Interfaces
22. Stream API
23. Multithreading
24. Garbage Collection
25. JVM Internals
````

**From the next topics, I'll keep the same style: fewer questions, but I'll make sure the important interview areas are covered.**
