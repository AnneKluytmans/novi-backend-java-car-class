# Car Class – NOVI Backend Java Assignment

## About the Project

This repository contains my solution to the **Car Database** assignment from the Backend Java module at [Novi University](https://www.novi.nl).

The goal of this project is to practice working with **Java classes**, **constructors**, **objects**, and **instance methods**. By creating multiple car instances from a custom `Car` class, this assignment demonstrates how to model real-world entities in code using object-oriented principles.

---

## Table of Contents

- [Tech Stack](#tech-stack)
- [Key Features](#key-features)
- [How to Run](#how-to-run)
- [Credits](#credits)
- [License](#license)

---

## Tech Stack

- **Java 17**+
- **IntelliJ IDEA**
- **JUnit** for testing
- **Maven** for dependencies, build and execution

---

## Key Features

- `Car` class
- Method that prints a custom sentence like:  
  _"This [brand] [model] is [color]."_
- Multiple car instances created and tested
- `Driver` class with name and license number as a field inside `Car`

---

## How to Run

1. Open the project in your IDE (IntelliJ IDEA)
2. Locate the `main` method and click the green play button → select **Run 'Main'** or use the terminal:
  ```bash
  ./mvnw clean compile exec:java
  ```
3. To run tests: open `MainTest.java` in `src/test/java`, and click the green play button → **Run 'MainTest'** or use the terminal:
  ```bash
  ./mvnw test
  ```

## Credits
> "This assignment was developed as part of the Backend Java module in the NOVI Software Development program. All instructions, logic, and structure are part of the official coursework."

## License
> "This repository is intended for educational purposes only. You are welcome to use the code for learning, but not for commercial use."