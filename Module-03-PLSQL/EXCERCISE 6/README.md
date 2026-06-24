# Exercise 6: Cursors

## Scenario 1: GenerateMonthlyStatements

### Objective

Generate monthly transaction statements for customers.

### Logic

* Create an explicit cursor to retrieve current month transactions.
* Fetch customer and transaction details.
* Display the statement using DBMS_OUTPUT.

### Result

The cursor successfully generated monthly transaction statements for customers.

---

## Scenario 2: ApplyAnnualFee

### Objective

Deduct annual maintenance fees from all accounts.

### Logic

* Create an explicit cursor to fetch all accounts.
* Deduct a fixed annual fee from each account balance.
* Update the account records.

### Result

The cursor successfully applied annual maintenance fees to all accounts.

---

## Scenario 3: UpdateLoanInterestRates

### Objective

Update loan interest rates according to the new policy.

### Logic

* Create an explicit cursor to retrieve all loans.
* Increase each loan's interest rate by 0.5%.
* Update the loan records.

### Result

The cursor successfully updated interest rates for all loans.

---

## Conclusion

This exercise demonstrates the use of explicit cursors in PL/SQL for processing multiple records, updating account information, generating statements, and modifying loan details.
