# Strategy Pattern

## 📌 Intent
Define a family of algorithms, encapsulate each one, and make them interchangeable at runtime.

## 💡 Use Cases
- Payment methods (CreditCard, UPI)
- Sorting algorithms, compression strategies

## ✅ Key Characteristics
- Define algorithm interface
- Concrete classes implement the interface
- Context class uses the chosen strategy

## 🛠️ Sample Code
`PaymentContext` switches between `CreditCardPayment` and `UpiPayment` strategies at runtime.
