# Spring Boot – HATEOAS Example

This module adds **hypermedia links** to RESTful responses using Spring HATEOAS.

---

## 💡 What Is HATEOAS?

**Hypermedia as the Engine of Application State**  
It helps API consumers navigate dynamically by providing links inside the response.

---

## 🔗 Example Response

```json
{
  "id": 1,
  "title": "Spring in Action",
  "author": "Craig Walls",
  "_links": {
    "self": {
      "href": "http://localhost:8080/api/hateoas-books/1"
    },
    "all-books": {
      "href": "http://localhost:8080/api/hateoas-books"
    }
  }
}
