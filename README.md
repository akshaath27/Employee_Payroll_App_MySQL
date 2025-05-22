# Spring Boot Employee Payroll System with MySQL

This is an extended version of the Employee Payroll project using MySQL as the backend database. It supports full CRUD operations through REST APIs with persistent data storage.

---

## Table of Contents

- [Overview](#overview)
- [Technologies Used](#technologies-used)
- [Features](#features)
- [Project Structure](#project-structure)
- [Database Configuration](#database-configuration)
- [API Endpoints](#api-endpoints)

---

## Overview

The system manages employee data including name, salary, and department. This version uses MySQL instead of H2, allowing real-world scalability and integration.

---

## Technologies Used

- Java 17+
- Spring Boot
- Spring Data JPA
- MySQL
- Lombok
- Maven

---

## Features

- Full CRUD with database persistence
- DTO and model separation
- Exception handling and input validation
- Organized service and repository layers

---

## Project Structure

- `model` – Entity classes representing the database structure  
- `dto` – Data Transfer Objects for validation and clean input  
- `repository` – Interfaces extending JPA Repositories for MySQL  
- `controller` – REST API endpoints  
- `service` – Business logic and service-layer operations  

---

## Database Configuration

Update the `application.properties` file to connect your application with MySQL:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
