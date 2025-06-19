CREATE OR REPLACE PROCEDURE TransferFunds(fromAcc IN NUMBER, toAcc IN NUMBER, amount IN NUMBER) AS
    fromBalance NUMBER;
BEGIN
    SELECT Balance INTO fromBalance FROM Accounts WHERE AccountID = fromAcc;

    IF fromBalance >= amount THEN
        UPDATE Accounts SET Balance = Balance - amount WHERE AccountID = fromAcc;
        UPDATE Accounts SET Balance = Balance + amount WHERE AccountID = toAcc;
        COMMIT;
    ELSE
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance in source account.');
    END IF;
END;
/
