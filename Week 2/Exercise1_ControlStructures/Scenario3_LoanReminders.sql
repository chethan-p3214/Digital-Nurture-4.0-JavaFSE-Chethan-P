BEGIN
    FOR loan IN (SELECT LoanID, CustomerID, DueDate FROM Loans 
                 WHERE DueDate <= SYSDATE + 30) LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: Loan ID ' || loan.LoanID || 
                             ' for Customer ' || loan.CustomerID || 
                             ' is due on ' || TO_CHAR(loan.DueDate, 'DD-MON-YYYY'));
    END LOOP;
END;
/
