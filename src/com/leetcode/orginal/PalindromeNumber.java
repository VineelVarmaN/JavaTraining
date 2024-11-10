package com.leetcode.orginal;

public class PalindromeNumber {

    public static boolean palindromeNUmber(int input){
        String inputNum = Integer.toString(input);
        String output = "";
            for (int j=inputNum.length()-1; j<inputNum.length() && j>=0; j--){
                output +=inputNum.charAt(j);
            }
            if (inputNum.equals(output)){
                return true;
            }
     return false;
    }
    public static void main(String[] args) {
        int input = -121;
        System.out.println(palindromeNUmber(input));
    }

}
