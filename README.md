# 🐾 Petland API

REST API for **Petland**, developed with **Java 21**, **Spring Boot**, and **PostgreSQL**, following a layered architecture with **Controller**, **Service**, **Repository**, and **DTOs**.

The project was created to demonstrate the implementation of a complete CRUD application using **Spring Data JPA**, **RESTful APIs**, and **OpenAPI (Swagger)** documentation.

[![Java](https://img.shields.io/badge/Java-21-orange.svg)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-4.x-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-17-blue.svg)](https://www.postgresql.org/)
[![Docker](https://img.shields.io/badge/Docker-enabled-2496ED.svg)](https://www.docker.com/)
[![Swagger](https://img.shields.io/badge/OpenAPI-Swagger-success.svg)](https://swagger.io/)

---

# 📚 Table of Contents

* [About the Project](#about-the-project)
* [Technologies](#technologies)
* [Features](#features)
* [Architecture](#architecture)
* [Project Structure](#project-structure)
* [Running the Project](#running-the-project)
* [API Documentation](#api-documentation)
* [Available Endpoints](#available-endpoints)
* [Database](#database)
* [Author](#author)

---

# 🚀 About the Project

Petland API is a backend application responsible for managing:

* Clients
* Animals
* Products and Services
* Appointments

The project follows good software engineering practices, including:

* Layered Architecture
* DTO Pattern
* Repository Pattern
* Spring Data JPA
* RESTful API Design
* Domain-Driven Design (DDD) concepts

---

# 🛠 Technologies

* Java 21
* Spring Boot
* Spring Web
* Spring Data JPA
* Hibernate
* PostgreSQL
* H2 Database
* Maven
* Lombok
* Docker
* SpringDoc OpenAPI (Swagger)

---

# ✨ Features

## Clients

* Create client
* List clients
* Update client
* Delete client

## Animals

* Create animal
* List animals
* Update animal
* Delete animal

## Products

* Create product
* List products
* Update product
* Delete product

## Appointments

* Create appointment
* List appointments
* Update appointment
* Delete appointment

---

# 🏗 Architecture

The project is organized using a layered architecture:

```text
Controller
      │
      ▼
Service
      │
      ▼
Repository
      │
      ▼
Database
```

DTOs are used to isolate the API layer from the persistence layer.

---

# 📂 Project Structure

```text
petland-api/src/main/java/com/petlando
├── atendimento 
├── cadastro
│   ├── controller
│   ├── model
│   │   ├── dto
│   │   └── entity 
│   ├── repository
│   └── service
├── start
└── PetlandApiApplication.java
```

---

# ▶️ Running the Project

## Prerequisites

* Java 21
* Maven
* Docker

---

## Clone the repository

```bash
git clone https://github.com/FelipeLuizonDev/petland.git
```

```bash
cd petland
```

---

## Start PostgreSQL

```bash
docker compose up -d
```

The container will be created with:

| Property | Value          |
| -------- | -------------- |
| Database | `petland`      |
| User     | `postgres`     |
| Password | `postgres@123` |
| Port     | `5433`         |

---

## Run the application

Windows:

```bash
mvnw.cmd spring-boot:run
```

Linux/macOS:

```bash
./mvnw spring-boot:run
```

The application will start on:

```text
http://localhost:8080
```

---

# 📖 API Documentation

Swagger UI is available at:

```text
http://localhost:8080/swagger-ui/index.html
```

OpenAPI specification:

```text
http://localhost:8080/v3/api-docs
```

---

# 🔌 Available Endpoints

## 🐶 Animals

| Method | Endpoint        |
| ------ | --------------- |
| GET    | `/animais`      |
| POST   | `/animais`      |
| PUT    | `/animais/{id}` |
| DELETE | `/animais/{id}` |

---

## 📦 Products

| Method | Endpoint         |
| ------ | ---------------- |
| GET    | `/produtos`      |
| POST   | `/produtos`      |
| PUT    | `/produtos/{id}` |
| DELETE | `/produtos/{id}` |

---

## 👤 Clients

| Method | Endpoint         |
| ------ | ---------------- |
| GET    | `/clientes`      |
| POST   | `/clientes`      |
| PUT    | `/clientes/{id}` |
| DELETE | `/clientes/{id}` |

---

## 🩺 Appointments

| Method | Endpoint             |
| ------ | -------------------- |
| GET    | `/atendimentos`      |
| POST   | `/atendimentos`      |
| PUT    | `/atendimentos/{id}` |
| DELETE | `/atendimentos/{id}` |

---

# 🗄 Database

For development, the project supports:

* PostgreSQL (recommended)
* H2 Database (in-memory)

The provided `docker-compose.yml` starts a PostgreSQL 17 container with persistent storage.

---

# 👨‍💻 Author

**Felipe Luizon**

* GitHub: https://github.com/FelipeLuizonDev
* LinkedIn: https://www.linkedin.com/in/felipeluizon
