package javatraining.practice.leetcode;

public class LongestPalindromicSubstring {
    public static String palindromicLogic(String a){
        int aLength = a.length();
        String subString = "";
        for (int i = 0; i<aLength; i++){
            for (int j =i; j<aLength; j++){
               subString = a.substring(i, j + 1);
               if (subString.length()>1)
                {
                    String output = "";
                    for (int k = (subString.length()-1); k >=0; --k) {
                        output = output + subString.charAt(k);
                    }
                    if (subString.toLowerCase().equals(output.toLowerCase())) {
                        System.out.println(subString + " is a Palindrome String.");
                    }
                }
            }
        }
        return a;
    }
    public static void main(String[] args) {
        String input = "babad";
        palindromicLogic(input);
    }
}
