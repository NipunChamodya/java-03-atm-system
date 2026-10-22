# 🏦 Java 03: Secure ATM System

A fully interactive, command-line ATM application built in Java. This project combines password authentication with a continuous loop menu, allowing users to perform multiple banking transactions securely until they choose to log out.

## ✨ Features
* **Secure Login:** Requires a correct password (`1234`) to access the main ATM menu.
* **Interactive Menu:** Uses a continuous loop to let users perform multiple actions without restarting the program.
* **Cash Deposits & Withdrawals:** Calculates and updates the user's account balance in real-time.
* **Overdraft Protection:** Checks the balance and prevents users from withdrawing more money than they have.

## 🧠 Concepts Applied
* **Infinite Loops:** Used a `while` loop to keep the banking menu active.
* **Loop Control:** Used the `break` keyword to safely terminate the session when the user selects "Exit".
* **Nested Conditionals:** Placed `if/else` logic inside the loop to handle menu choices, and inside the withdrawal option to check for sufficient funds.
* **String Comparison:** Used `.equals()` for secure password validation.

## 🚀 How to Run
1. Clone the repository and open it in your Java IDE (e.g., IntelliJ IDEA).
2. Run the `Main.java` file.
3. Enter the default password: `1234`.
4. Follow the on-screen menu to check balance, deposit, or withdraw funds!