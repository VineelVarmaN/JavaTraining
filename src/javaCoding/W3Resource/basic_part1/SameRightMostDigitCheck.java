package javaCoding.W3Resource.basic_part1;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class SameRightMostDigitCheck {
    public boolean sameRightMostDigitCheck(int num1, int num2, int num3){
        //return true if any of the two numbers last digit is same
        if ((num1%10==num2%10)||(num2%10==num3%10)||(num3%10==num1%10)){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean sameRightMostDigitCheckUsingStream(List<Integer> numberList){
        boolean sameRightMost = IntStream.range(0,numberList.size()-2)
                .allMatch(i->(numberList.get(i)%10==numberList.get(i+1)%10)||(numberList.get(i+1)%10==numberList.get(i+2)%10)||(numberList.get(i+2)%10==numberList.get(i)%10));
        return sameRightMost;
    }
    public static void main(String[] args) {
        //create a scanner object to read the value from user
        Scanner scanner = new Scanner(System.in);
        //print the first number in integer variable
        System.out.print("Input the first number : ");
        int num1 = scanner.nextInt();
        //print the second number in integer variable
        System.out.print("Input the second number : ");
        int num2 = scanner.nextInt();
        //print the third number in integer variable
        System.out.print("Input the third number : ");
        int num3 = scanner.nextInt();
        SameRightMostDigitCheck objSameRightMostDigitCheck = new SameRightMostDigitCheck();
        System.out.println("The result is : "+objSameRightMostDigitCheck.sameRightMostDigitCheck(num1, num2, num3));
        //USING STREAM API
        List<Integer> numberList = new ArrayList<>();
        numberList.add(num1);
        numberList.add(num2);
        numberList.add(num3);
        System.out.println("The result using stream is : "+objSameRightMostDigitCheck.sameRightMostDigitCheckUsingStream(numberList));
    }
}
