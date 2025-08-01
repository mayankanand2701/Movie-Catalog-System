# 🎬 Movie Catalog System

A simple RESTful CRUD application built using **Spring Boot**, **Java 17+**, **H2 Database**, and **Swagger UI**. This project serves as a learning tool to understand how to create, read, update, and delete resources in a Spring Boot application.

---

## 🛠 Tech Stack

- **Java 17**
- **Spring Boot**
- **Spring Web**
- **Spring Data JPA**
- **H2 In-Memory Database**
- **Swagger UI (Springfox or springdoc-openapi)**


## 🚀 Features

- Add new movies to the catalog
- View all movies or by ID
- Update movie details (full or partial)
- Delete movies from the catalog
- In-memory persistence using H2 database
- Interactive API documentation using Swagger

## 📁 Endpoints Overview

| Method | Endpoint | Description |
|--------|----------|-------------|
| `POST` | `/api/inputMovies` | Create a new movie |
| `GET` | `/api/getAllMovies` | Retrieve all movies |
| `GET` | `/api/getMovieById/{id}` | Get movie by ID |
| `PUT` | `/api/fullUpdateMovie/{id}` | Full update of movie |
| `PATCH` | `/api/partialUpdateMovie/{id}` | Partial update of movie (e.g. rating only) |
| `DELETE` | `/api/deleteMovieById/{id}` | Delete a movie |


## 🧪 H2 Database Console

- Access H2 console at: `http://localhost:8080/h2-console`
- JDBC URL: `jdbc:h2:mem:testdb`
- Username: `sa`
- Password: `password`

## 📓 Swagger API
To view your endpoints visit this on your browser : 
``` http://localhost:8080/swagger-ui/index.html ``` 

## 🎯 Learning Outcomes

- How to build RESTful endpoints in Spring Boot
- How to perform CRUD operations using Spring Data JPA
- How to use in-memory databases (H2) for testing
- How to document APIs using Swagger UI

## 📜 License

This project is licensed under the MIT License.

