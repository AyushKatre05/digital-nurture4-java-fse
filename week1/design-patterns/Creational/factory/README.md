# Factory Method Pattern

## 📌 Intent
Create objects without exposing the instantiation logic to the client.

## 💡 Use Cases
- UI elements (buttons, shapes)
- Notification services

## ✅ Key Characteristics
- Interface or superclass defines the type
- Subclasses decide which class to instantiate

## 🛠️ Sample Code
`ShapeFactory.java` returns `Circle` or `Square` based on input.
