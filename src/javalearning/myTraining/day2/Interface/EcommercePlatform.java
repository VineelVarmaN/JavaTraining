package javalearning.myTraining.day2.Interface;

/**
 * 	An interface in Java is a blueprint of a class. It contains abstract methods without a body.
 * 	When a class implements an interface, it will get access to methods and can override the methods according to business logic of the class.
 * 	Example: Payment Gateway is interface which provides services like processPayment and refundPayment.
 * 	different type of payment methods are classes which implements interface and uses those services
 * 	Why Use Interfaces?
 * 	Interfaces provide: Multiple Inheritance: Since Java doesn’t support multiple inheritance for classes,
 * 	interfaces allow a class to implement multiple behaviors.
 */

//implementing the interface
class CreditCardPayment implements PaymentGateway{

    //we have accessed the abstract methods from interface and overriding them
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $ "+amount);
    }

    @Override
    public void refundPayment(int transactionId) {
        System.out.println("Refunding credit card payment for transaction ID: "+ transactionId);
    }
}

class UPIPayment implements PaymentGateway{

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of $ "+amount);
    }

    @Override
    public void refundPayment(int transactionId) {
        System.out.println("Refunding UPI payment for transaction ID: "+transactionId);
    }
}
//Now, both CreditCardPayment and UPIPayment follow the PaymentGateway contract and implement the required methods.
/**
 * suppose in future if you want to add a new class like CryptoPayments or WalletPayments.
 * You simply create a new class that implements PaymentGateway
 */
public class EcommercePlatform {
    public static void main(String[] args) {
        //create object with parent interface reference for child class
        PaymentGateway paymentGatewayObj = new CreditCardPayment();
        paymentGatewayObj.processPayment(2000);
        paymentGatewayObj.refundPayment(102);

        //create object for second child class
        PaymentGateway paymentGatewayObj1 = new UPIPayment();
        paymentGatewayObj1.processPayment(1000);
        paymentGatewayObj1.refundPayment(201);
    }
}

