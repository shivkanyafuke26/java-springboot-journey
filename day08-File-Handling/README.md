# 📁 Day 08 – File Handling in Java

## 🔹 Introduction

File Handling in Java is used to create, read, write, and manage files.
It helps in storing data permanently.

👉 Package used: `java.io`

---

## 🔹 Topics Covered

* File Class
* FileReader & FileWriter
* BufferedReader & BufferedWriter
* PrintWriter
* FileInputStream & FileOutputStream
* Serialization

---

## 🔹 File Class

Used to create and manage files.

### Important Methods

* createNewFile()
* exists()
* delete()
* getName()
* getAbsolutePath()
* canRead() / canWrite()

---

## 🔹 Writing to File

* FileWriter → writes character data
* BufferedWriter → faster writing
* PrintWriter → formatted writing

---

## 🔹 Reading from File

* FileReader → reads character data
* BufferedReader → reads line by line

---

## 🔹 Binary File Handling

* FileInputStream → read byte data
* FileOutputStream → write byte data

---

## 🔹 Append Data

Use FileWriter with true flag:
`new FileWriter("file.txt", true)`

---

## 🔹 Serialization

Used to store objects in file.

* Serializable interface
* ObjectOutputStream
* ObjectInputStream

---

## 🔹 Important Points

* Always close files
* Handle IOException
* Use buffering for performance
* Use try-with-resources

---

## 🔹 Practice Programs

* Create and delete file
* Write and read file
* Append data
* Copy file
* Serialize object

---

## 🔹 Conclusion

File Handling is important for storing and retrieving data in real-world applications like logs, reports, and configuration files.

---

## 📁 Repo Name

day08-file-handling-java

