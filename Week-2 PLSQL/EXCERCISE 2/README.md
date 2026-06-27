# Exercise 2: Error Handling

## Scenario 1: SafeTransferFunds

### Objective

Transfer funds from one account to another while handling errors such as insufficient balance.

### Logic

* Check the source account balance.
* Verify that sufficient funds are available.
* Deduct the amount from the source account.
* Add the amount to the destination account.
* Roll back the transaction if any error occurs.

### Result

The procedure successfully transfers funds between accounts and maintains transaction integrity through exception handling.

---

## Scenario 2: UpdateSalary

### Objective

Increase an employee's salary by a given percentage and handle invalid employee IDs.

### Logic

* Update the salary based on the given percentage.
* Check whether the employee exists.
* Display an error message if no matching employee is found.

### Result

The procedure successfully updates employee salaries and handles invalid employee IDs using exceptions.

---

## Scenario 3: AddNewCustomer

### Objective

Insert a new customer record while preventing duplicate customer IDs.

### Logic

* Insert customer details into the Customers table.
* Handle duplicate primary key violations.
* Display an appropriate error message when a duplicate ID is detected.

### Result

The procedure successfully adds new customers and prevents duplicate entries through exception handling.

---

## Conclusion

This exercise demonstrates the use of PL/SQL exception handling to ensure data consistency, validate business rules, and manage runtime errors effectively.
