# BackendManos 🚀

Este proyecto contiene un backend Java desarrollado con **Spring Boot**, configurado para **despliegue automático en AWS App Runner** mediante **GitHub Actions** y **Amazon ECR**.

---

## 📦 Estructura

- `pom.xml` → configuración del proyecto Maven
- `src/` → código fuente del backend 
- `Dockerfile` → imagen base para despliegue
- `.github/workflows/deploy.yml` → flujo CI/CD con GitHub Actions
- `README_Despliegue_Automatico.md` → guía para estudiantes

---

## 🚀 Despliegue Automático (CI/CD)

Este repositorio está configurado para que, cada vez que hagas `git push` a la rama `main`:

1. 🔧 Se compila el backend con Maven
2. 🐳 Se construye y publica una imagen Docker en **Amazon ECR**
3. ☁️ Se actualiza el servicio en **AWS App Runner** automáticamente

Todo esto ocurre gracias al workflow de GitHub Actions, sin necesidad de ejecutar comandos manuales o acceder a la consola AWS.

---

## 🔐 Secrets necesarios en GitHub

Agrega estos secrets en `Settings → Secrets and variables → Actions` en tu repositorio:

| Nombre del Secret         | Descripción                                     |
|---------------------------|-------------------------------------------------|
| `AWS_ACCESS_KEY_ID`       | Clave pública del usuario IAM en AWS            |
| `AWS_SECRET_ACCESS_KEY`   | Clave secreta del usuario IAM                   |
| `AWS_REGION`              | Región donde se encuentra el servicio (ej: `us-east-1`) |
| `ECR_REPOSITORY_URI`      | URI del repositorio ECR                         |
| `APP_RUNNER_SERVICE_ARN`  | ARN completo del servicio App Runner            |

---

## 👨‍🎓 Recomendado para:

- Estudiantes que quieren desplegar sin usar la consola AWS
- Proyectos educativos que usan GitHub como fuente central de trabajo
- Equipos que buscan una solución simple, estable y sin fricción DevOps

---

## 📄 Licencia

Este proyecto está disponible para uso educativo.
