## How to Run the Application

### Prerequisites
- Java JDK 17 or 21 installed
- Maven installed (or use your IDE's built-in Maven support)

### Option 1 – Using an IDE (recommended)
1. Open the project folder in IntelliJ IDEA, Eclipse, VS Code, etc.
2. Let the IDE import the Maven project (it will automatically download dependencies)
3. Locate and run the main class:  
   `com.example.RegistrationApp.RegistrationAppApplication`
4. Wait for the console to show:  
   `Started RegistrationApplication in X seconds`

### Option 2 – Using Terminal/Command Line
1. Open a terminal and navigate to the project root (where `pom.xml` is located):
   ```bash
   cd course-registration

2. Build and start the application: mvn clean spring-boot:run
3. 
Access the Application
Once the server starts (look for "Started RegistrationApplication" in the console), open your browser and go to:
http://localhost:8081/register

Fill in the form → Submit
View the confirmation page
Click "Register Another Student" to go back
