# Stored Procedure – Add Employee

## 📄 File: `add_employee_proc.sql`

This procedure either adds a new employee or updates the record if it already exists.

### 🧪 Sample Call
```sql
BEGIN
  add_employee_proc(101, 'Ravi', 55000);
END;
/
