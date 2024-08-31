Naaptol Selenium-TestNG-POM Project

This project uses Selenium WebDriver with TestNG and Page Object Model to automate testing of the Consumer Electronics section on the Naaptol website.

## 1. Technology Stack

* Tool: Selenium WebDriver
* Testing Framework: TestNG, PageObjectModel(POM)
* Build Tool: Maven 
* Programming Language: Java
* Reporting: ExtentReports
* IDE:  Eclipse IDE
* Version Control: Git

## 2. Prerequisites

* JDK 8 or higher
* Selenium WebDriver
* TestNG
* ExtentReports library
* Appropriate browser drivers ( ChromeDriver)

## 3. Project Structure

```
project-root/
├── src/
│   ├── main/
│   │   └── java/
│   │       ├── NaptolPages/
│   │       │   ├── HomePage.java
│   │       │   ├── ConsumerElectronicsPage.java
│   │       │   ├── Accessoriespage.java
│   │       │   ├── PortableDevices.java
│   │       │   ├── SecuirityandgadgetPage.java
│   │       │   ├── HomeEntertainmentPage.java
│   │       │   ├── PortableAudiosPage.java
│   │       │   └── PrintersPage.java
│   │       └── Utils/
│   │           └── Screenshot.java
│   └── test/
│       └── java/
│           └── NaptolTest/
│               ├── Basetest.java
│               └── ConsumerElectronicsTest.java
├── [Your build tool configuration file]
└── README.md
```

## 4. Test Scenarios

The `ConsumerElectronicsTest` class contains the following test scenarios:

1. Navigation and Searching Test
2. Electronics and Accessories Test
3. Portable Devices Test
4. Security and Gadget Test
5. Home Entertainment Page Test
6. Portable Audio Page Test
7. Printers Page Test

## 5. How to Run Tests

[Provide instructions on how to run the tests, e.g., using TestNG XML, command line, etc.]

## 6. Reporting

This project uses ExtentReports for test reporting. After the test execution, you can find the report at:

```
C:\eclipse-workspace\Assessment\Report.html
```

## 7. Screenshots

Screenshots are captured at various points during test execution using the `Screenshot` utility class.

1) ![Screenshot (55)](https://github.com/user-attachments/assets/84b3c72c-1e46-475c-89d8-29c1df964c09)

2) ![Screenshot (56)](https://github.com/user-attachments/assets/6477906a-6ecc-4209-8a4e-2083f5726dec)




## 8. Page Object Model

Each page of the application is represented by a separate class in the `NaptolPages` package. These classes contain the page elements and methods to interact with those elements.

Example:

```java
public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean navigatetoconsumerselectronics() {
        // Implementation
    }
}
```
