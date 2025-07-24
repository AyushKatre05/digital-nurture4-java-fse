# Decorator Pattern

## 📌 Intent
Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing.

## 💡 Use Cases
- Extending functionality of UI components, streams
- Logging, security, I/O wrapping

## ✅ Key Characteristics
- Implements the same interface as the original object
- Adds new behavior before/after delegating to the real object

## 🛠️ Sample Code
`MilkDecorator` adds milk to a base `SimpleCoffee`, modifying both cost and description.
