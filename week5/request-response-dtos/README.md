# Spring Boot – DTO Request/Response Handling

This module demonstrates clean separation between the domain (`Book`) and API contracts (`BookRequest`, `BookResponse`) using DTOs.

---

## 🎯 Key Concepts

- Use `BookRequest` for incoming API data (POST).
- Use `BookResponse` to shape API response (GET, POST).
- Entity class is kept separate to avoid exposing DB schema.

---

## 📌 Endpoints

| Method | URL             | Description         |
|--------|------------------|---------------------|
| GET    | /api/dto-books   | List all books with response DTO |
| POST   | /api/dto-books   | Create book using request DTO |

---

## ✅ Technologies

- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Java 17+

---

## 🧪 How to Run

```bash
mvn spring-boot:run
