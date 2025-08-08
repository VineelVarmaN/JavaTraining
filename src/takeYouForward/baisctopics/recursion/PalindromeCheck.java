package takeYouForward.baisctopics.recursion;

import java.util.Scanner;

public class PalindromeCheck {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static boolean isPalindrome(String s){
        String cleaned = s.trim().replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        System.out.println(cleaned);
        for (int i =0; i<cleaned.length(); i++){
            if (cleaned.charAt(i)!=cleaned.charAt(cleaned.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = SCANNER.nextLine();
        System.out.println(isPalindrome(s));
    }
}
