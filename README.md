🚀 Selenium Automation Framework (Java + TestNG + CI/CD)
📌 Overview

This project is a Test Automation Framework built using Selenium WebDriver, Java, TestNG, and Maven.

It follows the Page Object Model (POM) design pattern and integrates CI/CD using GitHub Actions to simulate real-world automation testing practices.

🛠️ Tech Stack
Java
Selenium WebDriver
TestNG
Maven
Extent Reports
GitHub Actions (CI/CD)
WebDriverManager
📂 Project Structure
selenium-framework
│── src/main/java
│   ├── base        # Driver setup & teardown
│   ├── pages       # Page Object classes
│   ├── utils       # Utility classes
│
│── src/test/java
│   ├── tests       # Test classes
│
│── src/test/resources
│   ├── config.properties
│
│── reports
│── screenshots
│── .github/workflows
│   └── maven.yml   # CI/CD pipeline
│
│── pom.xml
⚙️ Framework Features

✔ Page Object Model (POM)
✔ Config-driven execution
✔ Screenshot capture on failure
✔ Extent Reports integration
✔ Retry mechanism
✔ Utility classes (Wait, Config, Screenshot)
✔ Data-driven testing (JSON supported)
✔ Clean architecture
✔ Maven based execution

🚀 CI/CD Integration (GitHub Actions)

This framework includes Continuous Integration using GitHub Actions.

Pipeline performs:

Checkout code
Setup Java
Build using Maven
Execute TestNG tests
Upload test reports as artifacts

Workflow file:

.github/workflows/maven.yml
📊 Artifacts Generated in CI

After pipeline execution:

Extent Reports
TestNG Reports
Screenshots (on failure)

These can be downloaded from:

GitHub → Actions → Latest Run → Artifacts
🌐 Test Application
https://www.saucedemo.com/

▶️ How to Run Tests
Using Maven
mvn clean test

Using Eclipse
Right click test class
Run As → TestNG Test

📊 Reports

Reports generated after execution:

/reports/ExtentReport.html
/test-output/index.html
📸 Screenshots

Screenshots captured automatically on test failure.

Location:

/screenshots
🔄 Retry Mechanism

Failed tests automatically retried using:

RetryAnalyzer
⚡ Utilities Included
WaitUtils
ScreenshotUtil
ConfigReader
RetryAnalyzer
TestListener
JsonUtils

🔀 Branch Strategy (CI/CD)
feature branch → stage branch → master
stage → CI testing
master → stable release
📌 Future Enhancements
Parallel execution
Cross browser testing
Jenkins integration
Docker execution
API testing (Postman + RestAssured)
Slack/Email notifications

👨‍💻 Author

Abhishek

⭐ If you like this project

Give it a ⭐ on GitHub
