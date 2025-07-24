package takeYouForward.baisctopics.basicMaths;

import java.util.Scanner;

public class ReverseANumber {
    private static final Scanner SCANNER = new Scanner(System.in);
    public int reverse(int x) {
        int res = 0;
        boolean isNegative = x < 0;
        String strX = String.valueOf(Math.abs(x));
        StringBuilder sb = new StringBuilder(strX).reverse();

        try {
            res = Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            return 0;
        }

        return isNegative ? -res : res;
    }

    public static void main(String[] args) {
        int n = SCANNER.nextInt();
//        int reverseNumber = 0;
//        int input = Math.abs(n);
//        while (input>0){
//            int lastDigit = input%10;
//            //to form a reverse number, multiply reverse number * 10 and add last digit
//            //reverse number = 0 * 10 + 5
//            reverseNumber = reverseNumber * 10 + lastDigit;
//
//            //to get the remaining number after removing the reminder
//            input = input/10;
//        }
//        if (n<0){
//            System.out.println(-reverseNumber);
//        }else {
//            System.out.println(reverseNumber);
//        }
        ReverseANumber reverseANumberObj = new ReverseANumber();
        System.out.println(reverseANumberObj.reverse(n));
    }
}
