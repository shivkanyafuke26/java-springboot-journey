# 📘 Day 07 – Type Casting & Wrapper Classes in Java

## 🔹 Introduction

This module covers **Type Casting** and **Wrapper Classes**, which are essential for handling data conversions and working with objects instead of primitive data types in Java.

---

## 🔹 Type Casting

Type casting is the process of converting one data type into another.

### 📌 Types of Casting

#### 1. Widening Casting (Implicit)

* Smaller → Larger data type
* Done automatically by Java

Example:
`int → long → float → double`

#### 2. Narrowing Casting (Explicit)

* Larger → Smaller data type
* Must be done manually

Example:
`double → float → long → int`

---

## 🔹 Why Type Casting?

* To perform operations between different data types
* To control data conversion manually
* To avoid data loss or overflow issues

---

## 🔹 Wrapper Classes

Wrapper classes convert primitive data types into objects.

| Primitive | Wrapper Class |
| --------- | ------------- |
| int       | Integer       |
| double    | Double        |
| char      | Character     |
| boolean   | Boolean       |
| long      | Long          |
| float     | Float         |
| byte      | Byte          |
| short     | Short         |

---

## 🔹 Why Wrapper Classes?

* Required for Collections (only objects allowed)
* Used in APIs and frameworks
* Provide utility methods

---

## 🔹 Autoboxing & Unboxing

### 📌 Autoboxing

* Primitive → Object
  Example: `int → Integer`

### 📌 Unboxing

* Object → Primitive
  Example: `Integer → int`

---

## 🔹 Important Methods

### Integer Class

* `parseInt()`
* `valueOf()`
* `toString()`

### Double Class

* `parseDouble()`
* `valueOf()`

---

## 🔹 Key Differences

* Primitive → faster, less memory
* Wrapper → object-based, more functionality

---

## 🔹 Practice Programs

* Convert int to double using casting
* Convert double to int
* Use Integer.parseInt()
* Demonstrate autoboxing & unboxing
* Store integers in ArrayList

---

## 🔹 Conclusion

Type casting helps in data conversion, while wrapper classes allow primitives to be used as objects. Both are important for Java development and interviews.

---

## 📁 Repo Name

day05-typecasting-wrapper-java

