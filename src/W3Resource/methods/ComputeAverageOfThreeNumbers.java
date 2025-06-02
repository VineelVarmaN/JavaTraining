package W3Resource.methods;

import java.util.Scanner;

public class ComputeAverageOfThreeNumbers {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int first = SCANNER.nextInt();
        System.out.println("Input the first number: "+first);
        int second = SCANNER.nextInt();
        System.out.println("Input the first number: "+second);
        int third = SCANNER.nextInt();
        System.out.println("Input the first number: "+third);
        int average = (first+second+third)/3;
        System.out.println("The average value is "+average);
    }
}
