## **FileHider**

**A Secure File Hiding Application**

**Overview**

FileHider is a Java-based application designed to securely hide and unhide files using a MySQL database. It provides a user-friendly interface for managing hidden files, including the ability to hide, unhide, and view them. The application leverages robust security measures, such as OTP verification and database encryption, to protect sensitive information.

**Features**

* **File Hiding:** Users can hide files by storing their paths and content in a MySQL database.
* **File Unhiding:** Hidden files can be retrieved and restored from the database.
* **User Management:** Users can sign up and log in with OTP verification for added security.
* **Database Integration:** MySQL is used for storing user and file information.
* **Email Integration:** The SunMail library is employed to send OTPs via email for user authentication.

**Technologies Used**

* **Java:** The primary programming language for the application.
* **Maven:** A build tool for managing project dependencies and building the application.
* **SunMail (JavaMail):** A library for sending OTPs via email.
* **MySQL:** A database for storing user and file data.

**Getting Started**

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/your-username/FileHider
   ```
2. **Set Up Dependencies:**
   ```bash
   cd FileHider
   mvn clean install
   ```
3. **Configure Database:**
   Create a MySQL database and user with appropriate privileges. Update the database connection details in the application's configuration file.
4. **Run the Application:**
   ```bash
   java -jar target/FileHider-1.0.0-SNAPSHOT.jar
   ```

**Usage**

1. **Create an Account:** Sign up for a new account by providing your email address and password.
2. **Log In:** Enter your credentials to access the application.
3. **Hide Files:** Select files to hide and provide a password for encryption.
4. **Unhide Files:** Enter the correct password to retrieve and unhide your hidden files.

**Security**

* **OTP Verification:** A one-time password is sent to the user's email for added security during login.
* **Password Encryption:** Hidden files are encrypted using a strong algorithm to protect their content.
* **Database Security:** The MySQL database should be configured with appropriate security measures, such as strong passwords and access controls.

**Contributing**

Contributions to FileHider are welcome! Feel free to submit bug reports, feature requests, or code improvements through GitHub issues or pull requests.

