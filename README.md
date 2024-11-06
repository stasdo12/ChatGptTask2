
```markdown
# Inventory Management System - Spring Boot Application

## Application Description

This is a Spring Boot application that manages a simple inventory system for a store. The system allows users to:
- View a list of available products.
- Add new products to the inventory.
- Update existing products.
Each product has the following attributes:
- Name
- Description
- Price
- Quantity

The product information is persisted in a MySQL database using Hibernate.

## Features
- Simple CRUD operations for product management.
- Hibernate integration for database persistence.
- RESTful API endpoints to interact with the system.

## Tech Stack
- Java 17
- Spring Boot
- Hibernate
- MySQL
- JUnit 5 for unit testing
- Mockito for mocking dependencies in tests

## How to Run the Application

### Prerequisites
- Java 17
- MySQL database
- Maven

### Steps to Run
1. Clone the repository:

   ```
2. Navigate to the project directory:
  
   cd inventory-system
   ```
3. Set up your MySQL database:
    - Create a database named `inventory_db`.
    - Configure your database credentials in `src/main/resources/application.properties`:
      ```properties
      spring.datasource.url=jdbc:mysql://localhost:3306/inventory_db
      spring.datasource.username=your-username
      spring.datasource.password=your-password
      spring.jpa.hibernate.ddl-auto=update
      ```
4. Build and run the application:

   mvn spring-boot:run
   ```
   The application will run on `http://localhost:8080`.

## Unit Tests

### Running Tests
To run the unit tests, execute the following Maven command:

mvn test
```
Test coverage is above 80%, ensuring the application functionality is thoroughly tested.

## Quality Checks
- **Code Coverage**: > 80%
- **Code Complexity**: Code is structured and modular, with low cyclomatic complexity.
- **Checkstyle**: Code adheres to best practices and style guidelines.

## ChatGPT Feedback 
- **Was it easy to complete the task using AI?**  
  Yes, ChatGPT provided clear instructions and guidance to complete the task step-by-step. It helped generate the necessary code and configurations with ease.

- **How long did the task take you to complete?**  
  Approximately 40 minutes.

- **Was the code ready to run after generation? What did you have to change to make it usable?**  
  The generated code was mostly ready to run. The only required changes were related to configuring the MySQL database credentials in the `application.properties` file.

- **Which challenges did you face during completion of the task?**  
  No major challenges. The task was straightforward, but ensuring that the Spring Boot configuration for MySQL was correct took some attention.

- **Which specific prompts you learned as a good practice to complete the task?**
    - Asking for clear specifications on how to configure the database connection and persist data.
    - Requesting unit tests after the code generation to ensure proper validation of the service logic.
    - Using `@ExtendWith(MockitoExtension.class)` and `@Mock` for unit testing with Spring Boot services.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
```


