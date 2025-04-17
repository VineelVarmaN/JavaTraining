package javalearning.myTraining.day1.OOPs.abstraction;

/**
 * 	• Abstraction is an OOP principle that hides implementation details and only shows essential features.
 * 	• It helps simplify complex systems by exposing only necessary functionalities to the user.
 *
 * 	Real-World Example: ATM Machine
 * 	Imagine you're using an ATM machine:
 * 	- You only interact with essential functions:
 * 	✔ Insert Card
 * 	✔ Enter PIN
 * 	✔ Withdraw Money
 * 	✔ Check Balance
 * 	- You don’t see internal implementation (like database operations, security protocols, cash dispensing logic).
 * 	- The complex details remain hidden, while you only use a simple interface.
 *
 * 	• This is abstraction → You interact only with necessary functionalities while implementation remains hidden.
 *
 * 	• How to Implement Abstraction in Java?
 * 	We use abstract classes and interfaces to achieve abstraction in Java.
 */

//ATM is an abstract class → It cannot be instantiated directly.
abstract class ATM {
    // Abstract method (no implementation)
    abstract void withdrawMoney(double amount);

    // Concrete method (implementation provided)
    void checkBalance() {
        System.out.println("Checking account balance...");
    }
}

//BankATM inherits from ATM and provides implementation for withdrawMoney().
class BankATM extends ATM {
    private double balance;

    // Constructor
    public BankATM(double balance) {
        this.balance = balance;
    }

    // Implementing the abstract method
    //The complex logic of withdrawal is defined inside the subclass.
    @Override
    void withdrawMoney(double amount) {
        if (amount > 0 && amount <= balance) { //initial balance amount is 5000
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
        System.out.println("Current balance: $" + balance);
    }
}
public class ATMUser {
    public static void main(String[] args) {
        ATM myATM = new BankATM(5000); // Create object with parent reference for child subclass

        myATM.checkBalance();  // Calling concrete method
        myATM.withdrawMoney(2000); // Calling overridden method
    }
}
