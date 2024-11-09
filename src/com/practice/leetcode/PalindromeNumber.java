package com.practice.leetcode;

import java.lang.reflect.Array;

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
        int input = 10;
        System.out.println(palindromeNUmber(input));
    }

}
