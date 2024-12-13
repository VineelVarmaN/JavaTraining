package javatraining.learningSamples.SamplePrograms;

public class TryCatchExample {
    public void handleArithmeticException(int input){
        int i = 0;
        try {
            i = input / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("value of i " + i);
    }
    //handle exception using parent exception class
    public void handleUsingException(int input){
        int i = 0;
        try {
            i = input / 0;
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    //handle exception using custom message
    public void handleExceptionUsingCustomMessage(int input){
        int j = 0;
        try {
            j = input / 0;
        }catch (Exception e){
            System.out.println("Number cannot divided by Zero");
        }
    }
    public void handleArrayIndexOutOfBoundException(int[] inputArray){
        int value = 0;
        try {
            value = inputArray[10];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("Value is : "+value);
    }
    public static void main(String[] args) {
        int input = 100;
        TryCatchExample objTryCatchExample = new TryCatchExample();
        objTryCatchExample.handleArithmeticException(input);
        objTryCatchExample.handleUsingException(input);
        objTryCatchExample.handleExceptionUsingCustomMessage(input);
        int[] inputArray = {1,2,3,4};
        objTryCatchExample.handleArrayIndexOutOfBoundException(inputArray);
    }
}
