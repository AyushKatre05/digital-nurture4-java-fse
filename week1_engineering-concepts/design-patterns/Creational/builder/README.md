# Builder Pattern

## 📌 Intent
Separate the construction of a complex object from its representation so that the same construction process can create different representations.

## 💡 Use Cases
- Creating immutable objects (e.g., `StringBuilder`)
- Building UI elements, HTTP requests

## ✅ Key Characteristics
- Step-by-step object creation
- Fluent interface using method chaining
- Immutable result after build

## 🛠️ Sample Code
See `User.Builder` that builds a `User` object using `setFirstName()` and `setLastName()`.
