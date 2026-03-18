# 🚀 Selenium Automation Framework (Java + TestNG)

## 📌 Overview

This project is a **Selenium-based Test Automation Framework** built using **Java, TestNG, Maven, and Page Object Model (POM)** design pattern.

It demonstrates how to build a **scalable, maintainable, and reusable automation framework** suitable for real-world web testing.

---

## 🛠️ Tech Stack

* **Language:** Java
* **Automation Tool:** Selenium WebDriver
* **Test Framework:** TestNG
* **Build Tool:** Maven
* **Design Pattern:** Page Object Model (POM)
* **Reporting:** Extent Reports

---

## 📂 Project Structure

```
selenium-framework
│── src
│   ├── main
│   │   ├── java
│   │   │   ├── base        # Base classes (WebDriver setup)
│   │   │   ├── pages       # Page Object classes
│   │   │   ├── utils       # Utility classes (Waits, Screenshots, Config, Retry)
│   │
│   ├── test
│   │   ├── java
│   │   │   ├── tests       # Test classes
│   │   ├── resources
│   │       ├── config.properties   # Configuration file
│
│── reports                 # Extent Reports
│── screenshots             # Failure screenshots
│── pom.xml                 # Maven dependencies
```

---

## ⚙️ Features

✔ Page Object Model (POM) implementation
✔ Config-driven framework (URL, browser, etc.)
✔ Screenshot capture on test failure
✔ Extent Report integration for execution results
✔ Retry mechanism for failed test cases
✔ Reusable utility methods (Waits, Config, Screenshots)
✔ Clean and scalable project structure

---

## 🌐 Test Application

* https://www.saucedemo.com/

---

## ▶️ How to Run Tests

### 🔹 Using Maven

```
mvn clean test
```

### 🔹 From Eclipse

* Right-click on test class → Run As → TestNG Test

---

## 📊 Reporting

* Extent Report is generated after execution
* Screenshots are captured automatically for failed tests

📁 Report location:

```
/reports/ExtentReport.html
```

---

## 📸 Sample Report

(Add your screenshot here after uploading)

```
screenshots/sample.png
```

---

## 🔄 Retry Mechanism

* Failed test cases are automatically retried using a custom Retry Analyzer
* Helps reduce flaky test failures

---

## ⚡ Utilities Included

* WaitUtils (Explicit waits)
* ScreenshotUtil (Capture screenshots)
* ConfigReader (Read properties)
* RetryAnalyzer (Retry failed tests)
* TestListener (Logging & reporting hooks)

---

## 📌 Future Enhancements

* Parallel execution (TestNG XML)
* Cross-browser testing
* CI/CD integration (Jenkins)
* Docker integration
* API testing integration

---

## 👨‍💻 Author

**Abhishek**

---

## ⭐ If you like this project

Give it a ⭐ on GitHub!
