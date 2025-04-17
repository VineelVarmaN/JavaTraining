package javalearning.myTraining.day2.multiThreading;

/**
 * Runnable is an interface and used in preferred way for better scalability.
 * It allows the class to implement other interfaces
 */
class OrderProcessing1 implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Processing Order #" + i);
            try { Thread.sleep(1000); } catch (InterruptedException e) { }
        }
    }
}

class PaymentProcessing1 implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Processing Payment for Order #" + i);
            try { Thread.sleep(1500); } catch (InterruptedException e) { }
        }
    }
}

public class RestaurantSystemRunnable {
    public static void main(String[] args) {
        //created two thread objects
        Thread orderThread = new Thread(new OrderProcessing1());
        Thread paymentThread = new Thread(new PaymentProcessing1());

        //starts both threads using start() to call the run() method
        orderThread.start();
        paymentThread.start();
    }
}

/**
 * Runnable is an interface
 * Thread is a class
 * Runnable can be implemented while extending another class
 * Thread cannot extend another class since java allows single inheritance.
 */