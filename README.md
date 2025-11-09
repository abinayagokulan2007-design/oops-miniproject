# 🏫 SCHOOL TIMETABLE MANAGEMENT SYSTEM

🧠 **INTRODUCTION**  
The **School Timetable Management System** is a Java-based desktop application that automates and simplifies the process of managing school timetables.  
It allows administrators and teachers to schedule classes, manage subjects, and view timetables efficiently.  
The project is implemented using **Java OOP concepts**, **Exception Handling**, **Generics**, **Multithreading**, **Networking**, **JDBC**, and **GUI (Swing)** for a complete end-to-end demonstration of Java programming paradigms.

---

## ⚙️ TECHNOLOGIES USED
| Component | Technology |
|------------|-------------|
| **Programming Language** | Java |
| **GUI Framework** | Java Swing |
| **Database** | MySQL |
| **Connectivity** | JDBC |
| **Core Concepts Applied** | OOP, Exception Handling, Multithreading, Networking, Generics |

---

## 🧩 MODULES DESCRIPTION

| **Module** | **Description** |
|-------------|-----------------|
| **1. Core OOP Classes** | Implements main entities such as `Person`, `Teacher`, and `Student` using inheritance and polymorphism. |
| **2. Exception Handling & Scheduling** | Manages timetable slots and handles scheduling conflicts with custom exceptions. |
| **3. Generics & Multithreading** | Uses generic classes for timetable storage and threads for automated scheduling. |
| **4. Networking & JDBC** | Simulates client-server communication and connects to a MySQL database for persistent timetable storage. |
| **5. GUI Interface** | Provides a Swing-based graphical interface for managing and displaying timetables interactively. |

---

## 📂 PROJECT STRUCTURE
```
SchoolTimetableManagement/
│
├── module1/      → Core OOP classes  
│   ├── Person.java  
│   ├── Teacher.java  
│   ├── Student.java  
│   └── Module1Test.java  
│
├── module2/      → Exception handling & data organization  
│   ├── Schedulable.java  
│   ├── TimetableManager.java  
│   ├── TimetableException.java  
│   └── Module2Test.java  
│
├── module3/      → Generics and Multithreading  
│   ├── Timetable.java  
│   ├── TimetableTask.java  
│   └── Module3Test.java  
│
├── module4/      → Networking and JDBC  
│   ├── TimetableServer.java  
│   ├── TimetableClient.java  
│   ├── DatabaseHandler.java  
│   └── Module4Test.java  
│
├── module5/      → GUI (Swing/JavaFX)  
│   └── TimetableUI.java  
│
└── MainApp.java   → Entry point that ties everything together
```

---

## 🗃️ DATABASE STRUCTURE

**Database Name:** `schooltimetabledb`  
**Table Name:** `timetable`

| **Column Name** | **Data Type** | **Description** |
|------------------|----------------|----------------|
| `id` | INT (AUTO_INCREMENT) | Unique ID for each timetable entry |
| `teacher_name` | VARCHAR(50) | Name of the teacher |
| `subject` | VARCHAR(50) | Subject being taught |
| `day` | VARCHAR(20) | Day of the class |
| `time_slot` | VARCHAR(20) | Scheduled time (e.g., Monday 9AM) |

**Sample Data:**

| ID | Teacher | Subject | Day | Time Slot |
|----|----------|----------|-----|------------|
| 1 | Ravi | Maths | Monday | 9:00 AM |
| 2 | Priya | Science | Tuesday | 10:00 AM |
| 3 | Karthik | English | Wednesday | 11:00 AM |

---

## 💻 HOW TO RUN THE PROJECT

1. **Install Java JDK** and **MySQL Server**  
2. Open **MySQL Workbench** and execute the following:
   ```sql
   CREATE DATABASE schooltimetabledb;
   USE schooltimetabledb;

   CREATE TABLE timetable (
       id INT AUTO_INCREMENT PRIMARY KEY,
       teacher_name VARCHAR(50),
       subject VARCHAR(50),
       day VARCHAR(20),
       time_slot VARCHAR(20)
   );
   ```
3. Open the project in **Eclipse IDE**  
4. Run `MainApp.java`  
5. Observe:
   - Console output showing OOP, Exception Handling, and Multithreading examples  
   - GUI window displaying timetable information  

---

## 📸 SAMPLE OUTPUT

**Console:**
```
=== School Timetable Management System ===
Teacher: Ravi (ID: T001)
Subject: Maths
Scheduled Slot: Monday 9AM
Auto-Scheduler Running...
Database Connected and Entry Inserted!
```

**GUI:**  
Displays an interactive timetable window with subject and teacher details.

---

## 👩‍💻 DEVELOPED BY
**Abinaya G**  
B.Tech – Artificial Intelligence and Data Science  
1st Year  

---

✅ *This project demonstrates integration of all key Java concepts into a single functional system.*
