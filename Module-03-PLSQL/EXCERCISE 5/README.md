# Exercise 5: Triggers

## Scenario 1: UpdateCustomerLastModified

### Objective

Automatically update the LastModified field whenever a customer record is modified.

### Logic

* Create a BEFORE UPDATE trigger on the Customers table.
* Set LastModified to the current system date.

### Result

The trigger successfully updates the LastModified column whenever a customer record is updated.

---

## Scenario 2: LogTransaction

### Objective

Maintain an audit trail for every transaction.

### Logic

* Create an AFTER INSERT trigger on the Transactions table.
* Insert transaction details into the AuditLog table.

### Result

The trigger successfully records transaction activities in the audit log.

---

## Scenario 3: CheckTransactionRules

### Objective

Validate transaction details before insertion.

### Logic

* Ensure deposit amounts are positive.
* Ensure withdrawal amounts do not exceed account balance.
* Raise an error if any rule is violated.

### Result

The trigger successfully enforces business rules for deposits and withdrawals.

---

## Conclusion

This exercise demonstrates the use of database triggers for automatic updates, auditing, and business rule enforcement.
