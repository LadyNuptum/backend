# BackendManos - Despliegue Automático

Este repositorio tiene configuración lista para que el despliegue del backend ocurra automáticamente en AWS App Runner, sin necesidad de usar la terminal o consola de AWS.

## 🚀 ¿Qué necesitas?

1. Tener acceso al repositorio de GitHub.
2. Solo trabajar desde la rama `main`.
3. Editar el código y hacer `git push`.

## 🔐 Variables necesarias en GitHub Secrets

En tu repositorio, ve a **Settings > Secrets > Actions** y agrega las siguientes variables:

- `AWS_ACCESS_KEY_ID` - Tu clave de acceso de AWS
- `AWS_SECRET_ACCESS_KEY` - Tu clave secreta
- `AWS_REGION` - Región (ej: `us-east-1`)
- `ECR_REPOSITORY_URI` - URI del repositorio ECR (ej: `123456789012.dkr.ecr.us-east-1.amazonaws.com/backendmanos`)
- `APP_RUNNER_SERVICE_ARN` - ARN del servicio App Runner (ej: `arn:aws:apprunner:us-east-1:123456789012:service/backendmanos/...`)

Una vez configurado, cada `git push` desplegará el backend automáticamente.

<!-- Despliegue automático activado -->
<!-- trigger deploy -->

