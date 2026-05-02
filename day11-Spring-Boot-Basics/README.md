# 🚀 Spring Boot Day 01 - Core Fundamentals

## 📌 Topics Covered

* Spring Boot Introduction & Setup
* Project Structure
* REST API Basics
* Dependency Injection (IoC)
* Configuration Properties (.properties & .yml)

---

## 🔹 What is Spring Boot?

**Spring Boot** is a framework built on top of the Spring Framework that simplifies Java application development by reducing configuration and setup time.

---

## 🔹 Features of Spring Boot

* Auto Configuration
* Embedded Server (Tomcat)
* No XML Configuration
* Production Ready
* Microservices Friendly

---

## 🛠️ Tech Stack

* Java 8+
* Spring Boot
* Maven
* REST API

---

## 📁 Project Structure

```
src/main/java/com/example/demo
 ┣ controller
 ┣ service
 ┗ DemoApplication.java

src/main/resources
 ┣ application.properties
 ┗ application.yml
```

---

## 🔹 1. Spring Boot Setup

Main Class:

```java
@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
```

---

## 🔹 2. REST API Example

```java
@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Spring Boot!";
    }
}
```

---

## 🔹 3. Dependency Injection (IoC)

Service Class:

```java
@Service
public class MessageService {
    public String getMessage() {
        return "DI Working!";
    }
}
```

Controller:

```java
@RestController
public class DIController {

    private final MessageService service;

    public DIController(MessageService service) {
        this.service = service;
    }

    @GetMapping("/di")
    public String message() {
        return service.getMessage();
    }
}
```

---

## 🔹 4. Configuration Properties

### application.properties

```
server.port=8081
app.name=MySpringApp
```

### application.yml

```yaml
app:
  name: MyYamlApp
```

### Access in Code

```java
@Value("${app.name}")
private String appName;
```

---

## ▶️ How to Run

1. Clone the repository
2. Open in IDE (IntelliJ / Eclipse)
3. Run `DemoApplication.java`
4. Open browser:

   * http://localhost:8080/api/hello

---

## 🧪 API Testing

You can test APIs using:

* Postman
* Browser (for GET APIs)

---

## 🎯 Learning Outcome

* Understand Spring Boot basics
* Build simple REST APIs
* Learn Dependency Injection
* Work with configuration files

---

## 📌 Next Step

➡️ Day 02: Spring Data JPA & Database Integration

---

## ⭐ Author

Shivkanya Fuke

