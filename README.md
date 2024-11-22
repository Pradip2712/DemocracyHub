# Democracy Hub

This is a **Demoncracy Hub** that uses Java, Hibernate, and MySQL for storing and managing voter data. The system allows insertion, viewing, updating, and deletion of voter details, along with the ability to search and filter voters by criteria such as pin code, constituency, or city.

## Project Overview

The application tracks **Persons**, **Addresses**, and **Voting Cards**. A **Person** is associated with one **Address** and one **Voting Card**. The main operations supported are:

1. **Insert**: Add new records for person, address, and voting card.
2. **View**: View all records or filter by pin code, constituency, or city.
3. **Update**: Modify existing records.
4. **Delete**: Remove records based on the person's Adhar ID.

## Technologies Used

- **Java**: Programming language for the backend.
- **Hibernate ORM**: Framework for object-relational mapping.
- **MySQL**: Database management system for storing information.
- **Maven**: Build automation tool for dependency management.
- **JDBC**: Used for database interaction through Hibernate.

## Features

- Add new person records along with their address and voting card.
- View persons based on pin code, constituency, or city.
- Update existing person records.
- Delete person records based on Adhar ID.
- Simple menu-driven interface for interacting with the system.



## Key Concepts and Topics

### 1. **Java Programming**
   - **Core Java Concepts**:
     - Variables, Data Types, and Operators
     - Control Statements (if, switch, loops)
     - Methods (Functions)
     - Object-Oriented Programming (OOP) Principles:
       - Classes and Objects
       - Inheritance, Polymorphism, Abstraction, and Encapsulation
     - Exception Handling (try, catch, throws, etc.)
     - Collections Framework (List, Map, Set, etc.)
     - Input and Output (File I/O, Console I/O)
     - Lambda Expressions and Functional Interfaces

### 2. **Hibernate ORM (Object-Relational Mapping)**
   - **Hibernate Configuration**:
     - `hibernate.cfg.xml` configuration file
     - SessionFactory and Session management
     - Mapping Java classes to database tables (annotations or XML-based)
   - **Entity Classes**:
     - Using `@Entity`, `@Table`, and other annotations
   - **CRUD Operations**:
     - Create, Read, Update, and Delete operations using Hibernate
   - **HQL (Hibernate Query Language)**:
     - Writing and executing HQL queries
   - **Transactions**:
     - Managing transactions with Hibernate (commit, rollback)

### 3. **Database Management**
   - **Relational Database Concepts**:
     - Tables, Rows, and Columns
     - Primary Keys and Foreign Keys
   - **SQL (Structured Query Language)**:
     - Writing SQL queries (SELECT, INSERT, UPDATE, DELETE)
   - **Database Design**:
     - Normalization and Schema Design (tables for person, address, and voting information)
   - **Database Connectivity**:
     - JDBC (Java Database Connectivity) for establishing a connection between Java application and MySQL/PostgreSQL database

### 4. **Model-View-Controller (MVC) Architecture**
   - **Model Layer**:
     - Entity Classes (Person, Address, VotingCard, etc.)
   - **View Layer**:
     - Console-based user interface for interaction
   - **Controller Layer**:
     - Managing requests and responses, interacting with the model and view

### 5. **Maven**
   - **Dependency Management**:
     - Adding dependencies (Hibernate, MySQL JDBC, etc.)
   - **Build Lifecycle**:
     - Running `mvn install`, `mvn compile`, `mvn package`, and other commands for project builds

### 6. **User Input and Interaction**
   - **Console Input/Output**:
     - Using `Scanner` class for user inputs
     - Displaying results and status messages to the console

### 7. **Data Validation**
   - **Validating User Inputs**:
     - Ensuring correct format for fields such as Adhar ID, Voter ID, Pin Code, etc.
   - **Error Handling**:
     - Ensuring correct behavior with exception handling (e.g., for invalid input)

### 8. **JDBC (Java Database Connectivity)**
   - **Database Connection**:
     - Using `Connection`, `Statement`, and `ResultSet` for direct database interaction (when not using Hibernate)
   - **Database CRUD Operations**:
     - Executing SQL queries directly via JDBC for CRUD operations

### 9. **Logging and Debugging**
   - **Logging**:
     - Using `Log4j` or `SLF4J` for logging and debugging output
   - **Debugging Tools**:
     - Using IDE debugging features for error tracking

### 10. **Version Control (Git)**
   - **Git Basics**:
     - Version control using Git
     - Git commands (`git clone`, `git commit`, `git push`, etc.)
   - **GitHub or GitLab**:
     - Remote repository for source code management

### 11. **Application Deployment**
   - **Local Development Setup**:
     - Running the Java application locally on your machine
   - **Database Setup**:
     - Configuring the local MySQL/PostgreSQL database and connecting it with the application

### 12. **Unit Testing (Optional)**
   - **JUnit**:
     - Writing unit tests for validating individual methods or services
   - **Mockito**:
     - Mocking dependencies for isolated unit testing

### 13. **Data Modeling & Relationships**
   - **Entity Relationships**:
     - One-to-One, One-to-Many, Many-to-One relationships between entities (e.g., Person, Address, VotingCard)
   - **Mapping Collections in Hibernate**:
     - Using `@OneToMany` and `@ManyToOne` annotations for entity relationships

### 14. **Project Documentation**
   - **README.md**:
     - Documenting project setup, features, and usage instructions
   - **Commenting Code**:
     - Writing meaningful comments to explain code and logic

### 15. **Build and Deployment Tools**
   - **Maven Commands**:
     - Building and packaging the application using Maven
   - **IDE Integration**:
     - Using IntelliJ IDEA, Eclipse, or any other Java IDE for project development

### 16. **Database Transactions**
   - **Transaction Management**:
     - Using `session.beginTransaction()` and `session.getTransaction().commit()` in Hibernate
   - **Atomic Operations**:
     - Ensuring data integrity during insert, update, or delete operations

## Setup Instructions

### Prerequisites:
- Java 8 or higher
- Maven 3.x or higher
- MySQL or PostgreSQL Database
- Hibernate 5.x
- IDE: IntelliJ IDEA, Eclipse, or similar

### Steps to Run:
1. Clone the repository to your local machine.
2. Set up the database (MySQL/PostgreSQL) and configure the connection in `hibernate.cfg.xml`.
3. Run the project using Maven or your preferred IDE.
4. Follow the console prompts to interact with the Voting System.


## Project Structure

```plaintext
Democracy Hub/
│
├── src/
│   ├── com/pdp/utility/            # Utility class for setting up Hibernate session and configuration
│   ├── com/pdp/entity/             # Entity classes for Person, Address, and VotingCard
│   ├── com/pdp/dao/                # Data access object for interacting with the database
│   ├── com/pdp/service/            # Service layer for business logic
│   ├── com/pdp/controller/         # Controller layer for handling user requests
│   ├── com/pdp/client/             # Client application for interaction with the user
│
├── resources/
│   ├── hibernate.cfg.xml           # Hibernate configuration file for database connection
│
├── pom.xml                         # Maven configuration for dependencies and builds
└── README.md                       # Project documentation

