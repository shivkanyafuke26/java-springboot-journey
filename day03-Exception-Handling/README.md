# Exception Handling in Java

## What is Exception Handling?

Exception Handling is used to handle runtime errors in a program so that the normal flow of the program can continue.

An exception is an unwanted event that occurs during program execution.

Example:

* Divide by zero
* Array index out of bounds
* Null pointer access
* File not found

---

## Why Use Exception Handling?

* Prevent program crash
* Maintain normal program flow
* Handle errors gracefully
* Improve readability and debugging

---

## Types of Exceptions

### 1. Checked Exception

Checked at compile time.

Examples:

* IOException
* SQLException
* FileNotFoundException

### 2. Unchecked Exception

Occurs at runtime.

Examples:

* ArithmeticException
* NullPointerException
* ArrayIndexOutOfBoundsException

---

## Exception Hierarchy

```java
Object
 └── Throwable
      ├── Error
      └── Exception
           ├── RuntimeException
           └── Other Exceptions
```

---

## Keywords Used in Exception Handling

### 1. try

Used to write risky code.

```java
try {
    int a = 10 / 0;
}
```

### 2. catch

Used to handle exception.

```java
catch(Exception e) {
    System.out.println(e);
}
```

### 3. finally

Always executes whether exception occurs or not.

```java
finally {
    System.out.println("Cleanup code");
}
```

### 4. throw

Used to manually throw an exception.

```java
throw new ArithmeticException("Invalid");
```

### 5. throws

Used to declare exception in method signature.

```java
void readFile() throws IOException
```

---

## Example: try-catch

```java
class Demo {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}
```

---

## Example: try-catch-finally

```java
try {
    int arr[] = {1,2,3};
    System.out.println(arr[5]);
}
catch(Exception e) {
    System.out.println("Error");
}
finally {
    System.out.println("Always runs");
}
```

---

## Multiple catch Blocks

```java
try {
    int a = 10 / 0;
}
catch(ArithmeticException e) {
    System.out.println("Arithmetic Error");
}
catch(Exception e) {
    System.out.println("General Error");
}
```

---

## Custom Exception

```java
class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}
```

---

## Important Points

* `try` must be followed by `catch` or `finally`
* Multiple catch blocks allowed
* finally block usually used for closing resources
* Child exception catch should come before parent exception

---

## Common Runtime Exceptions

* ArithmeticException
* NullPointerException
* NumberFormatException
* ArrayIndexOutOfBoundsException
* StringIndexOutOfBoundsException

---

## Advantages

* Prevent abnormal termination
* Better error handling
* Easy debugging
* Clean code structure

---

## Summary

* `try` = risky code
* `catch` = handle error
* `finally` = always execute
* `throw` = manually throw exception
* `throws` = declare exception

---

