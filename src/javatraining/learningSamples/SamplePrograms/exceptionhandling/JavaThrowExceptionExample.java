package javatraining.learningSamples.SamplePrograms.exceptionhandling;

public class JavaThrowExceptionExample {
    public static void main(String[] args) {
        int i = 1;
            if (i<18){
                throw new ArithmeticException("Person is not eligible to vote");
            }
            else {
                System.out.println("Person is eligible to vote");
            }
    }
}
