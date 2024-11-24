package com.leetcode.orginal;

import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs){

        if (strs == null){
            return "no array string input";
        }
        Arrays.sort(strs);
        String first = strs[0];
        String second = strs[strs.length - 1];
        String result = "";
        //find minimum length
        int minLength = Math.min(first.length(),second.length());
        int i =0;
        while (i < minLength
                && first.charAt(i) == second.charAt(i)) {
            //result += first.charAt(i);
            i++;
        }
        return first.substring(0,i);
    }
    public static void main(String[] args){
        String[] strs = {"flower","flow","flight"};
        LongestCommonPrefix objLongestCommonPrefix = new LongestCommonPrefix();
        System.out.println(objLongestCommonPrefix.longestCommonPrefix(strs));
    }
}
