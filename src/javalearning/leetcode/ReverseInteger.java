package javalearning.leetcode;

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
        return a;
    }

    public static void main(String[] args) {
        long input = 123;
        reverse(input);
    }
}
