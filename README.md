# Restaurant Management System

This repository contains a Java-based Restaurant Management System, designed to simulate and manage the core functionalities of a restaurant, such as menu management, order processing, and billing. The project is structured with each class in a separate file, all located within the `src` directory for modularity and clarity.

## Table of Contents
- [Installation](#installation)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [Features](#features)
- [Contributing](#contributing)
- [License](#license)

## Installation

To set up and run this project locally, follow these steps:

1. **Clone the repository**:
    ```sh
    git clone https://github.com/your-username/restaurant-management-system.git
    cd restaurant-management-system
    ```

2. **Compile the Java files**:
    Navigate to the `src` directory:
    ```sh
    cd src
    ```
    Compile all the Java files:
    ```sh
    javac *.java
    ```

3. **Run the Application**:
    After compiling, run the main class:
    ```sh
    java restaurant_management_system
    ```

## Usage

After running the application, it will allow you to simulate various restaurant operations:

- Set the restaurant's name and location.
- Add dishes and drinks to the menu.
- Place customer orders.
- Generate bills with different billing strategies (regular and discounted).

### Example Commands

- **Set Restaurant Information**:
    ```java
    Restaurant r = new Restaurant();
    r.setNameLocation("ABC Hotel", "DCE Colony");
    System.out.println(r.getNameLocation());
    ```

- **Add Menu Items**:
    ```java
    Menu menu = new Menu();
    menu.addDish("Pasta");
    menu.addDish("Pizza");
    menu.addDrink("Coke");
    menu.addDrink("Water");
    ```

- **Place an Order**:
    ```java
    Order o = new Order();
    o.addItem(menu.getDish("Pasta"));
    o.addItem(menu.getDrink("Coke"));
    o.printOrderDetails();
    ```

- **Generate a Bill**:
    ```java
    Bill b = new Bill();
    b.setBillingStrategy(new RegularBilling());
    System.out.println("Total (Regular Billing): $" + b.generateBill(o));

    b.setBillingStrategy(new DiscountedBilling());
    System.out.println("Total (Discounted Billing): $" + b.generateBill(o));
    ```
## Project Structure

```plaintext
restaurant-management-system/
│
├── src/
│   ├── Restaurant.java       # Manages restaurant information
│   ├── Menu.java             # Manages the menu (dishes and drinks)
│   ├── Order.java            # Handles customer orders
│   ├── Item.java             # Abstract class for menu items
│   ├── Dish.java             # Represents a dish on the menu
│   ├── Drink.java            # Represents a drink on the menu
│   ├── BillingStrategy.java  # Interface for billing strategies
│   ├── RegularBilling.java   # Implements regular billing strategy
│   ├── DiscountedBilling.java# Implements discounted billing strategy
│   └── Bill.java             # Handles billing process


