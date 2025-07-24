# Proxy Pattern

## 📌 Intent
Provide a placeholder for another object to control access to it.

## 💡 Use Cases
- Virtual proxies (lazy loading)
- Security proxies (access control)
- Logging, caching, remote objects

## ✅ Key Characteristics
- Implements same interface as real object
- Controls or adds logic before delegating to the real object

## 🛠️ Sample Code
`ProxyInternet` restricts access to banned sites before calling `RealInternet`.
