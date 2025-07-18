# Spring Boot – Actuator + Basic Security

This module demonstrates:

✅ Securing Actuator endpoints using Spring Security  
✅ Exposing application health, metrics, and info via `/actuator/*` endpoints

---

## 🔗 Exposed Endpoints

| Endpoint            | Description                 |
|---------------------|-----------------------------|
| `/actuator/health`  | Health status               |
| `/actuator/info`    | App name, version           |
| `/actuator/metrics` | Metrics (CPU, memory, etc.) |
| `/api/health`       | Custom endpoint             |

---

## 🔐 Default Credentials

| Username | Password   |
|----------|------------|
| admin    | admin123   |

---

## ▶️ Run the App

```bash
mvn spring-boot:run
