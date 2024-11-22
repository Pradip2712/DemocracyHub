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


