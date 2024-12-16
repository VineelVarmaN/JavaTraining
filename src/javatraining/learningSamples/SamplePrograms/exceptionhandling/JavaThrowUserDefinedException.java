package javatraining.learningSamples.SamplePrograms.exceptionhandling;

class UserDefinedException extends Exception{
    public UserDefinedException(String message) {
        super(message);
    }
}
public class JavaThrowUserDefinedException {
    public static void main(String[] args) {
        int age = 10;
        try {
            if (age<18){
                throw new UserDefinedException("Person is not eligible for voting");
            }
            else {
                System.out.println("Person is eligible for voting");
            }

        }catch (UserDefinedException ude){
            System.out.println(ude.getMessage());
        }
    }
}
