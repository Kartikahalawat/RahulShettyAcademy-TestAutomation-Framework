# 🚀 Selenium Test Automation Framework

A **Java-based UI Test Automation Framework** built using **Selenium WebDriver, TestNG, and Maven**, designed with reusable automation components and maintainable test architecture.

This project automates functional test scenarios for the **ClickAcademy application** and demonstrates practical implementation of modern Selenium automation and test framework design.

---

## 🧪 Tech Stack

| Technology             | Purpose                       |
| ---------------------- | ----------------------------- |
| **Java**               | Programming language          |
| **Selenium WebDriver** | Web UI automation             |
| **TestNG**             | Test execution and assertions |
| **Maven**              | Build & dependency management |
| **Git / GitHub**       | Version control               |

---

## 🎯 Framework Objectives

The framework is designed to demonstrate:

* Web UI automation using **Selenium WebDriver**
* Test execution using **TestNG**
* Reusable automation components
* Separation of test logic and application interactions
* Maintainable test structure
* Maven-based project and dependency management
* Scalable foundation for extending automated regression suites

---

## 🏗️ Framework Architecture

The project follows a structured automation approach where test cases interact with reusable automation components instead of keeping all Selenium operations directly inside test methods.

```text
                    ┌─────────────────────┐
                    │     TestNG Tests     │
                    └──────────┬──────────┘
                               │
                               ▼
                    ┌─────────────────────┐
                    │  Automation / Page  │
                    │      Components      │
                    └──────────┬──────────┘
                               │
                               ▼
                    ┌─────────────────────┐
                    │   Selenium WebDriver│
                    └──────────┬──────────┘
                               │
                               ▼
                    ┌─────────────────────┐
                    │   ClickAcademy App  │
                    └─────────────────────┘
```

---

## 📁 Project Structure

```text
RahulShettyAcademy-TestAutomation-Framework
│
├── src
│   └── test
│       └── java
│           └── ...
│
├── pom.xml
├── .gitignore
└── README.md
```

### Key Components

**Test Layer**

* Contains TestNG-based automated test cases
* Defines test scenarios and validation flow

**Automation Layer**

* Contains reusable Selenium automation components
* Handles browser interaction and application operations

**Maven Configuration**

* Manages project dependencies
* Defines Java compiler configuration
* Provides standardized project execution

---

## 🔍 Automation Coverage

The framework is intended to cover common web application testing activities such as:

* Browser initialization
* Web element identification
* User interactions
* Navigation
* Form interactions
* Functional validations
* TestNG-based test execution

The framework can be extended to support:

* Page Object Model
* Data-driven testing
* Cross-browser execution
* Parallel test execution
* API automation
* CI/CD integration
* Test reporting
* Logging

---

## ⚙️ Prerequisites

Make sure the following are installed:

* **Java JDK 25+**
* **Apache Maven**
* **Git**
* An IDE such as IntelliJ IDEA or Eclipse
* A supported web browser

Verify Java:

```bash
java -version
```

Verify Maven:

```bash
mvn -version
```

---

## 🚀 Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/Kartikahalawat/RahulShettyAcademy-TestAutomation-Framework.git
```

### 2. Navigate to the project

```bash
cd RahulShettyAcademy-TestAutomation-Framework
```

### 3. Install dependencies

```bash
mvn clean install
```

### 4. Execute tests

```bash
mvn test
```

---

## 🧩 Maven Dependencies

The framework currently uses:

```xml
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.48.0</version>
</dependency>

<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.12.0</version>
</dependency>
```

The project is configured for **Java 25**.

---

## 🧠 Framework Design Principles

The framework focuses on the following automation engineering principles:

### ♻️ Reusability

Common browser and application interactions should be implemented in reusable components rather than duplicated across test cases.

### 🧹 Maintainability

Tests should remain readable and easy to update when application behavior or UI elements change.

### 📦 Modularity

Application interaction logic and test execution logic should remain separated wherever practical.

### 📈 Scalability

The framework is structured so additional test scenarios and automation capabilities can be added without restructuring the entire project.

### 🔎 Reliable Validation

TestNG is used to organize and execute automated tests and validate expected application behavior.

---

## 🔮 Future Enhancements

The framework can be further enhanced with:

* [ ] Page Object Model (POM)
* [ ] WebDriverManager / automated driver management
* [ ] TestNG XML suite configuration
* [ ] Data-driven testing
* [ ] Parameterization
* [ ] Parallel execution
* [ ] Cross-browser testing
* [ ] Extent Reports / Allure Reports
* [ ] Logging with Log4j2
* [ ] Screenshot capture on failure
* [ ] Retry mechanism for transient failures
* [ ] API automation using REST Assured
* [ ] CI/CD integration using Jenkins or GitHub Actions
* [ ] Docker-based test execution

---

## 📊 Automation Engineering Focus

This project demonstrates hands-on experience with:

```text
Java
  ↓
Selenium WebDriver
  ↓
TestNG
  ↓
Maven
  ↓
Reusable Automation Components
  ↓
Functional UI Test Automation
```

The framework is intended to serve as a foundation for building more comprehensive **SDET / Quality Engineering automation solutions**.

---

## 👨‍💻 Author

**Kartik Ahalawat**

SDET | Quality Engineering & Test Automation | Java | Selenium | Playwright | API Testing

---

## ⭐ Project

If you find this framework useful for learning or reference, feel free to explore the repository and extend it with additional automation capabilities.

**Repository:**
https://github.com/Kartikahalawat/RahulShettyAcademy-TestAutomation-Framework
