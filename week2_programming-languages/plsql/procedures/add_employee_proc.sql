CREATE OR REPLACE PROCEDURE add_employee_proc (
  p_emp_id   IN employees.id%TYPE,
  p_emp_name IN employees.name%TYPE,
  p_salary   IN employees.salary%TYPE
) AS
BEGIN
  MERGE INTO employees e
  USING (SELECT p_emp_id id FROM dual) d
  ON (e.id = d.id)
  WHEN MATCHED THEN
    UPDATE SET e.name = p_emp_name, e.salary = p_salary
  WHEN NOT MATCHED THEN
    INSERT (id, name, salary)
    VALUES (p_emp_id, p_emp_name, p_salary);
END;
/
-- test
BEGIN
  add_employee_proc(101,'Ravi',55000);
END;
/
