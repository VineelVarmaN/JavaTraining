package javaCoding.W3Resource.methods;

import java.util.Scanner;

public class CheckConsecutiveIntegers {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static boolean checkConsecutiveNumbers(int num1, int num2, int num3){
        if (num1<0){
            return false;
        }
        return num1 == num1 && num2 == num1 + 1 && num3 == num1 + 2;
    }

    public static void main(String[] args) {
        int num1 = SCANNER.nextInt();
        int num2 = SCANNER.nextInt();
        int num3 = SCANNER.nextInt();
        System.out.println(checkConsecutiveNumbers(num1,num2,num3));
    }
}
