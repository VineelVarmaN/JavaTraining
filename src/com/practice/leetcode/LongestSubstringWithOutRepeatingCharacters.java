package com.practice.leetcode;

public class LongestSubstringWithOutRepeatingCharacters {
    public static int subStringLength(String a){
        int l = a.length();
        String output = "";
        for (int i =0; i<l; i++){
            //System.out.println(a.charAt(i));
            String character = String.valueOf(a.charAt(i));
            //System.out.println("Char " + character);
           if (!output.contains(character)){
                output = output+character;
            }
        }
        System.out.println(output);
        System.out.println(output.length());
        //System.out.println(l);
        return l;
    }
    public static void main(String[] args) {
        String input = "bbbb";

        subStringLength(input);

    }
}
