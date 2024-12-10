package javatraining.practice.SamplePrograms;

import java.util.Scanner;

public class SumOdDigitsOfANumber1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = 0;
        System.out.println("Number is : " + number);
        while (number>0){
            int output = number%10;
            result =result +  output;
            number = number/10;
            //System.out.println(number);
        }
        System.out.println(result);

    }
}
