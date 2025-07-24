package takeYouForward.baisctopics.basicMaths;

import java.util.Scanner;

/**
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 */
public class PalindromeNumber {
    private static final Scanner SCANNER = new Scanner(System.in);
    public boolean isPalindrome(int x){
        //convert int to String
        String input = String.valueOf(x);
        //reverse the string using stringBuilder
        StringBuilder sb = new StringBuilder(input).reverse();
        //convert the stringbuilder value to string
        String result = sb.toString();
        if (result.equals(input)){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        int n = SCANNER.nextInt();
        PalindromeNumber palindromeNumberObj = new PalindromeNumber();
        System.out.println(palindromeNumberObj.isPalindrome(n));
    }
}
