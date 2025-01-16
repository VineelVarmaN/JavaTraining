package javatraining.W3Resource.basic_part1;

import java.util.stream.IntStream;

public class CalculateModulusOfTwoNumbers {
    public int getModulusOfTwoNumbers(int dividend, int divisor){
        if (dividend<=0 || divisor <=0){
            System.out.println("Input params are missing");
        }
        System.out.println("Input the first number : "+dividend);
        System.out.println("Input the second number : "+divisor);
        //int 19(Dividend)/7(Divisor) = 2 (quotient)
        int quotient = (dividend/divisor);
        //19-(7*2) = modulus value
        int modulus = dividend - (divisor*quotient);
        //check if modulus is correct or not
        if (dividend == (divisor*quotient)+modulus){
            return modulus;
        }
        return 0;
    }
    public static void main(String[] args) {
       int dividend = 19;
       int divisor = 7;
       CalculateModulusOfTwoNumbers objCalculateModulusOfTwoNumbers = new CalculateModulusOfTwoNumbers();
        System.out.println(objCalculateModulusOfTwoNumbers.getModulusOfTwoNumbers(dividend,divisor));
    }
}
