Here is the complete `README.md` file for your `FileHider` project:

```markdown
# FileHider

FileHider is a Java application designed to securely hide and unhide files using a MySQL database. The application allows users to manage their hidden files with functionality for hiding, unhiding, and viewing hidden files. It uses Java, Maven, and the SunMail library for sending OTPs.

## Features

- **Hide Files:** Allows users to hide files by storing their paths and content in a database.
- **Unhide Files:** Retrieves and restores hidden files from the database.
- **User Management:** Users can sign up and log in with OTP verification.
- **Database Integration:** Uses MySQL for storing user and file information.
- **Email Integration:** Sends OTPs using the SunMail library for email communication.

## Technologies Used

- **Java**: Programming language for the application.
- **Maven**: Build tool for managing project dependencies and building the application.
- **SunMail (JavaMail)**: Library for sending OTPs via email.
- **MySQL**: Database for storing user and file data.

## Setup and Installation

1. **Clone the Repository:**

   ```bash
   git clone https://github.com/RockingChauhan/FileHider.git
   ```

2. **Navigate to the Project Directory:**

   ```bash
   cd FileHider
   ```

3. **Install Dependencies:**

   Ensure you have Maven installed. Run the following command to install project dependencies:

   ```bash
   mvn install
   ```

4. **Configure Database:**

   - Create a MySQL database named `fileHider`.
   - Import the schema and tables required for the project (you may need to refer to the project’s SQL scripts or documentation if available).

5. **Update Email Configuration:**

   - Open the `SendOTPService.java` file and update the `from` email address and password for sending OTPs.
   - Ensure the email account used allows access from less secure apps or use an app-specific password.

6. **Run the Application:**

   Use the following Maven command to run the application:

   ```bash
   mvn exec:java -Dexec.mainClass="org.example.Main"
   ```

## Usage

1. **Launch the Application:**
   - The application will display a welcome screen where you can choose to log in or sign up.

2. **Log In or Sign Up:**
   - Sign up with a new email and name.
   - Log in with an existing email and verify using the OTP sent to your email.

3. **Manage Files:**
   - Use the provided options to hide, unhide, or view hidden files.

## Contact

For any questions or support, please contact:

- **Name:** Sudhanshu Chauhan
- **Email:** [sudhanshuchauhan.dev@gmail.com](mailto:sudhanshuchauhan.dev@gmail.com)

---

Feel free to contribute or raise issues via the GitHub repository. Thank you for using FileHider!
```

You can copy and paste this content into a `README.md` file in your project’s root directory. Adjust any specific details as needed based on your project requirements.
