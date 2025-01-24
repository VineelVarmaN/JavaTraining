package javapractice.W3Resource.basic_part1;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DigitSumInWords {
    public String getDigitSum(int num){
        //that then reads an integer
        int sum = 0;
        //first split the integer into digit
        while(num !=0){
            // calculates the sum of its digits
            sum += num%10;
            num = num/10;
        }
        System.out.println(sum);
        // writes the number of each digit of the sum in English.
        switch (sum){
            case 0 : return "Zero";
            case 1 : return "One";
            case 2 : return "Two";
            case 3 : return "Three";
            case 4 : return "Four";
            case 5 : return "Five";
            case 6 : return "Six";
            case 7 : return "Seven";
            case 8 : return "Eight";
            case 9 : return "Nine";
            default: return "";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        DigitSumInWords objDigitSumInWords = new DigitSumInWords();
        System.out.println(objDigitSumInWords.getDigitSum(num));
    }
}
