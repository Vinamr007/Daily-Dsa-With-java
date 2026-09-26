Next topic: **String in Java**. Copy this directly into your GitHub `.md` file.

````markdown
# String — Java Interview Questions & Answers

## 1. What is a String in Java?

A String is an object that represents a sequence of characters.

Example:

```java
String name = "Vinamr";
````

In Java, `String` is a class available in the `java.lang` package.

---

## 2. Is String a class or a data type?

`String` is a class, not a primitive data type.

Example:

```java
String name = "Vinamr";
```

Here, `String` is a class and `name` is a reference variable.

---

## 3. Is String mutable or immutable?

String is immutable.

It means once a String object is created, its content cannot be changed.

Example:

```java
String s = "Hello";

s.concat(" World");

System.out.println(s);
```

Output:

```text
Hello
```

`concat()` creates a new String instead of changing the original String.

---

## 4. What does immutable mean?

Immutable means an object whose state cannot be changed after it is created.

For String:

```java
String s = "Hello";
```

The `"Hello"` object cannot be changed.

If we perform:

```java
s = s + " World";
```

a new String object is created.

---

## 5. Why is String immutable in Java?

String is immutable mainly because it provides:

* Security
* String pool optimization
* Thread safety
* Hashcode caching
* Safe use as a key in collections such as `HashMap`

---

## 6. Where are String objects stored?

It depends on how the String is created.

String literals are stored in the String Pool, which is maintained within the JVM's heap.

Example:

```java
String s = "Hello";
```

The literal `"Hello"` is placed in the String Pool.

Using `new String()` creates a separate String object on the heap.

Example:

```java
String s = new String("Hello");
```

---

## 7. What is the String Pool?

The String Pool is a special area maintained by the JVM for String literals.

It allows identical String literals to share the same String object.

Example:

```java
String s1 = "Hello";
String s2 = "Hello";
```

Both references point to the same pooled String object.

Therefore:

```java
System.out.println(s1 == s2);
```

Output:

```text
true
```

---

## 8. What is the difference between String literal and `new String()`?

### String literal

```java
String s1 = "Hello";
```

The JVM checks the String Pool first.

### `new String()`

```java
String s2 = new String("Hello");
```

A new String object is explicitly created.

Example:

```java
String s1 = "Hello";
String s2 = new String("Hello");

System.out.println(s1 == s2);
```

Output:

```text
false
```

Because `s1` refers to the pooled object while `s2` refers to a different object.

---

## 9. What is the difference between `==` and `equals()` for String?

`==` compares references.

`equals()` compares the actual String content.

Example:

```java
String s1 = new String("Hello");
String s2 = new String("Hello");

System.out.println(s1 == s2);
System.out.println(s1.equals(s2));
```

Output:

```text
false
true
```

---

## 10. Why does `==` return false for two Strings created using `new`?

Because `==` compares object references.

Example:

```java
String s1 = new String("Hello");
String s2 = new String("Hello");
```

Two different String objects are created.

Therefore:

```java
s1 == s2
```

returns `false`.

But:

```java
s1.equals(s2)
```

returns `true` because their content is the same.

---

## 11. What happens when we concatenate two Strings?

Because String is immutable, concatenation creates a new String object.

Example:

```java
String s1 = "Hello";
String s2 = "World";

String s3 = s1 + s2;
```

A new String containing `"HelloWorld"` is created.

---

## 12. What is String concatenation?

String concatenation means joining two or more Strings.

We can use the `+` operator.

Example:

```java
String first = "Vinamr";
String last = "Naik";

String name = first + " " + last;
```

Output:

```text
Vinamr Naik
```

---

## 13. What is the `concat()` method?

The `concat()` method joins one String with another String.

Example:

```java
String s1 = "Hello";
String s2 = "World";

String s3 = s1.concat(s2);

System.out.println(s3);
```

Output:

```text
HelloWorld
```

Since String is immutable, the original Strings are not changed.

---

## 14. What is the difference between `+` and `concat()`?

Both can concatenate Strings.

Example:

```java
String s = "Hello";

s = s + " World";
```

and:

```java
s = s.concat(" World");
```

Both produce:

```text
Hello World
```

The `+` operator can also concatenate non-String values.

Example:

```java
String result = "Age: " + 25;
```

---

## 15. What is `length()` in String?

`length()` returns the number of characters in a String.

Example:

```java
String s = "Vinamr";

System.out.println(s.length());
```

Output:

```text
6
```

---

## 16. What is `charAt()`?

`charAt()` returns the character at a specified index.

Index starts from `0`.

Example:

```java
String s = "Hello";

System.out.println(s.charAt(1));
```

Output:

```text
e
```

---

## 17. What is `substring()`?

`substring()` is used to extract part of a String.

Example:

```java
String s = "Hello World";

System.out.println(s.substring(0, 5));
```

Output:

```text
Hello
```

The starting index is inclusive and the ending index is exclusive.

---

## 18. What is `toUpperCase()`?

It converts a String to uppercase.

Example:

```java
String s = "hello";

System.out.println(s.toUpperCase());
```

Output:

```text
HELLO
```

---

## 19. What is `toLowerCase()`?

It converts a String to lowercase.

Example:

```java
String s = "HELLO";

System.out.println(s.toLowerCase());
```

Output:

```text
hello
```

---

## 20. What is `trim()`?

`trim()` removes leading and trailing ASCII whitespace from a String.

Example:

```java
String s = "  Hello  ";

System.out.println(s.trim());
```

Output:

```text
Hello
```

---

## 21. What is `strip()`?

`strip()` removes leading and trailing Unicode whitespace.

Example:

```java
String s = "  Hello  ";

System.out.println(s.strip());
```

Output:

```text
Hello
```

`strip()` was introduced in Java 11.

---

## 22. What is `equals()` in String?

`equals()` compares the content of two Strings.

Example:

```java
String s1 = "Hello";
String s2 = "Hello";

System.out.println(s1.equals(s2));
```

Output:

```text
true
```

---

## 23. What is `equalsIgnoreCase()`?

It compares two Strings while ignoring differences in uppercase and lowercase.

Example:

```java
String s1 = "HELLO";
String s2 = "hello";

System.out.println(s1.equalsIgnoreCase(s2));
```

Output:

```text
true
```

---

## 24. What is `contains()`?

`contains()` checks whether a String contains a particular sequence of characters.

Example:

```java
String s = "Java Programming";

System.out.println(s.contains("Java"));
```

Output:

```text
true
```

---

## 25. What is `startsWith()`?

`startsWith()` checks whether a String starts with a specified prefix.

Example:

```java
String s = "Java Programming";

System.out.println(s.startsWith("Java"));
```

Output:

```text
true
```

---

## 26. What is `endsWith()`?

`endsWith()` checks whether a String ends with a specified suffix.

Example:

```java
String s = "Java Programming";

System.out.println(s.endsWith("Programming"));
```

Output:

```text
true
```

---

## 27. What is `indexOf()`?

`indexOf()` returns the index of the first occurrence of a specified character or String.

Example:

```java
String s = "Hello";

System.out.println(s.indexOf('l'));
```

Output:

```text
2
```

If the value is not found, it returns `-1`.

---

## 28. What is `lastIndexOf()`?

`lastIndexOf()` returns the index of the last occurrence of a character or String.

Example:

```java
String s = "Hello";

System.out.println(s.lastIndexOf('l'));
```

Output:

```text
3
```

---

## 29. What is `replace()`?

`replace()` replaces characters or character sequences in a String.

Example:

```java
String s = "Java";

System.out.println(s.replace('a', 'o'));
```

Output:

```text
Jovo
```

---

## 30. What is `split()`?

`split()` divides a String into an array based on a specified delimiter or regular expression.

Example:

```java
String s = "Java,Spring,SQL";

String[] arr = s.split(",");

for (String value : arr) {
    System.out.println(value);
}
```

Output:

```text
Java
Spring
SQL
```

---

## 31. What is `isEmpty()`?

`isEmpty()` checks whether the String has zero characters.

Example:

```java
String s = "";

System.out.println(s.isEmpty());
```

Output:

```text
true
```

---

## 32. What is `isBlank()`?

`isBlank()` checks whether a String is empty or contains only Unicode whitespace.

Example:

```java
String s = "   ";

System.out.println(s.isBlank());
```

Output:

```text
true
```

`isBlank()` was introduced in Java 11.

---

## 33. What is `String.valueOf()`?

`String.valueOf()` converts different data types into their String representation.

Example:

```java
int number = 100;

String s = String.valueOf(number);

System.out.println(s);
```

Output:

```text
100
```

---

## 34. What is `toString()`?

`toString()` returns the String representation of an object.

Every class inherits `toString()` from `Object`, unless it overrides it.

Example:

```java
class Student {

    String name = "Vinamr";

    @Override
    public String toString() {
        return name;
    }
}
```

---

## 35. What is String interning?

String interning means storing a String in the String Pool so that identical Strings can share the same pooled object.

The `intern()` method can be used to get the pooled representation of a String.

Example:

```java
String s1 = new String("Hello");

String s2 = s1.intern();

String s3 = "Hello";

System.out.println(s2 == s3);
```

Output:

```text
true
```

---

## 36. What does the `intern()` method do?

`intern()` returns the canonical representation of the String from the String Pool.

Example:

```java
String s1 = new String("Hello");

String s2 = s1.intern();

String s3 = "Hello";

System.out.println(s2 == s3);
```

Output:

```text
true
```

---

## 37. Why is String commonly used as a key in HashMap?

String is immutable and has a well-defined `equals()` and `hashCode()` implementation.

Because its content cannot change after creation, its hash code remains consistent while it is used as a key.

Example:

```java
HashMap<String, Integer> map = new HashMap<>();

map.put("Java", 100);
```

---

## 38. What is the difference between String, StringBuilder, and StringBuffer?

### String

* Immutable
* Every modification creates a new String

### StringBuilder

* Mutable
* Generally faster for repeated modifications
* Not synchronized

### StringBuffer

* Mutable
* Synchronized
* Generally slower than StringBuilder

---

## 39. When should we use StringBuilder?

Use `StringBuilder` when we need to perform many String modifications, especially in a single-threaded context.

Example:

```java
StringBuilder sb = new StringBuilder();

sb.append("Java");
sb.append(" ");
sb.append("Programming");

System.out.println(sb);
```

---

## 40. When should we use StringBuffer?

Use `StringBuffer` when you need its synchronized methods for compatibility with shared mutable String operations across threads.

Example:

```java
StringBuffer sb = new StringBuffer();

sb.append("Java");
sb.append(" Programming");
```

---

# Quick Revision

```text
String
   ↓
Class
   ↓
Immutable
   ↓
String literals → String Pool

==
   ↓
Reference comparison

equals()
   ↓
Content comparison

StringBuilder
   ↓
Mutable + not synchronized

StringBuffer
   ↓
Mutable + synchronized
```

# Important Interview Points

```text
1. String is a class.

2. String is immutable.

3. String literals are stored in the String Pool.

4. == compares references.

5. equals() compares content.

6. StringBuilder is mutable and not synchronized.

7. StringBuffer is mutable and synchronized.

8. intern() returns the pooled representation of a String.

9. String can be used as a HashMap key because it is immutable
   and provides consistent equals() and hashCode() behavior.
```

# Example

```java
public class Test {

    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "Java";

        String s3 = new String("Java");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
    }
}
```

Output:

```text
true
false
true
```

Explanation:

* `s1` and `s2` refer to the same pooled String.
* `s3` refers to a different String object.
* `equals()` compares their content, so it returns `true`.

````

### Progress

```text
1. OOP                         ✅ DONE
2. Constructors               ✅ DONE
3. Access Modifiers           ✅ DONE
4. static                     ✅ DONE
5. final                      ✅ DONE
6. this and super             ✅ DONE
7. String                     ✅ DONE
8. String Pool                ← NEXT
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
