# Command Pattern

## 📌 Intent
Encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.

## 💡 Use Cases
- GUI buttons
- Undo/Redo functionality
- Job queues

## ✅ Key Characteristics
- Command interface with `execute()` method
- Concrete command holds reference to the receiver (actual logic)
- Invoker triggers commands

## 🛠️ Sample Code
`RemoteControl` can be configured to execute `LightOnCommand` or `LightOffCommand`.
