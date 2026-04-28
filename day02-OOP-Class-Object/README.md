# OOP Concepts in Java

## What is OOP?

OOP stands for **Object Oriented Programming**.
It is a programming style based on **objects, classes, and real-world entities**.

Java is an OOP language.

---

## Main OOP Concepts

### 1. Class

A class is a blueprint of an object.

Example:

```java
class Student {
    int id;
    String name;
}
```

---

### 2. Object

An object is an instance of a class.

Example:

```java
Student s1 = new Student();
```

---

### 3. Encapsulation

Wrapping data and methods into a single unit.

Used by making variables private and accessing them using getters/setters.

Example:

```java
class Employee {
    private int id;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }
}
```

---

### 4. Inheritance

One class acquires properties of another class.

Used for code reusability.

Example:

```java
class Animal {
    void eat(){
        System.out.println("Eating");
    }
}

class Dog extends Animal {
}
```

---

### 5. Polymorphism

One method behaves in different ways.

#### Method Overloading

Same method name with different parameters.

```java
class Add {
    int sum(int a,int b){
        return a+b;
    }

    int sum(int a,int b,int c){
        return a+b+c;
    }
}
```

#### Method Overriding

Child class changes parent method.

```java
class Animal {
    void sound(){
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {
    void sound(){
        System.out.println("Bark");
    }
}
```

---

### 6. Abstraction

Showing essential details and hiding implementation.

Using abstract class or interface.

Example:

```java
abstract class Vehicle {
    abstract void start();
}
```

---

## Other Important Concepts

### Constructor

Special method used to initialize object.

```java
class Student {
    Student(){
        System.out.println("Constructor Called");
    }
}
```

### this Keyword

Used to refer current object.

### super Keyword

Used to call parent class constructor or variables.

### final Keyword

Used to make constant variable, final method, or final class.

---

## Advantages of OOP

* Code Reusability
* Easy Maintenance
* Security
* Flexibility
* Real World Modeling

---

## Summary

* Class = Blueprint
* Object = Instance
* Encapsulation = Data Hiding
* Inheritance = Reuse Code
* Polymorphism = Many Forms
* Abstraction = Hide Details

---

