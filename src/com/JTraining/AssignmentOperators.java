package com.JTraining;

public class AssignmentOperators {
    public static void main(String[] args) {
        int x = 10;
        int result;
        // assigning a value to result variable
        result = x;
        System.out.println("result for =: " + result);
        //addition of value
         result += x;  // result = 10(result) + 10(x)
        System.out.println("result for +=: " + result);
        //subtraction of value
        result -= x; // result = 20(result) - 10(x)
        System.out.println("result for -=: " + result);
        //multiplication of value
        result *= x; // result = 10(result) * 10(x)
        System.out.println("result for *=: " + result);
        //division of value
        result /= x; // result = 100(result) / 10(x)
        System.out.println("result for /=: " + result);
        //percentile of value
        result %= x; //result = 10(result) % 10(x)
        System.out.println("result for %=: " + result);
    }
}
