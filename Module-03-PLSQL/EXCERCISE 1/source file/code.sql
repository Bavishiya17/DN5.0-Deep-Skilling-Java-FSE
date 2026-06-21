
BEGIN
    FOR rec IN (
        SELECT l.LoanID,
               FLOOR(MONTHS_BETWEEN(SYSDATE, c.DOB)/12) Age
        FROM Customers c
        JOIN Loans l
        ON c.CustomerID = l.CustomerID
    )
    LOOP
        IF rec.Age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE LoanID = rec.LoanID;
        END IF;
    END LOOP;

    COMMIT;
END;

ALTER TABLE Customers
ADD IsVIP VARCHAR2(5);

BEGIN
    FOR rec IN (
        SELECT CustomerID, Balance
        FROM Customers
    )
    LOOP
        IF rec.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = rec.CustomerID;
        END IF;
    END LOOP;

    COMMIT;
END;

BEGIN
    FOR rec IN (
        SELECT c.Name,
               l.EndDate
        FROM Customers c
        JOIN Loans l
        ON c.CustomerID = l.CustomerID
        WHERE l.EndDate BETWEEN SYSDATE AND SYSDATE + 30
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Loan due for '
            || rec.Name ||
            ' on ' ||
            TO_CHAR(rec.EndDate,'DD-MON-YYYY')
        );
    END LOOP;
END;
