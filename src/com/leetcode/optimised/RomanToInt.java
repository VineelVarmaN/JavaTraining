package com.leetcode.optimised;

import java.util.HashMap;

public class RomanToInt {
        public int romanToInt(String s) {
            HashMap<Character, Integer> romanMap = new HashMap<>();
            romanMap.put('I', 1);
            romanMap.put('V', 5);
            romanMap.put('X', 10);
            romanMap.put('L', 50);
            romanMap.put('C', 100);
            romanMap.put('D', 500);
            romanMap.put('M', 1000);
            int sLength = s.length();
            int result = 0;
            for(int i = 0; i<sLength; i++){
                int current = romanMap.get(s.charAt(i));
                int next = (i + 1 < sLength) ? romanMap.get(s.charAt(i + 1)): 0;
                if(current < next){
                    result -= current;
                }
                else{
                    result += current;
                }
            }
            return result;
        }
        public static void main(String[] args){
            String s ="III";
            RomanToInt objRomanToInt = new RomanToInt();
            System.out.println(objRomanToInt.romanToInt(s));
        }
}
