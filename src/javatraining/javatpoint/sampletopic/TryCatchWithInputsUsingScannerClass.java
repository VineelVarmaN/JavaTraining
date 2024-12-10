package javatraining.javatpoint.sampletopic;

import java.util.Scanner;

//input provided from user in console
class DivideTwoNumbers{
    public void divideResult(){
        Scanner sc1 = new Scanner(System.in); //System.in = input provided in system using console
        Scanner sc2 = new Scanner(System.in);
        try {
            int divide = sc1.nextInt() / sc2.nextInt();
            System.out.println("Division of two number are :" + divide);
            //if block to check try the result, if not matches catch block will throw exception
            if (divide == 0)
                throw new ArithmeticException();
        }catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}

public class TryCatchWithInputsUsingScannerClass {
    public static void main(String[] args) {
        DivideTwoNumbers objDivideResult = new DivideTwoNumbers();
        objDivideResult.divideResult();
    }
}

