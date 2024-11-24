package com.leetcode.orginal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        if (s == null){
            return false;
        }
        int sLength =s.length();
        Stack<Character> tempValue = new Stack<>();
        for (int i = 0; i<sLength; i++){
                if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                    tempValue.push(s.charAt(i));
                }
                else {
                    if (!tempValue.empty() &&
                                ((tempValue.peek() == '(' && s.charAt(i)== ')') ||
                                        (tempValue.peek() == '{' && s.charAt(i)== '}') ||
                                (tempValue.peek() == '[' && s.charAt(i)== ']' ))){
                        tempValue.pop();
                    }
                    else{
                        return false;
                    }
                }
        }
        return tempValue.empty();
    }

    public static void main(String[] args) {
        String s = "()";
        ValidParentheses objVallidParentheses = new ValidParentheses();
        System.out.println(objVallidParentheses.isValid(s));
    }
}
