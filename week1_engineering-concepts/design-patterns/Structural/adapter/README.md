# Adapter Pattern

## 📌 Intent
Convert the interface of a class into another interface that the client expects.

## 💡 Use Cases
- Connecting incompatible interfaces
- Wrapping legacy code into new systems

## ✅ Key Characteristics
- Wrapper class or object that delegates calls
- Provides consistent interface to client

## 🛠️ Sample Code
`MediaAdapter` adapts VLC player to be used through `MediaPlayer` interface.
