# Low-Level Design (LLD) Patterns

Welcome to my **Low-Level Design (LLD)** repository! This repository serves as a collection of key software design patterns, each implemented with practical use cases to strengthen understanding and application.

## About the Repository

Design patterns are fundamental building blocks in software design, providing reusable solutions for common challenges. This repository contains my hands-on implementations of various design patterns across three major categories:

- **Behavioral Design Patterns**
- **Creational Design Patterns**
- **Structural Design Patterns**

Each pattern is implemented with a specific use case, showcasing its applicability in real-world scenarios.

---

## 📂 Repository Structure

The repository is neatly organized into three main categories of design patterns:

### 1. **Behavioral Design Patterns**
   - Focuses on communication between objects.
   - Patterns Implemented:
     - **Chain of Responsibility**: Decouples sender and receiver by passing requests along a chain of handlers.
       - [`Main.java`](BehavioralDesignPatterns/Chain%20of%20Responsibility/Main.java)
     - **Command Pattern**: Encapsulates a request as an object.
     - **Observer Pattern**: Establishes a dependency between objects so that changes in one object are reflected in others.
     - **Strategy Design Pattern**: Defines a family of algorithms and makes them interchangeable.
       - Use Cases:
         - [`PaymentProcess`](BehavioralDesignPatterns/Strategy%20Design%20Pattern/PaymentProcess)
         - [`SortingAlgo`](BehavioralDesignPatterns/Strategy%20Design%20Pattern/SortingAlgo)
         - [`VehicleDesign`](BehavioralDesignPatterns/Strategy%20Design%20Pattern/VehicleDesign)

### 2. **Creational Design Patterns**
   - Focuses on object creation mechanisms.
   - Patterns Implemented:
     - **Builder**: Separates the construction of a complex object from its representation.
       - [`Main.java`](CreationalDesignPatterns/Builder/Main.java)
       - [`House.java`](CreationalDesignPatterns/Builder/House.java)
     - **Prototype**: Creates new objects by cloning an existing object.
     - **Singleton**: Ensures a class has only one instance and provides a global point of access to it.
       - Implementation Methods:
         - [`BillPugh`](CreationalDesignPatterns/Singleton%20%5C%20Implementation%20Methods/BillPugh)
         - [`DoubleCheckedLocking`](CreationalDesignPatterns/Singleton%20%5C%20Implementation%20Methods/DoubleCheckedLocking)
         - [`EagerInitialization`](CreationalDesignPatterns/Singleton%20%5C%20Implementation%20Methods/EagerInitialization)
         - [`EnumInstance`](CreationalDesignPatterns/Singleton%20%5C%20Implementation%20Methods/EnumInstance)
         - [`LazyInitialization`](CreationalDesignPatterns/Singleton%20%5C%20Implementation%20Methods/LazyInitialization)
         - [`LazyThreadSafe`](CreationalDesignPatterns/Singleton%20%5C%20Implementation%20Methods/LazyThreadSafe)

### 3. **Structural Design Patterns**
   - Focuses on the composition of classes and objects.
   - Patterns Implemented:
     - **Adapter**: Bridges the gap between incompatible interfaces.
     - **Decorator**: Dynamically adds behavior to an object.
     - **Proxy**: Provides a surrogate or placeholder for another object.
     - **Facade**: Simplifies complex subsystems by providing a unified interface.
       - [`ShoppingFacade`](StructuralDesignPatterns/ShoppingFacade)

---

## 🛠️ How to Use the Repository

1. Clone this repository to your local machine:
   ```bash
   git clone https://github.com/jayitasaha40/LLD.git

## ✨ Key Features

- **Practical Use Cases**: Each pattern is implemented with a relatable use case to bridge the gap between theory and practice.
- **Structured Approach**: The code is modular and organized, making it beginner-friendly.
- **In-depth Exploration**: Covers multiple implementation approaches for complex patterns like Singleton.

---

## 🌱 Future Enhancements

- Add more design patterns (e.g., Mediator, Flyweight, etc.).
- Incorporate UML diagrams for better understanding.
- Include detailed documentation and links to resources for each pattern.

---

## 📌 References

- *Design Patterns: Elements of Reusable Object-Oriented Software* by Erich Gamma et al.
- Online resources and documentation from reputable software engineering platforms.

---

## 💡 Contributions

Feel free to fork this repository, experiment, and create pull requests. Let's learn and grow together!

---

## 📫 Contact

If you have any questions or suggestions, feel free to reach out to me at https://www.linkedin.com/in/jayita-saha-sde

