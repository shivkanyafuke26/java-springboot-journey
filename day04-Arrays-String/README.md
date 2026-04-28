# Arrays and Strings in Java

## What is Array?

An array is a collection of elements of the same data type stored in contiguous memory locations.

### Example:

```java
int arr[] = {10,20,30,40};
```

---

# Types of Arrays

## 1. Single Dimensional Array

Stores elements in one row.

```java
int arr[] = {1,2,3,4};
```

---

## 2. Two Dimensional Array

Stores data in rows and columns.

```java
int arr[][] = {
    {1,2},
    {3,4}
};
```

---

## 3. Multi Dimensional Array

Array of arrays.

```java
int arr[][][] = new int[2][2][2];
```

---

## 4. Jagged Array

Rows with different column sizes.

```java
int arr[][] = new int[3][];
arr[0] = new int[2];
arr[1] = new int[4];
arr[2] = new int[1];
```

---

# Ways to Create Array

## Declaration

```java
int arr[];
```

## Declaration + Memory

```java
int arr[] = new int[5];
```

## Direct Initialization

```java
int arr[] = {1,2,3,4,5};
```

---

# Important Array Properties

## length

Used to get size of array.

```java
arr.length
```

---

# Looping Through Arrays

## Using for loop

```java
for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
}
```

---

## Using for-each loop

Used to access each element directly.

```java
for(int num : arr){
    System.out.println(num);
}
```

### Use of for-each

* Easy to write
* Best for reading values
* No index required

---

# Arrays Class Methods

## Import:

```java
import java.util.Arrays;
```

---

## toString()

Used to print 1D array.

```java
int arr[] = {1,2,3};
System.out.println(Arrays.toString(arr));
```

### Output:

```java
[1, 2, 3]
```

---

## deepToString()

Used to print multidimensional arrays.

```java
int arr[][] = {
    {1,2},
    {3,4}
};

System.out.println(Arrays.deepToString(arr));
```

### Output:

```java
[[1, 2], [3, 4]]
```

---

## sort()

Sorts array in ascending order.

```java
Arrays.sort(arr);
```

---

## equals()

Checks two arrays are same or not.

```java
Arrays.equals(arr1, arr2);
```

---

## fill()

Fills all elements with same value.

```java
Arrays.fill(arr, 0);
```

---

## copyOf()

Copies array into new array.

```java
int newArr[] = Arrays.copyOf(arr, 5);
```

---

# Common Array Programs

## Sum of Array

```java
int sum=0;
for(int num : arr){
    sum += num;
}
```

---

## Find Maximum

```java
int max = arr[0];
for(int num : arr){
    if(num > max)
        max = num;
}
```

---

## Reverse Array

```java
for(int i=arr.length-1;i>=0;i--){
    System.out.println(arr[i]);
}
```

---

# Strings in Java

String is a sequence of characters.

```java
String name = "Java";
```

---

# Ways to Create String

```java
String s1 = "Hello";
String s2 = new String("Hello");
```

---

# Important String Methods

## 1. length()

Returns number of characters.

```java
str.length();
```

---

## 2. charAt(index)

Returns character at given index.

```java
str.charAt(0);
```

---

## 3. substring(beginIndex)

```java
str.substring(6);
```

---

## 4. substring(begin,end)

```java
str.substring(0,5);
```

---

## 5. toUpperCase()

```java
str.toUpperCase();
```

---

## 6. toLowerCase()

```java
str.toLowerCase();
```

---

## 7. trim()

Removes leading and trailing spaces.

```java
str.trim();
```

---

## 8. equals()

```java
str.equals("Hello");
```

---

## 9. equalsIgnoreCase()

```java
str.equalsIgnoreCase("hello java");
```

---

## 10. compareTo()

```java
str.compareTo("Hello");
```

---

## 11. compareToIgnoreCase()

```java
str.compareToIgnoreCase("hello");
```

---

## 12. contains()

```java
str.contains("Java");
```

---

## 13. startsWith()

```java
str.startsWith("Hello");
```

---

## 14. endsWith()

```java
str.endsWith("Java");
```

---

## 15. indexOf()

```java
str.indexOf('o');
```

---

## 16. lastIndexOf()

```java
str.lastIndexOf('a');
```

---

## 17. replace()

```java
str.replace("Java","World");
```

---

## 18. replaceAll()

```java
str.replaceAll("a","@");
```

---

## 19. concat()

```java
str.concat(" Welcome");
```

---

## 20. isEmpty()

```java
str.isEmpty();
```

---

## 21. split()

```java
str.split(" ");
```

---

## 22. toCharArray()

```java
str.toCharArray();
```

---

## 23. valueOf()

```java
String.valueOf(100);
```

---

## 24. join()

```java
String.join("-", "Java","Python","C++");
```

---

## 25. matches()

```java
str.matches("[A-Za-z ]+");
```

---

# String vs StringBuffer vs StringBuilder

## String

Immutable (cannot change)

---

## StringBuffer

Mutable and thread safe

---

## StringBuilder

Mutable and faster

---

# Array of Strings

```java
String names[] = {"Java","Python","C++"};

for(String n : names){
    System.out.println(n);
}
```

---

# Important Differences

## Array

* Fixed size
* Same data type elements

---

## String

* Sequence of characters
* Many built-in methods

---

# Summary

* Array stores multiple values
* `length` gives size
* `for-each` easy for traversal
* `Arrays.toString()` for 1D array
* `Arrays.deepToString()` for multidimensional array
* String stores text
* Strings have many useful methods

---
