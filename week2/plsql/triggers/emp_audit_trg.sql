CREATE OR REPLACE TRIGGER emp_audit_trg
BEFORE INSERT ON employees
FOR EACH ROW
BEGIN
  INSERT INTO emp_audit(emp_id, action_dt)
  VALUES (:NEW.id, SYSDATE);
END;
/
