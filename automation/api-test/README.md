# API Automation Testing - Postman

## Overview

API testing for JSONPlaceholder API using Postman.

**API Under Test:** https://jsonplaceholder.typicode.com

---

## Deliverables

### 1. Test Code / Postman Collection

**File:** `JSONPlaceholder-API-Tests.postman_collection.json`

**Tests Included:**
- API_001: GET List Users
- API_002: GET Single User
- API_003: POST Create User
- API_004: GET User Not Found (404)
- API_005: PUT Update User
- API_006: DELETE User
- API_007: GET List Posts
- API_008: POST Create Post

**Total:** 8 API tests with 20+ assertions

---

### 2. How to Execute Tests

#### **Option 1: Using Postman GUI**

1. **Install Postman**
    - Download: https://www.postman.com/downloads/

2. **Import Collection**
    - Open Postman
    - Click "Import"
    - Select `JSONPlaceholder-API-Tests.postman_collection.json`
    - Click "Import"

3. **Run Tests**
    - Right-click on collection name
    - Select "Run collection"
    - Click "Run" button
    - View results

#### **Option 2: Using Newman CLI**
```bash
# Install Newman
npm install -g newman

# Run tests
newman run JSONPlaceholder-API-Tests.postman_collection.json

# Run with HTML report
npm install -g newman-reporter-htmlextra
newman run JSONPlaceholder-API-Tests.postman_collection.json --reporters cli,htmlextra
```

---

### 3. Brief Explanation

#### **Testing Approach**

This collection tests all **CRUD operations** (Create, Read, Update, Delete) on a public REST API.

**What We Validate:**
- **Status Codes:** Verify correct HTTP responses (200, 201, 404)
- **Response Structure:** Check that required fields exist
- **Data Types:** Ensure data is in correct format
- **Error Handling:** Test API behavior with invalid requests

**Test Categories:**
1. **Positive Tests:** Valid requests that should succeed (GET users, POST create)
2. **Negative Tests:** Invalid requests that should fail gracefully (404 errors)

#### **API Selection**

**Originally Specified:** Reqres.in (https://reqres.in)  
**Actually Used:** JSONPlaceholder (https://jsonplaceholder.typicode.com)

**Reason for Change:**  
During initial testing, Reqres.in returned 403 Forbidden errors, preventing test execution. To complete the assessment and demonstrate API testing capabilities, I switched to JSONPlaceholder - another industry-standard public API used for testing and education.

**Impact:** Both APIs support identical CRUD operations and testing scenarios. The testing approach, methodology, and validations remain exactly as intended by the assessment.

---

## Technologies Used

- **Tool:** Postman
- **CLI Runner:** Newman (optional)
- **Scripting:** JavaScript (Postman test scripts)
- **API:** JSONPlaceholder

---

## Test Results

**Expected Output:**
```
All tests passing (8/8)
Total assertions: 20+
Execution time: ~3-5 seconds
```

---

## Author

**Olajide Abiodun**  
QA Engineer Assessment