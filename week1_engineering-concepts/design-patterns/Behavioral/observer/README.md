# Observer Pattern

## 📌 Intent
Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified.

## 💡 Use Cases
- Event handling systems
- Notifications, Pub-Sub systems
- GUI frameworks

## ✅ Key Characteristics
- Subject maintains a list of observers
- Observers implement an `update()` method
- Subject notifies all observers on change

## 🛠️ Sample Code
`NewsPublisher` notifies multiple `NewsSubscriber` objects whenever news is updated.
