package com.JTraining;

public class ClassMethodAndObject {
    //created static method and will be called with help of method name itself
    public static int addition(int num1, int num2){
        int sum = 0;
        sum = (num1 + num2);
        System.out.println("The addition of " + num1 + " and " + num2 + " is : " + sum);
        return sum;
    }
    //created instance method and method will be called with the help of object
    public int multiplication(int num1, int num2){
     int multi = 0;
     multi =(num1 * num2);
        System.out.println("The multiplication of " + num1 + " and " + num2 + " is : " + multi);
        return multi;
    }

    public static void main(String[] args) {
        int i;
        int j;
        ClassMethodAndObject objMulti = new ClassMethodAndObject(); //object created with class
        for(i = 0; i<=5; i++){
            for(j = 0; j<=5; j++){
                addition(i, j);  // static method called with method name
                objMulti.multiplication(i, j);  //instance method called with the help of object
            }
        }
    }
}
