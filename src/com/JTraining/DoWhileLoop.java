package com.JTraining;

public class DoWhileLoop {
    public static void main(String[] args) {
        int x = 1;
        do{
            System.out.println("The value of X:" + x);
            x++;
        }
        while(x <=5);
        System.out.println("Value is out of range");
        //
        int y = 21;
        int sum = 0;
        do{
            System.out.println("value of y:" + y);
            sum += y;
            y--;
        }
        while(y>=10);
        System.out.println("Total value of sum:" + sum);
    }
}
