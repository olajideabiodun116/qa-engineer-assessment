# QA Engineer Assessment - Complete Solution

**Candidate:** Olajide Abiodun  
**Application Under Test:** Saucedemo (https://www.saucedemo.com) & JSONPlaceholder API (https://jsonplaceholder.typicode.com)

---

## Project Structure
```
qa-engineer-assessment/                          # Main documentation
├── automation/
│   ├── api-test/
│   │   ├── JSONPlaceholder-API-Tests.postman_collection.json
│   │   └── README.md                  # API testing guide
│   └── ui-test/
│       ├── src/
│       │   └── main/
│       │       └── java/
│       │           └── com.saucedemo/
│       │               └── tests/
│       │                   └── SaucedemoLoginTest.java
│       ├── pom.xml
│       ├── testng.xml
│       └── README.md                  # UI testing guide
├── manual-testing/
│   ├── test-case.md                   # 25 manual test cases
│   ├── exploratory-testing-report.md  # Exploratory testing
│   └── bug-report.md                  # 4 bug reports
└── qa-thinking/
    └── answer.md                      # QA thinking answers
```

---

##  Assessment Overview

This repository contains a comprehensive QA assessment demonstrating:
- ✅ Manual testing skills (80% focus)
- ✅ UI automation with Selenium Java
- ✅ API automation with Postman
- ✅ Professional QA thinking and decision-making

---

##  Part 1: Manual Testing

### ✅ Task 1: Test Case Design

**Location:** `manual-testing/test-case.md`

- **Count:** 25 test cases
- **Coverage:**
    - Login: 6 test cases
    - Products: 4 test cases
    - Cart: 6 test cases
    - Checkout: 7 test cases
    - Logout: 1 test case
    - Edge cases: 1 test case
- **Format:** Markdown table format

**Google Sheets Link:** [Insert your Google Sheets link here]

---

### ✅ Task 2: Exploratory Testing

**Location:** `manual-testing/exploratory-testing-report.md`

- **Duration:** 30 minutes
- **Areas Covered:**
    - Login functionality (all user types)
    - Product page & filtering
    - Shopping cart functionality
    - Checkout flow
    - Navigation & UI elements
- **Issues Found:** 3 issues documented
- **Risks Identified:** High, Medium, and Low risk categories
- **Improvement Suggestions:** Functional, UX, and Technical improvements

---

### ✅ Task 3: Bug Reporting

**Location:** `manual-testing/bug-report.md`

- **Bugs Documented:** 4 bugs
    1. Problem user - Broken product images (Medium severity)
    2. No cart quantity adjustment (Low severity)
    3. Checkout button works with empty cart (Medium severity)
    4. Error messages don't clear on input (Low severity)
- **Format:** Detailed bug reports with title, severity, priority, steps to reproduce, expected vs actual results

---

##  Part 2: Automation Testing

### ✅ Task 4A: UI Automation (Selenium Java)

**Location:** `automation/ui-tests/`

**Framework:** Selenium WebDriver + Java + TestNG + Maven

**Test Coverage:**
- Login functionality test
- Validates successful login with valid credentials
- Verifies user redirection to Products page

**Technology Stack:**
- Language: Java 11+
- Framework: Selenium WebDriver
- Test Runner: TestNG
- Build Tool: Maven
- Browser: Chrome

**How to Run:**
```bash
cd automation/ui-tests
mvn clean install
mvn test
```

**Detailed Instructions:** See `automation/ui-tests/README.md`

---

###  Task 4B: API Automation (Postman)

**Location:** `automation/api-test/`

**Tool:** Postman 

**Test Coverage:**
- 8 API tests with 20+ assertions
- All CRUD operations (Create, Read, Update, Delete)
- Positive and negative test scenarios
- Error handling validation

**API Used:** JSONPlaceholder (https://jsonplaceholder.typicode.com)

**Note:** Originally specified Reqres.in, but encountered 403 Forbidden errors. Used JSONPlaceholder as a valid alternative - both APIs serve the same testing purpose.

**Tests Included:**
1. GET List Users
2. GET Single User
3. POST Create User
4. GET User Not Found (404)
5. PUT Update User
6. DELETE User
7. GET List Posts
8. POST Create Post

**How to Run:**
- **Option 1:** Import `JSONPlaceholder-API-Tests.postman_collection.json` into Postman and run
- **Option 2:** Use Newman CLI: `newman run JSONPlaceholder-API-Tests.postman_collection.json`

**Detailed Instructions:** See `automation/api-test/README.md`

---

##  Part 3: QA Thinking

**Location:** `qa-thinking/answer.md`

**Questions Answered:**

1. **What areas would you prioritize for testing in production?**
    - Payment Processing & Checkout Flow
    - Login & Authentication
    - Shopping Cart Functionality
    - Product Display & Inventory

2. **Which tests would you NOT automate, and why?**
    - Visual/UI/UX Testing
    - Exploratory Testing
    - Usability & Accessibility Testing
    - Tests Requiring Physical Interaction

3. **How do you decide when a bug should block a release?**
    - Business Impact Criteria
    - User Impact Criteria
    - Technical Severity Criteria

---

##  Technologies Used

### Manual Testing:
- Markdown documentation
- Google Sheets for test cases
- Exploratory testing methodology

### UI Automation:
- **Language:** Java 11+
- **Framework:** Selenium WebDriver 4.16.1
- **Test Runner:** TestNG 7.8.0
- **Build Tool:** Maven
- **Browser:** Chrome with ChromeDriver

### API Automation:
- **Tool:** Postman
- **CLI Runner:** Newman
- **Scripting:** JavaScript (Postman test scripts)
- **API:** JSONPlaceholder

---

## Quick Start Guide

### Prerequisites:
- Java JDK 11 or higher
- Maven 3.6+
- Chrome Browser
- Postman (for API tests)

### Setup and Run:

#### **1. Clone Repository**
```bash
git clone [your-repository-url]
cd qa-engineer-assessment
```

#### **2. Run UI Tests**
```bash
cd automation/ui-tests
mvn clean install
mvn test
```

#### **3. Run API Tests**
```bash
# Import Postman collection and run
# OR use Newman:
cd automation/api-test
newman run JSONPlaceholder-API-Tests.postman_collection.json
```

---

##  Documentation Links

| Document | Description | Location |
|----------|-------------|----|
| Test Cases | 25 manual test cases | [manual-testing/test-case.md](manual-testing/test-case.md) |
| Google Sheets | Test cases in spreadsheet format | https://docs.google.com/spreadsheets/d/1upPndWg6b5MGKzuMY58Y4djVaYRlcfgwO2ekqS8cd9s/edit?gid=0#gid=0] |
| Exploratory Report | 30-min exploratory testing findings | [manual-testing/exploratory-testing-report.md](manual-testing/exploratory-testing-report.md) |
| Bug Reports | 4 documented bugs | [manual-testing/bug-report.md](manual-testing/bug-report.md) |
| UI Tests | Selenium Java automation | [automation/ui-test/](automation/ui-test/) |
| API Tests | Postman collection | [automation/api-test/](automation/api-test/) |
| QA Thinking | Answers to assessment questions | [qa-thinking/answer.md](qa-thinking/answer.md) |

---

##  Assessment Coverage Summary

| Requirement | Status | Details |
|-------------|--------|---------|
| 20-25 Manual Test Cases | ✅ Complete | 25 test cases covering all features |
| Exploratory Testing | ✅ Complete | 30-minute session documented |
| 3+ Bug Reports | ✅ Complete | 4 bugs with full details |
| UI Automation | ✅ Complete | Selenium + Java + TestNG |
| API Automation | ✅ Complete | Postman + 8 tests + 20+ assertions |
| QA Questions | ✅ Complete | All 3 questions answered |

---

##  Test Execution Summary

### Manual Testing:
- **Test Cases:** 25
- **Priority:** High (15), Medium (7), Low (3)
- **Bugs Found:** 4
- **Coverage:** Login, Products, Cart, Checkout, Logout

### UI Automation:
- **Tests:** 1 login test
- **Framework:** Selenium WebDriver + TestNG
- **Execution Time:** ~10 seconds

### API Automation:
- **Tests:** 8 API tests
- **Assertions:** 20+
- **Execution Time:** ~3-5 seconds

---

##  Contact Information

**Name:** Olajide Abiodun  
**Email:** Olajideabiodun116@gmail.com

**GitHub:** https://github.com/olajideabiodun116/qa-engineer-assessment.git

---

##   Submission Checklist

- ✅ Test cases document (Google Sheets - public link)
- ✅ Exploratory testing report
- ✅ Bug reports (4 bugs)
- ✅ UI automation code (Selenium + Java)
- ✅ API automation collection (Postman)
- ✅ QA thinking questions answered
- ✅ Complete README with setup instructions
- ✅ All files hosted on GitHub (public repository)

---

##  Acknowledgments

This assessment demonstrates comprehensive QA skills including:
- Strong manual testing approach with detailed documentation
- Effective bug identification and reporting
- Solid automation skills with industry-standard tools
- Strategic QA thinking and decision-making
- Professional code structure and documentation

**Status:** Complete ✅

