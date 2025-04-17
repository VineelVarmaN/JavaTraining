package javalearning.myTraining.day2.multiThreading;

/**
 * Multithreading allows a Java program to execute multiple tasks simultaneously using threads.
 * A thread is the smallest unit of execution in a program.
 * example: Restaurant Kitchen with a couple of employess
 *  employee1 will handle Orders and prepare food
 *  employee2 will handle payments
 *  here, both chefs work at same time making the restaurant faster
 *
 *  Ways to create a thread in java
 *  1.  By Extending the Thread class
 *  2.  Implementing the Runnable interface
 *
 *  Creating Threads using Threads class
 *  Let's take an example of Food Ordering System.
 *  where One Thread handles order processing.
 *  Another Thread handles payment processing.
 */

class OrderProcessing extends Thread{
    public void run(){
       for (int i = 1; i<=5; i++){
           System.out.println("Processing order #"+i);
           try {
               Thread.sleep(1000); //pauses for 1 second
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
        System.out.println("All orders are processed.");
    }
}

class PaymentProcessing extends Thread{
    public void run(){
        for (int i = 1; i<=5; i++){
            System.out.println("Processing payment for Order #"+i);
            try {
                Thread.sleep(1500); //pauses for 1.5 second
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("All payments are processed.");
    }
}
public class RestaurantSystem {
    public static void main(String[] args) {
        OrderProcessing orderThread = new OrderProcessing();
        PaymentProcessing paymentThread = new PaymentProcessing();

        orderThread.start(); //will start the thread which will execute the run method
        paymentThread.start(); //will start the thread which will execute the run method
    }
}
