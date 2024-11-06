# E-commerce Order Management System

This is a simple E-commerce Order Management System implemented in Java, using core Object-Oriented Programming (OOP) principles. This project demonstrates the use of the four pillars of OOP (Encapsulation, Inheritance, Polymorphism, and Abstraction) through separate classes for Admin, Customer, Product, and User functionality. It allows the admin to manage products and customers to view and purchase items.

## Table of Contents
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
- [Setup Instructions](#setup-instructions)
- [Usage](#usage)
- [OOP Concepts Used](#oop-concepts-used)
- [Output](#output)


## Features
- **Admin and Customer Roles**: Admins can add, view, and manage products, while customers can view and purchase products.
- **Product Management**: The admin can add new products with an ID, name, and price.
- **Interactive Purchase System**: Customers can choose items to purchase and select from multiple payment methods.
- **Role-Based Access**: Only users with admin credentials can access the admin menu for managing products.

## Technologies Used
- **Java**: Core language for implementing object-oriented principles.
- **JDK**: Tested on JDK 11 and higher.

## Project Structure
- `Admin.java`: Contains the functionalities for admin roles, including product management.
- `Customer.java`: Defines the functionalities for customer interactions and purchasing items.
- `Product.java`: Manages product details such as ID, name, and price.
- `User.java`: Provides a base class for Admin and Customer with shared attributes and methods.

## Setup Instructions
1. Install JDK 11 or higher.
2. Clone this repository.
3. Open the project in your preferred Java IDE (e.g., IntelliJ, Eclipse).
4. Compile and run the project.

## Usage
1. Run the main class file.
2. Use the admin credentials to access the product management menu.
3. Customers can view and purchase items from the product list.

## OOP Concepts Used
- **Encapsulation**: Encapsulates product details and user functionalities within respective classes.
- **Inheritance**: Inherits common properties in the User class for both Admin and Customer.
- **Polymorphism**: Uses method overloading/overriding for different user roles.
- **Abstraction**: Abstracts shared behavior and properties in the User class.

## Output
![E-commerce output - 1](https://drive.google.com/file/d/14j7ENthyrsrISRN-KGO8gGWyWrD8kEQt/view?usp=sharing)
