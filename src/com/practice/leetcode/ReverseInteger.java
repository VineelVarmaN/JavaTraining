package com.practice.leetcode;

public class ReverseInteger {

    public static long reverse(long a){
        String str = String.valueOf(a);
        int strLength = str.length();
        String output = "";
        for(int i = strLength-1; i<strLength && i>=0; i--){
            output += str.charAt(i);
        }
        int outputNumber = Integer.parseInt(output);
        System.out.println(outputNumber);
        /* if (a < 0){
            int reverseNegativeInteger = outputNumber * -1;
            System.out.println(reverseNegativeInteger);
        }
        else {
            System.out.println(outputNumber);
        } */
        return a;
    }

    public static void main(String[] args) {
        long input = 123;
        reverse(input);
    }
}
