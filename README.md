# 🧾 Sistema de Gestión de Artículos

Este proyecto es una aplicación básica de consola desarrollada en **Java**, que simula un sistema de gestión de artículos. La estructura está pensada como base para una futura **API REST**, permitiendo manejar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre artículos.

## 🛠 Funcionalidades principales

- Crear artículos con **ID, nombre, precio y stock**.
- Listar todos los artículos almacenados.
- Modificar artículos existentes por su ID.
- Eliminar artículos por su ID.
- Validación básica de entradas (por ejemplo, que el ID sea un número válido).

## 💡 Estructura del artículo

Cada artículo contiene los siguientes campos:

| Campo   | Tipo      | Descripción                   |
|---------|-----------|-------------------------------|
| ID      | `int`     | Identificador único del artículo |
| Nombre  | `String`  | Nombre descriptivo del artículo |
| Precio  | `double`  | Precio en pesos               |
| Stock   | `int`     | Cantidad disponible (opcional) |

## 📦 Tecnologías utilizadas

- Lenguaje: **Java**
- Entrada y salida por consola usando `Scanner`
- Estructuras de datos: `ArrayList`
- Validaciones manuales

## 🚀 Cómo usarlo

1. Cloná el repositorio o copiá el código fuente.
2. Abrilo en tu entorno de desarrollo (como Visual Studio Code, IntelliJ o NetBeans).
3. Ejecutá la clase `Main`.
4. Usá el menú por consola para interactuar con el sistema.

## 📌 Pensado como API

Esta estructura se puede escalar a una API REST en el futuro usando frameworks como:

- 🔹 Spring Boot (Java)
- 🔹 Node.js + Express (si se reescribe en JavaScript)
- 🔹 NestJS, Django REST, etc.

## ✅ Posibles mejoras futuras

- Persistencia de datos en archivos o base de datos.
- Validaciones más avanzadas.
- Sistema de pedidos asociado a artículos.
- Interfaz gráfica (JavaFX o Swing).
- API REST con endpoints reales (GET, POST, PUT, DELETE).

---

> ⚠ Este proyecto es ideal como ejercicio para aprender los fundamentos de programación orientada a objetos, entrada/salida por consola y estructuras básicas de datos.

