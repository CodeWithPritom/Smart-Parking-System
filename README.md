<div align="center">

# 🚗 Smart Parking System
**A Complete Object-Oriented Programming (OOP) Project in Java**

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![OOP](https://img.shields.io/badge/Architecture-OOP_Based-blue?style=for-the-badge)
![EWU](https://img.shields.io/badge/Academic-East_West_University-success?style=for-the-badge)

> A real-world simulated parking management system demonstrating clean architecture, OOP principles, and UML-based system modeling.

</div>

---

## 📚 Academic Information

This project was built as part of the **CSE110: Object Oriented Programming** course requirement.

- **Institution:** East West University (EWU)
- **Course Name:** CSE110 – Object Oriented Programming
- **Semester:** Spring 2026
- **Instructor/Faculty:** Sadia Nur Amin
- **Initial:** SDNA
- **Designation:** Senior Lecturer, Department of Computer Science & Engineering

### 👨‍💻 Team Members

| Name | Student ID | GitHub |
| :--- | :--- | :--- |
| **Arup Bhowmik Pritom** | `2025-2-60-330` | [@username](https://github.com/) |
| **Md. Montasirul Bin Abid** | `2025-2-60-323` |[@username](https://github.com/) |
| **Mehrab Morshed Marjan** | `2025-1-60-142` | [@Mehrab30-Mehrab](https://github.com/Mehrab30-Mehrab) |



---

## 🎯 Project Objective

The main goal of this project is to implement **Object-Oriented Programming (OOP) concepts** into a functional, real-world scenario. The system handles modular Java classes and object interactions to manage vehicle entry, slot allocation, ticket generation, and fee calculation.

---

## ⚙️ Core Features

- 🚘 **Vehicle Entry:** Registers incoming vehicles and automatically assigns the nearest available slot.
- 🅿️ **Slot Management:** Each slot holds exactly one vehicle and dynamically updates its occupancy status.
- 🎫 **Ticket Generation:** Generates a secure parking ticket containing entry time and vehicle details.
- ⏱ **Duration Tracking:** Accurately records entry and exit times to calculate total parked duration.
- 💰 **Dynamic Fee Calculation:** Uses the **Strategy Pattern** to apply different rates based on vehicle type (e.g., Car vs. Bike).
- 🚗 **Vehicle Exit:** Processes exit, calculates final fees, and frees up the parking slot.

---

## 🧩 Object-Oriented Design (OOD)

The system was architected using robust UML modeling before the coding phase. 

### 🧬 Applied OOP Concepts

| Concept | Implementation in Project |
| :--- | :--- |
| **Encapsulation** | Private fields with strict getter/setter access across all domain classes. |
| **Inheritance** | `Car` and `Bike` classes extend the abstract `Vehicle` class. |
| **Abstraction** | Core definitions hidden inside the `Vehicle` abstract class. |
| **Polymorphism** | Dynamic fee calculation implemented via the `FeeCalculator` interface. |
| **Interfaces** | Used for defining strategies (e.g., `FeeCalculator`). |
| **Aggregation** | `ParkingManager` aggregates and manages multiple `ParkingSlot` objects. |
| **Association** | 1-to-1 association between `ParkingSlot` and `Vehicle`. |

---

## 🏗 System Architecture

The project follows a layered architecture to ensure **modularity, maintainability, and scalability**:

```text
📦 Smart-Parking-System
 ┣ 📂 GUI Layer
 ┃ ┗ 📜 ParkingGUI (User Interface)
 ┣ 📂 Business Logic Layer
 ┃ ┗ 📜 ParkingManager (Core Controller)
 ┗ 📂 Domain Layer
   ┣ 📜 Vehicle (Abstract Base Class)
   ┣ 📜 Car & Bike (Concrete Implementations)
   ┣ 📜 ParkingSlot (State Manager)
   ┣ 📜 ParkingTicket (Session Data)
   ┗ 📜 FeeCalculator, CarFeeCalculator, BikeFeeCalculator (Strategy)
```

---
### 🛠 Technologies Used

- Language: Core Java (JDK 8+)
- Paradigm: Object-Oriented Programming (OOP)
- Design: UML System Design
- GUI Framework: Java Swing / JavaFX (Keep the one you used)

---
