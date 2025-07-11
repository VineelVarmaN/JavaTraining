package javalearning.myTraining.day1.OOPs.methodOverriding;

/**
 * 	• Polymorphism: The same method can behave differently depending on the object that calls this method.
 * 	• Types of polymorphism
 * 		○ Compile time polymorphism - Method overloading
 * 		○ Run time polymorphism - Method overriding
 * 	• Method Overriding: A child class can redefine a method of its parent class.
 * 	• Method Overloading: We can define multiple methods with the same name but different parameters.
 * 	for overloading java will decide which method to execute at compile time
 *
 * Imagine an e-commerce platform where users make payments.
 * - Overloading: Payment method can accept card, UPI, or wallet payments.
 * - Overriding: Different payment gateways process transactions differently.
 */

// Payment is a super class, which provides payment functionality
class Payment {
    // Overloading: Same method name, different parameters
    void pay(int amount) {
        System.out.println("Payment of $" + amount + " completed.");
    }

    void pay(String method, int amount) {
        System.out.println("Payment of $" + amount + " using " + method + " completed.");
    }
}

// Paypal inherites payment. paypal gets access to payment methods
class PayPal extends Payment {
    //here we are redifning the behaviour of method from parent class
    @Override
    void pay(String method, int amount) {
        System.out.println("Processing $" + amount + " via "+method+" ...");
    }
}

public class PaymentDetails {
    public static void main(String[] args) {
        //created object for parent reference and parent object
        Payment p1 = new Payment();
        p1.pay(500);                      // Calls overloaded method
        p1.pay("Credit Card", 1200);      // Calls overloaded method

        //created object for parent reference and child object
        Payment p2 = new PayPal();
        p2.pay("PayPal", 800);            // Calls overridden method
    }
}
