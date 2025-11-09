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

