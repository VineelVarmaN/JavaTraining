package javatraining.learningSamples.TopicSamplePrograms.exceptionhandling;

public class TryMultiCatchExceptions {
    public void handleExceptionsUsingMultiCatch(){
        int[] a = new int[5];
        try {
            a[5] = 50/0;
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound");
        }
        catch (Exception e){
            System.out.println("Parent Exception");
        }
    }
    public static void main(String[] args) {

    }
}
