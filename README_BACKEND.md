# Backend Base para Estudiantes - Proyecto Manos Locales

Este repositorio contiene una plantilla de backend basada en **Spring Boot** para que los estudiantes desarrollen y desplieguen su propia API en **AWS App Runner** con una base de datos en **AWS RDS**.

---

## 📦 Tecnologías Utilizadas

- Java 17 
- Spring Boot 3
- Spring Data JPA
- Spring Security + JWT
- MySQL (RDS)
- Docker
- GitHub Actions
- AWS (RDS, ECR, App Runner)

---

## 📁 Estructura del Proyecto

```
backend/
├── src/
│   └── main/
│       ├── java/com/proyecto/backend/
│       │   ├── config/         # Configuración de seguridad y beans
│       │   ├── controller/     # Endpoints REST
│       │   ├── dto/            # Objetos de transferencia
│       │   ├── model/          # Entidades de base de datos
│       │   ├── repository/     # Interfaces de acceso a datos
│       │   └── service/        # Lógica de negocio
│       └── resources/
│           └── application.properties
├── Dockerfile
├── pom.xml
└── .github/workflows/deploy.yml
```

---

## 🔐 Variables de Entorno

Configura estos valores en GitHub Secrets **y** en AWS App Runner:

### Base de Datos (RDS)
- `DB_URL`: URL JDBC a tu base de datos
- `DB_USERNAME`: Usuario de la base de datos (ej: admin)
- `DB_PASSWORD`: Contraseña de acceso

### Despliegue en AWS
- `AWS_ACCESS_KEY_ID`: Tu access key de IAM
- `AWS_SECRET_ACCESS_KEY`: Tu secret key de IAM
- `AWS_REGION`: Región AWS (ej: us-east-1)
- `ECR_REPOSITORY_URI`: Repositorio ECR
- `APP_RUNNER_SERVICE_ARN`: ARN del servicio App Runner
- `PORT`: 8080
- `JWT_SECRET`: Secreto usado para tokens JWT (opcional)

---

## 🚀 Despliegue Automático

Este proyecto usa **GitHub Actions** para compilar, crear la imagen Docker y desplegarla automáticamente a **App Runner**.

Cada vez que hagas `push` a `main`, se activará el workflow:

1. Se compila el proyecto.
2. Se construye la imagen Docker.
3. Se sube la imagen a AWS ECR.
4. Se actualiza el servicio App Runner con la nueva imagen.

---

## 🧪 Pruebas desde Postman

- Registro de usuario:
```
POST /auth/register
```

- Login (JWT):
```
POST /auth/login
```

- Endpoints protegidos:
Agregar `Authorization: Bearer <token>` en headers.

---

## 📚 Recomendaciones

- No subir datos sensibles al código.
- Usar `@CrossOrigin("*")` durante desarrollo si accedes desde frontends locales.
- Validar los datos antes de insertarlos.
- Usar mensajes de commit claros y organizados.

---

## ✅ Resultado Esperado

- Proyecto desplegado en App Runner.
- Conexión activa a RDS.
- API funcionando en entorno real.
- Acceso a logs y estadísticas desde AWS Console.

---

¡Buena suerte con tu desarrollo! 🚀
