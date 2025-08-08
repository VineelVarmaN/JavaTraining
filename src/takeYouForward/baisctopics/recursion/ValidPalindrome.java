package takeYouForward.baisctopics.recursion;

import java.util.Scanner;

public class ValidPalindrome {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static boolean isPalindrome(int i, String s){
//        s = s.trim().toLowerCase();
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(cleaned);
        if (i>=s.length()/2) return true;
        if (cleaned.charAt(i)!=s.charAt(cleaned.length()-1-i)) return false;
        return isPalindrome(i+1,s);
    }

    public static void main(String[] args) {
        String s = SCANNER.nextLine();
        System.out.println(isPalindrome(0,s));
    }
}
