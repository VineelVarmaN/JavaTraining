package javalearning.myTraining.day2.exceptionHandling;

/**
 * In java, an exception is an unwanted or unexpected event that disrupts the normal flow of a program.
 * Exception handling allows us to gracefully handle errors and preventing unexpected crashes.
 *
 * There are three types of exceptions
 *  1. checked exceptions = checked exceptions are exception which are checked at compile time.
 *      a.  IOException = exception when an input or output operation fails, like reading from file(or) writing to a file.
 *      b.  SQLException = error occurs while accessing a database.
 *      c.  ParseException = error occurs while parsing string into another datatype.
 *      d.  classNotFoundException = occurs when a class with specified name cannot be found in the classpath
 *  2.  UncheckExceptions = Runtime exception, which usually occurs due to programming errors, such as logic errors (or) incorrect assumptions in the code.
 *      a.  NullPointerException = occur when trying to access or call a method where object reference is null.
 *      b.  ArrayIndexOutOfBoundException = occur when we try to access an array element with an invalid index
 *      c. Arithmetic exception = occur when an arithmetic operation fails
 *      d.  IllegalArgumentException = indicates a argument passed for the method is in invalid format.
 * 3.   CustomExceptions = USer defined exceptions for specific business logic violations
 *
 * Example: Take as a Bank withdraw transaction. If amount is greater than balance.
 * The transaction cannot be completed, and it's an error.
 * so, at that moment, we have to handle the exception and inform the user that the account balance has insufficient funds
 * we can achieve the exceptions using try catch block
 */

//custom exception created - it will return string value as message
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    //constructor to initialize the values while creating objects
    public BankAccount(double balance) {
        this.balance = balance;
    }

    //withdraw method will throw custom exception
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Transaction failed: Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: ₹" + balance);
        }
    }
}

public class BankTransaction {
    public static void main(String[] args) {
        BankAccount accountObj = new BankAccount(5000); // Initial balance
        //inside try block will call the withdraw money with object
        try {
            accountObj.withdraw(2000);
            //catch block will handle the custom exception
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
            //finally will execute the logic irrespective of try block result
        } finally {
            System.out.println("Transaction processing completed.");
        }
    }
}
