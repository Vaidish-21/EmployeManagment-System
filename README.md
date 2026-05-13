# 👨‍💼 Employee Management System

A desktop-based **Employee Management System** built with **Java Swing** and **MySQL**. It provides a user-friendly GUI to manage employee records — add, view, update, and remove employees — with secure login authentication.

---

## 📸 Screenshots
## 📸 Screenshots

### 🏠 Title Screen
<img width="700" alt="Title Screen" src="https://github.com/user-attachments/assets/7114b9ab-cf44-4143-8525-17bd68e6de2a" />

---

### 🔐 Login Page
<img width="700" alt="Login Page" src="https://github.com/user-attachments/assets/003ca14e-1ee5-496b-95f3-094c246a468a" />

---

### 🖥️ Main Dashboard
<img width="700" alt="Main Dashboard" src="https://github.com/user-attachments/assets/932ec8af-006f-403d-9e46-bd8f87b4e8c3" />

---

### ➕ Add Employee
<img width="700" alt="Add Employee" src="https://github.com/user-attachments/assets/34b2f8de-bbdb-45bf-b815-735d324313d5" />

---

### 🔍 View Employee
<img width="700" alt="View Employee" src="https://github.com/user-attachments/assets/20f4e55a-a499-41d4-b342-5133ccc8e3dd" />

---

### 🗑️ Remove Employee
<img width="700" alt="Remove Employee" src="https://github.com/user-attachments/assets/d5b9fb27-4089-493b-9310-cc85b2a2a491" />




---

## ✨ Features

- 🔐 **Secure Login** — Username & password authentication via MySQL database
- ➕ **Add Employee** — Register new employees with full details (name, DOB, designation, salary, Aadhar, education, etc.)
- 👁️ **View Employees** — Browse all employee records in a searchable table with print support
- ✏️ **Update Employee** — Edit existing employee information
- ❌ **Remove Employee** — Delete employee records by Employee ID
- 🎨 **Splash Screen** — Animated intro screen on startup
- 🖼️ **Image-based UI** — Custom background images for a polished look

---

## 🛠️ Tech Stack

| Technology | Details |
|---|---|
| Language | Java (JDK 8+) |
| GUI Framework | Java Swing / AWT |
| Database | MySQL |
| JDBC Driver | MySQL Connector/J (`com.mysql.cj.jdbc.Driver`) |
| Libraries | `rs2xml.jar` (DbUtils), `JCalendar` (JDateChooser) |
| IDE | IntelliJ IDEA |

---

## 📁 Project Structure

```
employee management system/
├── src/
│   ├── employee/management/system/
│   │   ├── Splash.java          # Intro splash screen
│   │   ├── Login.java           # Login authentication
│   │   ├── Main_class.java      # Main dashboard
│   │   ├── AddEmployee.java     # Add new employee
│   │   ├── ViewEmployee.java    # View/search employees
│   │   ├── UpdateEmployee.java  # Update employee details
│   │   ├── RemoveEmployee.java  # Remove an employee
│   │   └── Conn.java            # Database connection helper
│   └── icons/                   # UI images and icons
└── out/                         # Compiled .class files
```

---

## ⚙️ Prerequisites

- Java JDK 8 or higher
- MySQL Server 8.0+
- IntelliJ IDEA (or any Java IDE)
- Required JAR files:
  - `mysql-connector-java-x.x.x.jar`
  - `rs2xml.jar`
  - `jcalendar-x.x.jar`

---

## 🗄️ Database Setup

1. Open MySQL and create the database:

```sql
CREATE DATABASE employeemanagement;
USE employeemanagement;
```

2. Create the **employee** table:

```sql
CREATE TABLE employee (
    name        VARCHAR(100),
    faname      VARCHAR(100),
    dob         VARCHAR(20),
    salary      VARCHAR(20),
    address     VARCHAR(200),
    phone       VARCHAR(15),
    email       VARCHAR(100),
    education   VARCHAR(50),
    designation VARCHAR(100),
    aadhar      VARCHAR(20),
    empID       VARCHAR(20) PRIMARY KEY
);
```

3. Create the **login** table and add credentials:

```sql
CREATE TABLE login (
    username VARCHAR(50),
    password VARCHAR(50)
);

INSERT INTO login VALUES ('admin', 'admin123');
```

---

## 🔧 Configuration

Update the database credentials in `Conn.java` to match your MySQL setup:

```java
connection = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/employeemanagement",
    "your_username",    // replace with your MySQL username
    "your_password"     // replace with your MySQL password
);
```

> ⚠️ **Note:** Never commit real credentials to GitHub. Consider using a config file or environment variables.

---

## 🚀 How to Run

1. **Clone the repository:**
   ```bash
   git clone https://github.com/your-username/employee-management-system.git
   ```

2. **Open in IntelliJ IDEA** (or your preferred Java IDE)

3. **Add the required JAR files** to the project's classpath:
   - Go to `File → Project Structure → Libraries` → Add the JARs

4. **Set up the database** using the SQL scripts above

5. **Update credentials** in `Conn.java`

6. **Run `Splash.java`** as the entry point

---

## 📋 Employee Fields

Each employee record contains:

| Field | Description |
|---|---|
| Employee ID | Auto-generated unique ID |
| Name | Full name |
| Father's Name | Father's full name |
| Date of Birth | DOB (via date picker) |
| Salary | Monthly salary |
| Address | Residential address |
| Phone | Contact number |
| Email | Email address |
| Education | Highest qualification |
| Designation | Job role/title |
| Aadhar Number | Government ID number |

---

## 🤝 Contributing

Contributions are welcome! Feel free to fork the repo and submit a pull request.

1. Fork the project
2. Create your feature branch (`git checkout -b feature/YourFeature`)
3. Commit your changes (`git commit -m 'Add YourFeature'`)
4. Push to the branch (`git push origin feature/YourFeature`)
5. Open a Pull Request

---

## 📄 License

This project is open-source and available under the [MIT License](LICENSE).

---

## 👤 Author

**Your Name**
- GitHub: [Vaidish-21](https://github.com/Vaidish-21)

---

> 💡 *Built as a Java Swing desktop project to demonstrate CRUD operations with MySQL database connectivity.*
