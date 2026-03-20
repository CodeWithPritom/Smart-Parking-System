# Smart Parking System - UML Architecture

Welcome to the UML documentation of our **Smart Parking System** project! 

In this section, we have documented the complete system architecture using a Class Diagram. We followed standard Object-Oriented Programming (OOP) principles like **Inheritance, Abstraction, Polymorphism, and Encapsulation** to design this system.

Below is a detailed breakdown of the relationships, multiplicities, and class structures used in our UML diagram.

---

## UML Relationship Guide

To make the class diagram easy to understand, we followed standard UML notations. Here is a quick guide to the arrows and lines we used in our project:

| Relation | Line Style | Arrow Type | Example in Our Project |
| :--- | :--- | :--- | :--- |
| **Dependency** | Dashed | Open arrow (`-->`) | `ParkingGUI` depends on `ParkingManager`. |
| **Association** | Solid | Optional (`—>`) | `ParkingSlot` knowing about a `Vehicle`. |
| **Aggregation** | Solid + Hollow diamond (`◇—`) | No arrow | `ParkingManager` aggregating `ParkingSlot`s. |
| **Inheritance** | Solid | Triangle (`—▷`) | `Car` inheriting from `Vehicle`. |
| **Interface Implementation**| Dashed | Triangle (`--▷`) | `CarFeeCalculator` implementing `FeeCalculator`. |

---

## Core Components & OOP Principles

Here is how we designed the classes and their relationships:

### 1. Interfaces & Implementation (Strategy Pattern)
* **`<<Interface>> FeeCalculator`**: We created this interface to define the rules for fee calculation. 
* **Implementation (`--▷`)**: The classes `CarFeeCalculator` and `BikeFeeCalculator` implement this interface. This is shown using a **dashed line with a hollow triangle**. We did this so that if we want to add a `Bus` in the future, we can simply create a new calculator without modifying existing code.

### 2. Abstraction & Inheritance ("IS-A" Relationship)
* **`<<abstract>> Vehicle`**: We made `Vehicle` an abstract class because a "Vehicle" itself is a general concept; we only park specific types of vehicles (Car or Bike). It holds common properties like `# vehicleNumber` and `# entryTime` (protected attributes).
* **Inheritance (`—▷`)**: Both `Car` and `Bike` classes extend the `Vehicle` class. This is represented by a **solid line with a hollow triangle**.

### 3. Aggregation ("HAS-A" Relationship)
Aggregation represents a "weak" whole-part relationship. We used a **solid line with a hollow diamond (`◇`)** at the whole side.
* **`ParkingManager ◇— ParkingSlot`**: The manager holds a list (`ArrayList`) of parking slots.
* **`ParkingManager ◇— ParkingTicket`**: The manager holds active tickets in a `HashMap`. 
*(Note: It is aggregation and not composition because if the manager system resets, the physical parking slots still conceptually exist).*

### 4. Dependency ("USES" Relationship)
Dependency means one class relies on another class temporarily. We represented this with a **dashed line and an open arrow (`-->`)**.
* **`ParkingGUI --> ParkingManager`**: The User Interface directly depends on the Manager to perform actions like parking or exiting a vehicle.
* **`ParkingSlot --> Vehicle`**: A slot needs to know which vehicle is parked inside it.

---

## Multiplicity Explanation

In our diagram, you will notice numbers like `1`, `0..1`, and `*`. Here is what they mean in the context of our logic:

* **`1` (Exactly One)**: 
  * A `ParkingSlot` can hold exactly `1` vehicle at a time.
  * There is `1` `ParkingManager` handling the system.
* **`0..1` (Zero or One)**: 
  * A `ParkingSlot` might be empty (`0`) or contain exactly one vehicle (`1`). Hence, the multiplicity from Slot to Vehicle is `0..1`.
* **`*` (Many / Multiple)**: 
  * `1` `ParkingManager` manages `*` (many) `ParkingSlot`s.
  * `1` `ParkingManager` can issue `*` (many) `ParkingTicket`s.

---

## Why We Designed It This Way (Developer Notes)

As students, we wanted to ensure our code is scalable and follows good practices. 
1. We used **Protected modifiers (`#`)** in the abstract `Vehicle` class so child classes can access them securely.
2. We separated the **GUI (`ParkingGUI`)** from the **Core Logic (`ParkingManager`)** to follow the Single Responsibility Principle. 
3. We used a **HashMap** for tickets (`activeTickets`) so that searching for a vehicle during exit operations takes **O(1)** time complexity.

We believe this UML architecture provides a robust foundation for our Smart Parking System!
