# Spring Data JPA – CRUD Example (Product)

This module demonstrates basic CRUD operations using Spring Boot + JPA.

---

## 🛠️ What’s Included

| Operation | Method               | Repository Function |
|----------|----------------------|----------------------|
| CREATE   | `repo.save(product)` | Insert new product  |
| READ     | `repo.findByName()`  | Fetch by name       |
| UPDATE   | Modify + `save()`    | Update price        |
| DELETE   | `repo.deleteById()`  | Remove product      |

---

## 🔧 Technologies Used

- Spring Boot
- Spring Data JPA
- H2 Database (in-memory)

---

## ▶️ How to Run

```bash
mvn spring-boot:run
