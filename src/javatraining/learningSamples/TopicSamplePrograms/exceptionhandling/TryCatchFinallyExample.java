package javatraining.learningSamples.TopicSamplePrograms.exceptionhandling;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        try {
            System.out.println("inside try 1");
            try {
                int i = 10/0;
            }catch (ArithmeticException e){
                System.out.println(e);
            }
        }catch (Exception e){
            System.out.println("inside try 1 : "+e);
        }finally {
            System.out.println("continue the code");
        }
    }
}
