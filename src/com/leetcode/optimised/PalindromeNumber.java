package com.leetcode.optimised;

public class PalindromeNumber {

    public boolean isPalindrome(int x){
        if(x < 0){
            return false;
        }
        //int to string conversion
        String input = Integer.toString(x);
        //reverse the string using string builder
        StringBuilder output = new StringBuilder(input).reverse();
        // compare the input and output
        return input.contentEquals(output);
    }
    public static void main(String[] args){
        int x = 121;
        PalindromeNumber objPalindromeNumber = new PalindromeNumber();
        System.out.println(objPalindromeNumber.isPalindrome(x));
    }
}
