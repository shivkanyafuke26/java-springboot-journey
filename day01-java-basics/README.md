# Day 1 Java Basics
# Day 1 Java Basics Notes

## Introduction to Java

Java is a high-level, object-oriented, secure, robust, and platform-independent programming language.

## History of Java

* Developed by James Gosling in 1995
* Created at Sun Microsystems
* Initially named Oak
* Later renamed Java
* Now maintained by Oracle Corporation

## Features of Java

* Simple
* Object-Oriented
* Platform Independent
* Secure
* Robust
* Portable
* Multithreaded
* Distributed
* Dynamic
* High Performance

## Java Editions

* Java SE (Standard Edition)
* Java EE / Jakarta EE (Enterprise Edition)
* Java ME (Micro Edition)

## JDK, JRE, JVM

* **JDK**: Java Development Kit used for developing Java applications
* **JRE**: Java Runtime Environment used to run Java programs
* **JVM**: Java Virtual Machine used to execute bytecode

## Java Code Execution Process

```text id="f7z2g0"
Source Code (.java)
      ↓
Compiler (javac)
      ↓
Bytecode (.class)
      ↓
JVM
      ↓
Output
```

## Basic Java Program

```java id="6o9qnh"
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

## Java Tokens

Smallest units in Java program:

* Keywords
* Identifiers
* Literals
* Operators
* Separators

## Java Keywords

Examples:

* class
* public
* static
* void
* int
* if
* else
* for
* while
* return

## Variables

Used to store values in memory.

### Types of Variables

* Local Variable
* Instance Variable
* Static Variable

Example:

```java id="7mhmij"
int age = 22;
String name = "Java";
```

## Data Types

### Primitive Data Types

* byte
* short
* int
* long
* float
* double
* char
* boolean

### Non-Primitive Data Types

* String
* Array
* Class
* Object

## Operators

### Arithmetic Operators

`+  -  *  /  %`

### Relational Operators

`==  !=  >  <  >=  <=`

### Logical Operators

`&&  ||  !`

### Assignment Operators

`=  +=  -=  *=  /=`

### Unary Operators

`++  --`

## Decision Making Statements

* if
* if-else
* else-if ladder
* switch

## Loops

* for loop
* while loop
* do-while loop
* for-each loop

## Comments in Java

```java id="a5fzqb"
// Single line comment

/* Multi-line comment */

/**
 * Documentation comment
 */
```

## Input Methods in Java

* Scanner
* BufferedReader
* Console
* Command Line Arguments
* DataInputStream
* File Input
* JOptionPane

## Most Common Input Method

```java id="1vk2ii"
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
```

## Day 1 Summary

Covered Java basics including introduction, history, features, editions, JDK/JRE/JVM, program structure, tokens, keywords, variables, data types, operators, decision statements, loops, comments, and input methods.
