package takeYouForward.baisctopics.basicMaths;

import java.util.Scanner;

public class PalindromeNumberWithOutStrings {
    private static final Scanner SCANNER = new Scanner(System.in);

    public boolean isPalindrome(int x){
        int dup = x;
        int reverseNumber = 0;
        if (x<=0){
            return false;
        }
        while (x>0){
            reverseNumber += reverseNumber*10 + x%10;
            x = x/10;
        }
        if (dup==reverseNumber){
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
