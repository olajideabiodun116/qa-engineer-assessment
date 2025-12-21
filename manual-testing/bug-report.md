# Bug Reports - Saucedemo Application

**Application:** https://www.saucedemo.com  
**Reported By:** Olajide Abiodun  
**Date:** December 16, 2024

---

## Bug 1: Problem User - Product Images Not Loading Correctly

**Title:** Product images display as dog images when logged in as problem_user

**Severity:** Medium  
**Priority:** High

**Environment:**
- Browser: Chrome
- OS: Windows 10
- URL: https://www.saucedemo.com/inventory.html

**Preconditions:**
- User must be logged in as problem_user

**Steps to Reproduce:**
1. Navigate to https://www.saucedemo.com
2. Enter username: `problem_user`
3. Enter password: `secret_sauce`
4. Click "Login" button
5. Observe product images on inventory page

**Expected Result:**
- All product images should display correctly showing the actual products (backpack, bike light, shirt, etc.)

**Actual Result:**
- Product images show a dog image instead of actual product photos
- Makes it impossible to visually identify products

**Additional Information:**
- Issue is specific to problem_user account
- standard_user displays images correctly
- Appears to be a data/configuration issue with problem_user profile

**Reproducibility:** 100% (Always reproducible)

---

## Bug 2: Cart Item Quantity Cannot Be Adjusted

**Title:** No option to change quantity of items in cart - users can only add 1 of each product

**Severity:** Low  
**Priority:** Medium

**Environment:**
- Browser: Chrome
- OS: Windows 10
- URL: https://www.saucedemo.com/cart.html

**Preconditions:**
- User must be logged in
- At least one item added to cart

**Steps to Reproduce:**
1. Log in with valid credentials (standard_user)
2. Add any product to cart
3. Click on cart icon to view cart
4. Look for quantity adjustment options (+ / - buttons or quantity input field)
5. Try to add the same product again from products page

**Expected Result:**
- Cart should have a quantity field where users can adjust the number of items
- Adding the same product again should increase quantity to 2
- Standard e-commerce practice to allow quantity adjustment

**Actual Result:**
- No quantity adjustment controls available
- Adding same product again does nothing (cart still shows 1)
- Only option is Remove, which deletes the item completely
- Users must remove and re-add if they want to change quantity (but this still only allows 1)

**Impact:**
- Poor user experience
- Users cannot order multiple quantities of the same item
- Workaround: None available

**Reproducibility:** 100% (Always reproducible)

---

## Bug 3: Checkout Button Functional Even With Empty Cart

**Title:** Checkout button remains enabled and functional when cart is empty

**Severity:** Medium  
**Priority:** Medium

**Environment:**
- Browser: Chrome
- OS: Windows 10
- URL: https://www.saucedemo.com/cart.html

**Preconditions:**
- User must be logged in
- Cart must be empty (no items added)

**Steps to Reproduce:**
1. Log in with valid credentials (standard_user)
2. Navigate to cart page (click cart icon)
3. Ensure cart is empty (no products added)
4. Observe the "Checkout" button state
5. Click "Checkout" button

**Expected Result:**
- Checkout button should be disabled when cart is empty
- OR clicking checkout with empty cart should show an error message: "Your cart is empty. Please add items before checkout."
- User should not be able to proceed to checkout without items

**Actual Result:**
- Checkout button remains enabled even with empty cart
- Clicking checkout proceeds to checkout information page
- User can complete entire checkout flow with no products
- Order completion shows $0.00 total but still displays success message

**Impact:**
- Business logic violation - allowing orders without products
- Could cause confusion and data integrity issues
- Creates meaningless order records

**Suggested Fix:**
- Add validation to disable checkout button when cart is empty
- Add error handling to prevent empty cart checkout

**Reproducibility:** 100% (Always reproducible)

---

## Bug 4: No Error Recovery After Validation Failure on Checkout

**Title:** Error messages on checkout form don't clear when user corrects the input

**Severity:** Low  
**Priority:** Low

**Environment:**
- Browser: All browsers
- URL: https://www.saucedemo.com/checkout-step-one.html

**Preconditions:**
- User on checkout information page with items in cart

**Steps to Reproduce:**
1. Navigate to checkout information page
2. Leave First Name field empty
3. Fill Last Name and Postal Code
4. Click "Continue" button
5. Observe error message: "Error: First Name is required"
6. Now fill in the First Name field
7. Observe the error message

**Expected Result:**
- Error message should clear/disappear once user starts correcting the input
- Provides better user experience with real-time feedback

**Actual Result:**
- Error message persists even after filling in the required field
- User must click Continue again to clear the error
- Not a critical issue but affects UX

**Impact:**
- Minor usability issue
- Could confuse users who corrected the error

**Reproducibility:** 100% (Always reproducible)

---

## Summary

- **Total Bugs Reported:** 4
- **Critical:** 0
- **High:** 0
- **Medium:** 3
- **Low:** 1
