# Exercise 1: Control Structures

## Scenario 1: Apply Interest Rate Discount

### Objective

Apply a 1% discount to loan interest rates for customers whose age is greater than 60 years.

### Logic

* Calculate customer age using Date of Birth.
* Check if age is greater than 60.
* Reduce the corresponding loan interest rate by 1%.

### Result

The PL/SQL block successfully updated loan interest rates for eligible senior customers.

---

## Scenario 2: Promote Customers to VIP Status

### Objective

Mark customers as VIP if their account balance exceeds 10,000.

### Logic

* Iterate through all customers.
* Check account balance.
* Set IsVIP flag to TRUE for customers with balance greater than 10,000.

### Result

The PL/SQL block successfully identified eligible customers and updated their VIP status.

---

## Scenario 3: Loan Due Reminder

### Objective

Generate reminder messages for customers whose loans are due within the next 30 days.

### Logic

* Retrieve loans with end dates within the next 30 days.
* Fetch corresponding customer details.
* Display reminder messages using DBMS_OUTPUT.

### Output

Reminder: Loan due for John Doe

### Result

The PL/SQL block successfully identified upcoming loan due dates and generated reminder messages for customers.

---

## Conclusion

The Control Structures exercise demonstrates the use of loops, conditional statements, record processing, and data manipulation in PL/SQL to implement banking operations efficiently.

