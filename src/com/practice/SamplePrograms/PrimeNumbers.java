package com.practice.SamplePrograms;

public class PrimeNumbers {
    static boolean isPrimeOrNot(int j){
        for (int i = 2; i<j; i++){
            if (j % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
                for (int j =2; j<100; j++) {
            if (isPrimeOrNot(j)) {
                System.out.println(j + " is a prime number");
            }
        }
        //System.out.println(j + " is not a prime number");
    }
}
