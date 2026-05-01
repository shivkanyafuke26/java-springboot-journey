# 🚀 Day 06 – Multithreading in Java

## 🔹 Introduction

Multithreading is a process of executing multiple threads simultaneously to improve performance and CPU utilization.
A thread is the smallest unit of a process.

---

## 🔹 Why Multithreading?

* Better performance
* Efficient CPU usage
* Parallel task execution
* Used in real-world apps like banking, gaming, web servers

---

## 🔹 Ways to Create Threads

### 1. Extending Thread Class

* Create a class that extends `Thread`
* Override `run()` method
* Call `start()` method

### 2. Implementing Runnable Interface

* Create a class that implements `Runnable`
* Override `run()` method
* Pass object to `Thread` class

👉 Preferred approach (supports multiple inheritance)

---

## 🔹 Thread Lifecycle

* New
* Runnable
* Running
* Waiting / Blocked
* Terminated

---

## 🔹 Important Methods

* `start()` – starts thread
* `run()` – contains logic
* `sleep()` – pauses execution
* `join()` – waits for another thread
* `setName()` / `getName()`
* `setPriority()`

---

## 🔹 Synchronization

Used to control access to shared resources and avoid data inconsistency.

---

## 🔹 Inter-Thread Communication

* `wait()`
* `notify()`
* `notifyAll()`

---

## 🔹 Deadlock

A situation where two or more threads wait for each other forever.

---

## 🔹 Thread Priority

* MIN_PRIORITY (1)
* NORM_PRIORITY (5)
* MAX_PRIORITY (10)

---

## 🔹 Daemon Thread

Background thread that runs in the background (e.g., garbage collector).

---

## 🔹 Executor Framework

Used to manage threads efficiently using thread pools.

---

## 🔹 Best Practices

* Prefer Runnable over Thread
* Use ExecutorService
* Avoid unnecessary synchronization
* Handle exceptions properly

---

## 🔹 Practice Programs

* Print numbers using multiple threads
* Even and odd number printing
* Synchronization example (bank system)
* Producer-Consumer problem
* Thread using lambda

---

## 🔹 Conclusion

Multithreading improves performance and is widely used in real-world applications. Understanding thread behavior and synchronization is important for building efficient systems.

---

## 📁 Repo Name

day06-multithreading-java

