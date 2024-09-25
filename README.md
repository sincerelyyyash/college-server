
# College Server

This project is a Spring Boot application that serves as a backend for managing colleges and courses. 

## Prerequisites

Before you begin, ensure you have the following installed:

- [Java JDK 11 or later](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Maven](https://maven.apache.org/install.html)
- [MySQL Server](https://dev.mysql.com/downloads/mysql/)
- [MySQL Workbench](https://www.mysql.com/products/workbench/) (optional, for database management)

## Setting Up MySQL Database

1. **Start MySQL Server:**
   - On macOS, you can start MySQL using Homebrew with the command:
     ```bash
     brew services start mysql
     ```
   - On Windows, you can start MySQL from the Services panel or use the command prompt:
     ```bash
     net start mysql
     ```

2. **Log in to MySQL:**
   Open a terminal or command prompt and enter:
   ```bash
   mysql -u root -p
   ```
   Enter your MySQL root password when prompted.

3. **Create a Database:**
   Create a new database for your application. You can name it `college_db`:
   ```sql
   CREATE DATABASE college_db;
   ```

4. **Create a User (optional):**
   You can create a new user for your application:
   ```sql
   CREATE USER 'college_user'@'localhost' IDENTIFIED BY 'your_password';
   GRANT ALL PRIVILEGES ON college_db.* TO 'college_user'@'localhost';
   FLUSH PRIVILEGES;
   ```

5. **Exit MySQL:**
   Exit the MySQL prompt by typing:
   ```sql
   EXIT;
   ```

## Running the Server Locally

1. **Clone the Repository:**
   Clone this repository to your local machine using:
   ```bash
   git clone https://github.com/sincerelyyyash/college-server.git
   ```
   Replace `your_username` with your actual GitHub username.

2. **Navigate to the Project Directory:**
   ```bash
   cd college-server
   ```

3. **Configure the Application Properties:**
   Open the `src/main/resources/application.properties` file and update the database connection details:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/college_db
   spring.datasource.username=college_user
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   ```
   Make sure to replace `your_password` with the password you set for `college_user`.

4. **Build the Project:**
   Run the following command to build the project using Maven:
   ```bash
   mvn clean install
   ```

5. **Run the Server:**
   Start the application with the following command:
   ```bash
   mvn spring-boot:run
   ```

6. **Access the Application:**
   Once the application is running, you can access it at:
   ```
   http://localhost:8080
   ```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contributing

Contributions are welcome! Please create a pull request for any enhancements or bug fixes.
