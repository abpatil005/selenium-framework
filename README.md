# 🚀 Selenium Automation Framework (Java + TestNG)

## 📌 Overview

This project is a **Test Automation Framework** built using **Selenium WebDriver, Java, TestNG, and Maven**.

It follows the **Page Object Model (POM)** design pattern to ensure:

* Maintainability
* Reusability
* Scalability

This framework simulates real-world automation testing practices used in industry.

---

## 🛠️ Tech Stack

* **Java**
* **Selenium WebDriver**
* **TestNG**
* **Maven**
* **Extent Reports**

---

## 📂 Project Structure

```
selenium-framework
│── src/main/java
│   ├── base        # Driver setup & teardown
│   ├── pages       # Page Object classes
│   ├── utils       # Utility classes (Wait, Screenshot, Config, Retry)
│
│── src/test/java
│   ├── tests       # Test cases
│
│── src/test/resources
│   ├── config.properties   # Config file
│
│── reports          # Extent Reports
│── screenshots      # Failure screenshots
│── pom.xml          # Maven dependencies
```

---

## ⚙️ Framework Features

✔ Page Object Model (POM) design
✔ Config-driven execution (browser, URL)
✔ Explicit wait utilities
✔ Screenshot capture on failure
✔ Extent Report integration
✔ Retry mechanism for flaky tests
✔ Clean & modular architecture

---

## 🌐 Test Application

* https://www.saucedemo.com/

---

## ▶️ How to Run Tests

### 🔹 Using Maven

```
mvn clean test
```

### 🔹 Using Eclipse

* Right-click on test class
* Run As → TestNG Test

---

## 📊 Reports

* Extent Report generated after execution
* Screenshots captured for failed tests

📁 Location:

```
/reports/ExtentReport.html
```

---

## 📸 Sample Execution Report

(Add your screenshot here)

```
screenshots/sample.png
```

---

## 🔄 Retry Mechanism

* Automatically retries failed test cases
* Reduces flaky test failures

---

## ⚡ Utilities Included

* WaitUtils → Explicit waits
* ScreenshotUtil → Capture screenshots
* ConfigReader → Read config.properties
* RetryAnalyzer → Retry failed tests
* TestListener → Logging & reporting

---

## 📌 Future Enhancements

* Parallel execution (TestNG XML)
* Cross-browser testing
* Jenkins CI/CD integration
* Docker support
* API testing integration

---

## 👨‍💻 Author

**Abhishek**

---

## ⭐ If you like this project

Give it a ⭐ on GitHub!
