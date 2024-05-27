# Proyecto Castores Interview

Este proyecto consiste en tres partes principales: un frontend desarrollado con Angular, scripts de migración de bases de datos en MySQL y un backend desarrollado con Spring Boot. A continuación se describen los pasos necesarios para configurar y ejecutar cada parte del proyecto.

## Requisitos

- Node.js y npm
- Angular CLI
- MySQL
- IntelliJ IDEA (o cualquier otro IDE compatible con Spring Boot)
- JDK 11 o superior

## Estructura del Proyecto

```bash
castores_interview/
│
├── angular/
│ └── ... (Proyecto Angular)
│
├── migrations/
│ └── ... (Archivos .SQL)
│
└── springBoot/
└── ... (Proyecto Spring Boot)
```

## Configuración y Ejecución del Proyecto Angular

1. **Instalar Angular CLI (si no lo tienes ya instalado)**

   ```bash
   npm install -g @angular/cli
    ```
2. **Navegar a la carpeta Angular**
    ```bash
    cd angular
    npm install
    ```
3. **iniciar el servidor del desarrollo**
    ```bash
    ng serve
    ```
    El servidor se iniciará en http://localhost:4200.

## Configurar la base de datos

1. **Crear la base de datos**
- se require abrir MySQL y ejecutar el siguiente comando para crear la abse de datos
```bash
CREATE DATABASE castores_interview;
```
2. **importar los archivos de SQL**
- navegar hasta la carpeta `Migrations` y ejecutar el siguiente comando para importar los archivos .sql en la base de datos, asegurarse de que MySQL esta configurado para escuchar el peurto 3307

```bash
mysql -u root -p -P 3307 castores_interview < nombre_del_archivo.sql
```
-Nota: se require repetir este paso para cada archivo .sql en la carpeta `Migrations`

## Configurar y ejecutar el proyecto de spring Boot BackEnd
1. **Abrir el Proyecto en IntelliJ IDEA**
- abre IntelliJ idea (o IDE preferido) y cargar el proyecto desde la carpeta `Springboot`
2. **Configurar la conexion de la base de datos**
- Asegúrate de que tu archivo application.properties esté configurado para conectarse a la base de datos castores_interview en el puerto 3307. Debería verse algo así:
```bash
spring.datasource.url=jdbc:mysql://localhost:3307/castores_interview
spring.datasource.username=root
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=update
```
3. **Ejecucion de la aplicacion**
- la ejecuin de la aplicacion require buscar la anotacion principal de `@SprinbBootApplication`, o posicionarse dentro de `src/main/java` y buscar el metodo main dentro de `CastoresinverviewApplication.java` y ejecutar este metodo main

# Notas Adicionales
- Asegurarse de que el servidor SQL este corriendo y escuchando en el peurto 3307
- Si se cuentran errores en el entorno de desarrollo, revisar logs o el proyecto es abierto a recibir retroalimentaciones e issues

# Contacto
Para cualquier duda o comentario contactarse mediante correo a
`axlbasilioa@gmail.com` o mis redes que se encuentran en mi perfil de github

gracias!
