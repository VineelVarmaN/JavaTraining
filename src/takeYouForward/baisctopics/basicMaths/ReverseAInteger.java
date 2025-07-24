package takeYouForward.baisctopics.basicMaths;

import java.util.Scanner;

public class ReverseAInteger {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int n = SCANNER.nextInt();
        int result = 0;
        //get only absolute value
        int input = Math.abs(n);
        //convert int to String
        String number = Integer.toString(input);
        //reverse the string
        StringBuilder sb = new StringBuilder(number).reverse();
        //convert string builder to string
        String reverseNumber = sb.toString();
        //convert the string to int
        try {
            result = Integer.parseInt(reverseNumber);
        }catch (NumberFormatException e){
            System.out.println("Exception: "+0);
        }
        if (n<0){
            System.out.println(-result);
        }else {
            System.out.println(result);
        }
    }
}
