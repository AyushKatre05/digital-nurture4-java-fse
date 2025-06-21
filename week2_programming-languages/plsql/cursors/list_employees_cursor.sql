SET SERVEROUTPUT ON;
DECLARE
  CURSOR c_emp IS SELECT id, name FROM employees;
BEGIN
  FOR rec IN c_emp LOOP
    DBMS_OUTPUT.PUT_LINE(rec.id || ' - ' || rec.name);
  END LOOP;
END;
/
