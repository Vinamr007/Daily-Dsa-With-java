Yes. For **Multithreading**, these are the important interview concepts you should prepare. I’ll keep it focused—no unnecessary advanced topics.

````markdown
# Multithreading — Important Java Interview Questions & Answers

## 1. What is Multithreading?

Multithreading is the process of executing multiple threads concurrently within a single program.

A thread is a lightweight unit of execution.

Example:

```text
Application
   |
   +--- Thread 1 → Task A
   |
   +--- Thread 2 → Task B
   |
   +--- Thread 3 → Task C
````

---

## 2. What is a Thread?

A thread is a lightweight path of execution inside a process.

For example, an application can have:

```text
Main Thread
   ↓
Download Thread
   ↓
Database Thread
```

All these threads can execute tasks concurrently.

---

## 3. What is the difference between Process and Thread?

### Process

* Independent program in execution
* Has its own memory space
* More heavyweight

### Thread

* Exists inside a process
* Shares memory with other threads of the same process
* Lightweight

```text
Process
   |
   +--- Thread 1
   +--- Thread 2
   +--- Thread 3
```

---

## 4. How can we create a thread in Java?

Two common ways are:

### Using Thread class

```java
class MyThread extends Thread {

    public void run() {
        System.out.println("Thread running");
    }
}

class Test {
    public static void main(String[] args) {

        MyThread t = new MyThread();

        t.start();
    }
}
```

### Using Runnable

```java
class MyTask implements Runnable {

    public void run() {
        System.out.println("Thread running");
    }
}

class Test {
    public static void main(String[] args) {

        Thread t = new Thread(new MyTask());

        t.start();
    }
}
```

Generally, `Runnable` is preferred when you want to separate the task from the thread object.

---

## 5. What is the difference between `start()` and `run()`?

This is a very important interview question.

### start()

Creates/schedules a new thread of execution and then invokes `run()` on that thread.

```java
t.start();
```

### run()

Contains the code that the thread executes.

If you directly call:

```java
t.run();
```

it is just a normal method call and does not start a new thread.

---

## 6. What are the states of a Thread?

Important Java thread states are:

```text
NEW
 ↓
RUNNABLE
 ↓
BLOCKED / WAITING / TIMED_WAITING
 ↓
RUNNABLE
 ↓
TERMINATED
```

Java defines these states in the `Thread.State` enum.

---

## 7. What is Thread.sleep()?

`Thread.sleep()` pauses the currently executing thread for a specified amount of time.

Example:

```java
Thread.sleep(1000);
```

The current thread sleeps for approximately 1 second.

It moves to:

```text
TIMED_WAITING
```

`Thread.sleep()` does not release locks that the thread already holds.

---

## 8. What is `join()`?

`join()` makes one thread wait for another thread to finish.

Example:

```java
Thread t1 = new Thread(() -> {
    System.out.println("Task");
});

t1.start();

t1.join();

System.out.println("Main");
```

Here, the main thread waits for `t1` to complete before continuing.

---

## 9. What is Synchronization?

Synchronization is a mechanism used to control access to shared resources when multiple threads are accessing them.

It helps prevent inconsistent results caused by concurrent access.

Example:

```java
synchronized void increment() {
    count++;
}
```

Only one thread at a time can execute the synchronized instance method for the same object monitor.

---

## 10. What is a Race Condition?

A race condition occurs when multiple threads access shared data concurrently and the final result depends on the timing/order of their execution.

Example:

```java
count++;
```

If multiple threads execute this operation without proper synchronization, updates can be lost.

---

## 11. What is Thread Safety?

Thread safety means that code behaves correctly when multiple threads access it concurrently.

Example:

```text
Multiple Threads
       ↓
 Shared Resource
       ↓
 Correct & Consistent Result
```

Synchronization, immutable objects, atomic classes, and concurrent collections are some ways to achieve thread safety.

---

## 12. What is a synchronized method?

A method declared with the `synchronized` keyword.

Example:

```java
synchronized void increment() {
    count++;
}
```

For an instance method, the lock is associated with the current object.

---

## 13. What is a synchronized block?

A synchronized block synchronizes only a specific section of code instead of the entire method.

Example:

```java
synchronized (this) {
    count++;
}
```

It can provide more fine-grained control than synchronizing the whole method.

---

## 14. What is the difference between synchronized method and synchronized block?

### Synchronized method

```java
synchronized void method() {
    // code
}
```

The synchronization applies to the method.

### Synchronized block

```java
synchronized (this) {
    // code
}
```

Only the selected block is synchronized.

A synchronized block can reduce the amount of code that needs locking.

---

## 15. What is a Lock?

A lock is a mechanism used to control access to shared resources between threads.

Java provides explicit locking through classes such as:

```java
ReentrantLock
```

Example:

```java
Lock lock = new ReentrantLock();

lock.lock();

try {
    // critical section
}
finally {
    lock.unlock();
}
```

---

## 16. What is the difference between synchronized and Lock?

### synchronized

* Simple to use
* Lock is automatically released when leaving the synchronized block/method
* Built into the language

### Lock

* Provides more control
* Can use `tryLock()`
* Can support interruptible lock acquisition
* Must be explicitly unlocked

---

## 17. What is Deadlock?

Deadlock occurs when two or more threads wait indefinitely for locks held by each other.

Example:

```text
Thread 1
   ↓
holds Lock A
   ↓
waits for Lock B

Thread 2
   ↓
holds Lock B
   ↓
waits for Lock A
```

Neither thread can continue.

---

## 18. What is the difference between Deadlock and Race Condition?

### Race Condition

Multiple threads access shared data and the result depends on execution timing.

### Deadlock

Threads wait indefinitely for each other's locks.

```text
Race Condition → Incorrect/Unexpected Result

Deadlock → Threads stop progressing
```

---

## 19. What are wait(), notify(), and notifyAll()?

These are methods of the `Object` class used for thread coordination.

### wait()

Makes the current thread wait and releases the monitor it holds.

### notify()

Wakes one waiting thread.

### notifyAll()

Wakes all threads waiting on that object's monitor.

They must be used while holding the corresponding object's monitor, typically inside synchronized code.

---

## 20. What is the Producer-Consumer problem?

It is a common multithreading problem where:

```text
Producer
   ↓
Produces data
   ↓
Shared Queue
   ↓
Consumer
   ↓
Consumes data
```

The producer should wait when the queue is full, and the consumer should wait when it is empty.

This can be implemented using mechanisms such as:

```text
wait()
notify()
notifyAll()
```

or preferably higher-level concurrency utilities such as:

```text
BlockingQueue
```

---

## 21. What is ExecutorService?

`ExecutorService` is a framework for managing and executing tasks using a pool of threads.

Instead of manually creating a new thread for every task, we can use a thread pool.

Example:

```java
ExecutorService service =
        Executors.newFixedThreadPool(3);

service.submit(() -> {
    System.out.println("Task running");
});

service.shutdown();
```

---

## 22. What is a Thread Pool?

A thread pool is a collection of reusable worker threads.

Instead of creating a new thread for every task:

```text
Task → Create Thread → Execute → Destroy
```

we can use:

```text
Tasks
 ↓
Thread Pool
 ↓
Worker Threads
```

This reduces thread creation overhead and helps control concurrency.

---

## 23. What is Callable?

`Callable` is similar to `Runnable`, but it can:

* Return a result
* Throw checked exceptions

Example:

```java
Callable<Integer> task = () -> {
    return 100;
};
```

---

## 24. What is Future?

`Future` represents the result of an asynchronous computation.

Example:

```java
Future<Integer> result = service.submit(() -> {
    return 100;
});

System.out.println(result.get());
```

`get()` retrieves the result and may wait until the task completes.

---

## 25. Runnable vs Callable?

| Runnable                                 | Callable                       |
| ---------------------------------------- | ------------------------------ |
| `run()`                                  | `call()`                       |
| Does not return a result                 | Returns a result               |
| Cannot throw checked exceptions directly | Can throw checked exceptions   |
| Used for tasks without a result          | Used when a result is required |

---

# Most Important Scenario-Based Questions

## 26. Two threads are updating the same bank account balance. What problem can occur?

A **race condition** can occur.

If both threads read and update the balance at the same time, one update may overwrite another.

We can protect the critical section using synchronization or suitable concurrency utilities.

---

## 27. Two threads are accessing the same counter. How will you make it thread-safe?

One simple solution is synchronization:

```java
synchronized void increment() {
    count++;
}
```

For simple counters, an atomic class such as `AtomicInteger` can also be used.

---

## 28. Two threads are waiting for each other's locks. What is the problem?

It is a **deadlock**.

We should design locking carefully, for example by acquiring multiple locks in a consistent global order.

---

## 29. You have 100 tasks. Should you create 100 threads manually?

Usually, no.

Use an `ExecutorService` with an appropriate thread pool.

```text
100 Tasks
   ↓
ExecutorService
   ↓
Thread Pool
   ↓
Worker Threads
```

---

## 30. Which topics are most important for a Java interview?

Focus especially on:

```text
Thread
   ↓
start() vs run()
   ↓
Thread lifecycle/states
   ↓
sleep()
   ↓
join()
   ↓
Synchronization
   ↓
Race Condition
   ↓
Thread Safety
   ↓
wait()/notify()/notifyAll()
   ↓
Deadlock
   ↓
Producer-Consumer
   ↓
ExecutorService
   ↓
Callable/Future
```

# Quick Revision

```text
Thread
→ Lightweight unit of execution

start()
→ Starts a new thread of execution

run()
→ Contains task code

sleep()
→ Pauses current thread temporarily

join()
→ Waits for another thread to finish

synchronized
→ Controls access to shared resource

Race Condition
→ Timing-dependent incorrect result

Thread Safety
→ Correct behavior during concurrent access

Deadlock
→ Threads wait indefinitely for each other's locks

wait()
→ Wait and release monitor

notify()
→ Wake one waiting thread

notifyAll()
→ Wake all waiting threads

ExecutorService
→ Manages task execution/thread pools

Callable
→ Task that returns a result

Future
→ Represents asynchronous result
```
