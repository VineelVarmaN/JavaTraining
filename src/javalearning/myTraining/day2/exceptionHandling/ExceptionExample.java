package javalearning.myTraining.day2.exceptionHandling;

/**
 * try block contains the risky code
 * catch block handles errors
 * finally block always executes(useful for cleanup activities)
 */
public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will cause ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("Execution completed.");
        }
    }
}
