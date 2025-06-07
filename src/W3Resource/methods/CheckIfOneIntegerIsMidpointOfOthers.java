package W3Resource.methods;

import java.util.Scanner;

public class CheckIfOneIntegerIsMidpointOfOthers {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static boolean checkTheMidPoint(int num1, int num2, int num3){
        if (num1 < 0 || num2 < 0 || num3 < 0){
            return false;
        }
//        if ((num1+num3)/2==num2){
//            return true;
//        }
        return (num1+num3)/2==num2;
    }

    public static void main(String[] args) {
        int num1 = SCANNER.nextInt();
        int num2 = SCANNER.nextInt();
        int num3 = SCANNER.nextInt();
        System.out.println(checkTheMidPoint(num1, num2, num3));
    }
}
