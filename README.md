# Clinic Management System (Java OOP)

This is a console-based clinic management system built in Java using object-oriented programming principles. It simulates a simple patient management workflow where patient records can be created, stored and retrieved through a menu-driven interface.

The project was designed to strengthen understanding of system design using classes, separation of logic and structured data handling.

## What this project does

The system allows basic management of patient records within a clinic setting. Users can add new patients, view all stored patients and search for a patient using a unique identifier.

It runs entirely in the terminal and uses an interactive menu system for user interaction.

## Key features

1. Add new patient records
2. View all registered patients
3. Search for patients using ID
4. Simple menu-driven interface

## Tech stack

- Java
- Object-Oriented Programming (OOP)
- ArrayList
- Scanner (user input handling)

## Project structure

The system is divided into clear components following OOP design principles:

*Patient class
Represents individual patient data such as ID and basic details.

*Service layer
Handles core logic such as adding, retrieving and searching patients.

*Main class
Controls program flow and user interaction through the terminal menu.

## How it works

Patient data is stored as objects inside an ArrayList. The system interacts with the user through a continuous menu loop.

Each action (add, view, search) triggers a method in the service layer, ensuring separation between logic and user interface.

This structure mimics how real backend systems organize responsibilities.

## What I learned

This project strengthened my understanding of object-oriented programming in real system design. I learned how to separate concerns using classes, manage collections of objects and structure applications in a scalable way.

It also improved my ability to think in terms of system architecture rather than just individual functions.

## Possible improvements

Add patient deletion and update functionality
Introduce file or database storage for persistence
Add authentication for system access
Improve error handling and input validation
Expand into a full desktop or web application

## Project summary

A Java-based clinic management system built using object-oriented programming. It demonstrates structured system design with patient management features including adding, viewing and searching records using a console interface.
