# 🚀 Dockerfile con build integrado para Spring Boot + AWS App Runner

Este repositorio incluye un `Dockerfile` de múltiples etapas (multi-stage build) que:

1. **Compila el proyecto Java con Maven**
2. **Copia el `.jar` generado a una imagen liviana de Java**
3. **Lo despliega automáticamente en AWS App Runner**

---

## 📦 Estructura del Dockerfile

```Dockerfile
# Etapa 1: Build
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Etapa 2: Imagen final
FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY --from=build /app/target/ecommerce-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
```

---

## 🧪 Cómo probar localmente

```bash
docker build -t backendmanos .
docker run -p 8080:8080 backendmanos
```

Abre [http://localhost:8080](http://localhost:8080) para ver si responde.

---

## ☁️ Despliegue en AWS App Runner

1. GitHub Actions compila automáticamente con este Dockerfile
2. Sube la imagen a Amazon ECR
3. App Runner la consume y ejecuta tu backend en la nube

---

## 🧰 Requisitos

- `pom.xml` en la raíz
- Código fuente en `src/`
- Clase principal con `@SpringBootApplication` y `main()`
- Puerto expuesto: `8080`

---

## ✅ Tips

- Asegúrate de que tu `application.properties` no tenga errores
- Crea un endpoint básico con `@RestController` para responder al health check de App Runner

