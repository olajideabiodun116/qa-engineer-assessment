# UI Automation Testing - Selenium Java

## Overview

UI automation tests for Saucedemo e-commerce application using Selenium WebDriver with Java and JUnit.

**Application Under Test:** https://www.saucedemo.com

---

## Deliverables

### 1. Test Code


**Test Coverage:**
- `verifyUserCanLoginSuccessfully()` - Validates successful login with valid credentials

---

### 2. Instructions to Run Locally

#### **Prerequisites:**

- Java JDK 11+
- Maven
- Chrome Browser
- ChromeDriver

#### **Setup Steps:**
```bash
# Navigate to ui-tests directory
cd automation/ui-tests

# Install dependencies
mvn clean install

# Run tests
mvn test

# Run specific test
mvn test -Dtest=SauceDemoLoginTest
```

#### **Expected Output:**
```
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
BUILD SUCCESS
```

---

### 3. Brief Explanation

#### **Test Approach:**

**Test Flow:**
1. Open Chrome browser
2. Navigate to https://www.saucedemo.com/
3. Enter username: `standard_user`
4. Enter password: `secret_sauce`
5. Click login button
6. Verify user is redirected to Products page
7. Close browser

**Validation:**
- Assert that page title equals "Products" after successful login

**Locator Strategy:**
- Uses ID and className for reliable element identification

---

## Technologies Used

- **Language:** Java 11+
- **Framework:** Selenium WebDriver
- **Test Runner:** JUnit 4
- **Build Tool:** Maven
- **Browser:** Chrome

---

## Test Reports

After execution, view reports at:
```
target/surefire-reports/index.html
```

---

## Author

**Olajide Abiodun**  
QA Engineer Assessment