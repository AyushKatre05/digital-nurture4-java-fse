CREATE OR REPLACE FUNCTION get_salary_fn (
  p_emp_id IN employees.id%TYPE
) RETURN NUMBER IS
  v_salary employees.salary%TYPE;
BEGIN
  SELECT salary INTO v_salary FROM employees WHERE id = p_emp_id;
  RETURN v_salary;
EXCEPTION
  WHEN NO_DATA_FOUND THEN RETURN -1;
END;
/
