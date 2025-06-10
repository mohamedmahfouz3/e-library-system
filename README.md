# e-Library System for Benha Technical University

## Overview
The e-Library System is designed to facilitate the management of books, authors, categories, and users at Benha Technical University. This application provides a user-friendly interface for students and staff to access library resources efficiently.

## Features
- User registration and login
- Management of books, including adding, updating, and deleting book information
- Categorization of books for easy navigation
- Author management for tracking book authors
- Role-based access control for different types of users (e.g., registered users, managers)

## Project Structure
```
e-library-system
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── btu
│   │   │           └── elibrary
│   │   │               ├── models
│   │   │               │   ├── User.java
│   │   │               │   ├── Book.java
│   │   │               │   ├── Category.java
│   │   │               │   └── Author.java
│   │   │               ├── App.java
│   │   │               └── utils
│   │   │                   └── Constants.java
│   │   └── resources
│   │       └── application.properties
│   └── test
│       └── java
│           └── com
│               └── btu
│                   └── elibrary
│                       └── AppTest.java
├── pom.xml
└── README.md
```

## Setup Instructions
1. Clone the repository to your local machine.
2. Navigate to the project directory.
3. Ensure you have Maven installed on your machine.
4. Run `mvn clean install` to build the project.
5. Configure the `application.properties` file with your database connection settings.
6. Run the application using `mvn spring-boot:run` or your preferred method.

## Usage
- Access the application through the designated URL after running the application.
- Follow the on-screen instructions for user registration and book management.

## Contributing
Contributions are welcome! Please submit a pull request or open an issue for any enhancements or bug fixes.

## License
This project is licensed under the MIT License. See the LICENSE file for more details.