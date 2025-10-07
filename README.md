🌍 Travel CRUD Application

A simple Travel Management Web Application built using Spring Boot, Thymeleaf, and MySQL.
This project allows users to add, view, update, and delete travel destinations — demonstrating the core CRUD (Create, Read, Update, Delete) operations using the Spring MVC architecture.

🚀 Features

1.✈️ Add new travel destinations

2.🗺️ View all destinations in a tabular format

3.📝 Update existing destination details

4.🗑️ Delete unwanted travel entries

5.💾 Data stored persistently in a MySQL database

🧩 Tech Stack
Layer	Technology Used
Frontend - Thymeleaf, HTML, CSS
Backend -	Spring Boot, Spring MVC
Database -	MySQL
ORM	 -Spring Data JPA, Hibernate
Build Tool - Maven
Server - Embedded Tomcat


⚙️ Project Structure
TravelCRUD/
│
├── src/main/java/com/example/travelcrud/
│   ├── controller/TravelController.java
│   ├── entity/Travel.java
│   ├── repository/TravelRepository.java
│   ├── service/TravelService.java
│   └── TravelCrudApplication.java
│
├── src/main/resources/
│   ├── templates/
│   │   ├── add.html
│   │   ├── fetch.html
│   │   ├── update.html
│   │   └── index.html
│   └── application.properties
│
└── pom.xml

🧠 How It Works

1.The Controller handles all HTTP requests (Add, View, Update, Delete).

2.The Service layer contains business logic for CRUD operations.

3.The Repository layer uses Spring Data JPA to interact with MySQL.

4.Thymeleaf templates dynamically display and update travel data.
