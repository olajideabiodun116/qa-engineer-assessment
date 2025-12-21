# Saucedemo – Manual Test Cases

**Application:** Saucedemo (https://www.saucedemo.com)  
**Tester:** Olajide Abiodun  
**Date:** December 16, 2024

---

| TC ID | Module | Test Case Title | Preconditions | Test Steps | Test Data | Expected Result | Priority | Type |
|-------|--------|-----------------|---------------|------------|-----------|-----------------|----------|------|
| TC_001 | Login | Verify successful login with valid credentials | User is on login page | 1. Enter valid username<br>2. Enter valid password<br>3. Click Login button | Username: standard_user<br>Password: secret_sauce | User successfully logged in and redirected to the products page | High | Positive |
| TC_002 | Login | Verify login fails with invalid username | User is on login page | 1. Enter invalid username<br>2. Enter valid password<br>3. Click Login button | Username: invalid_user<br>Password: secret_sauce | Error message displayed indicating invalid credentials | High | Negative |
| TC_003 | Login | Verify login fails with invalid password | User is on login page | 1. Enter valid username<br>2. Enter invalid password<br>3. Click Login button | Username: standard_user<br>Password: wrong_pass | Error message displayed indicating invalid credentials | High | Negative |
| TC_004 | Login | Verify login fails with empty credentials | User is on login page | 1. Leave username empty<br>2. Leave password empty<br>3. Click Login button | Username: (empty)<br>Password: (empty) | Validation error message displayed | High | Negative |
| TC_005 | Login | Verify locked-out user cannot log in | User is on login page | 1. Enter locked_out_user username<br>2. Enter valid password<br>3. Click Login button | Username: locked_out_user<br>Password: secret_sauce | Error message displayed indicating user is locked out | Medium | Negative |
| TC_006 | Login | Verify password field is masked | User is on login page | 1. Enter text into password field<br>2. Observe characters | Password: secret_sauce | Password characters are masked | Low | Functional |
| TC_007 | Products | Verify all products are displayed after login | User logged in as standard_user | 1. Observe products page | N/A | All products displayed with name, image, description, and price | High | Positive |
| TC_008 | Products | Verify product sorting by Price (Low to High) | User logged in on products page | 1. Click sort dropdown<br>2. Select "Price (low to high)" | N/A | Products sorted correctly in ascending order | Medium | Functional |
| TC_009 | Products | Verify product sorting by Price (High to Low) | User logged in on products page | 1. Click sort dropdown<br>2. Select "Price (high to low)" | N/A | Products sorted correctly in descending order | Medium | Functional |
| TC_010 | Products | Verify product sorting by Name (A to Z) | User logged in on products page | 1. Click sort dropdown<br>2. Select "Name (A to Z)" | N/A | Products sorted alphabetically from A to Z | Medium | Functional |
| TC_011 | Cart | Verify adding a single product to cart | User logged in on products page | 1. Click "Add to cart" on any product<br>2. Observe cart badge | Product: Sauce Labs Backpack | Cart badge shows "1" and button changes to "Remove" | High | Positive |
| TC_012 | Cart | Verify adding multiple products to cart | User logged in on products page | 1. Add three different products<br>2. Observe cart badge | Any 3 products | Cart badge displays correct item count | High | Positive |
| TC_013 | Cart | Verify removing product from cart via products page | User has items in cart | 1. Click "Remove" button on a product | N/A | Item removed and cart count updates correctly | Medium | Functional |
| TC_014 | Cart | Verify cart page displays added products | User has items in cart | 1. Click cart icon<br>2. Observe cart page | Products added | All selected products displayed with correct details | High | Positive |
| TC_015 | Cart | Verify removing product from cart page | User on cart page with items | 1. Click "Remove" button on any product | N/A | Product removed and cart updates correctly | Medium | Functional |
| TC_016 | Cart | Verify Continue Shopping button | User on cart page | 1. Click "Continue Shopping" button | N/A | User redirected back to products page | Low | Functional |
| TC_017 | Checkout | Verify checkout with valid information | User on cart page with items | 1. Click Checkout<br>2. Enter first name, last name, postal code<br>3. Click Continue | John, Doe, 12345 | User navigated to checkout overview page | High | Positive |
| TC_018 | Checkout | Verify checkout fails with empty first name | User on checkout information page | 1. Leave first name empty<br>2. Fill other fields<br>3. Click Continue | (empty), Doe, 12345 | Validation error message displayed | High | Negative |
| TC_019 | Checkout | Verify checkout fails with empty last name | User on checkout information page | 1. Enter first name<br>2. Leave last name empty<br>3. Enter postal code<br>4. Click Continue | John, (empty), 12345 | Validation error message displayed | High | Negative |
| TC_020 | Checkout | Verify checkout fails with empty postal code | User on checkout information page | 1. Enter first and last name<br>2. Leave postal code empty<br>3. Click Continue | John, Doe, (empty) | Validation error message displayed | High | Negative |
| TC_021 | Checkout | Verify checkout overview displays correct information | User on checkout overview page | 1. Verify product details<br>2. Verify payment info<br>3. Verify shipping info<br>4. Verify total | N/A | All information displayed correctly | High | Functional |
| TC_022 | Checkout | Verify successful order completion | User on checkout overview page | 1. Click Finish button | N/A | Order confirmation page displayed successfully | High | Positive |
| TC_023 | Checkout | Verify Cancel button returns user to cart | User on checkout information page | 1. Click Cancel button | N/A | User redirected back to cart page | Low | Functional |
| TC_024 | Cart | Verify empty cart behavior | User on cart page with no items | 1. Observe cart page | N/A | Cart displays empty state correctly | Medium | Edge Case |
| TC_025 | Logout | Verify successful logout | User logged in | 1. Click hamburger menu<br>2. Click Logout | N/A | User logged out and redirected to login page | High | Functional |

---

## Summary

- **Total Test Cases:** 25
- **Priority:** High (15), Medium (7), Low (3)
- **Coverage:** Login, Products, Cart, Checkout, Logout, Edge cases