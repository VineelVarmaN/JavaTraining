package javapractice.W3Resource.basic_part1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberComparisonLogic {
    public boolean numberComparisonLogic(int num1, int num2, int num3){
        //return true, if second number is greater than first number and
        // third number is greater than the second number
        if ((num2 > num1) && (num3 > num2)){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean numberComparisonLogicUsingStream(List<Integer> numberList){
        //boolean result = IntStream.range(0, numberList.size() - 2) .allMatch(i -> numberList.get(i) < numberList.get(i + 1) && numberList.get(i + 1) < numberList.get(i + 2));
        boolean numberComparison = numberList.stream().allMatch(number->numberList.get(1)>numberList.get(0) && numberList.get(2)>numberList.get(1));
        return numberComparison;
    }
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter the first number
        System.out.print("Input the first number :");
        int num1 = scanner.nextInt();
        // Prompt the user to enter the first number
        System.out.print("Input the second number :");
        int num2 = scanner.nextInt();
        // Prompt the user to enter the first number
        System.out.print("Input the third number :");
        int num3 = scanner.nextInt();
        NumberComparisonLogic objNumberComparisonLogic = new NumberComparisonLogic();
        System.out.println("The result is: "+objNumberComparisonLogic.numberComparisonLogic(num1,num2,num3));
        //for stream
        List<Integer> numberList = new ArrayList<>();
        numberList.add(num1);
        numberList.add(num2);
        numberList.add(num3);
        System.out.println("The result using stream : "+objNumberComparisonLogic.numberComparisonLogicUsingStream(numberList));

    }
}
