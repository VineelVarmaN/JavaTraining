package javalearning.myTraining.day2.Interface;

//	Imagine a Payment Gateway interface defines two abstract methods.
public interface PaymentGateway {
        void processPayment(double amount);
        void refundPayment(int transactionId);
}
