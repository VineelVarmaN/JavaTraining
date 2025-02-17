package javapractice.W3Resource.basic_part1;

import javax.swing.*;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * use for loop to get two values from array
 * check the difference between first two values = 1 and another two values = 1
 * if value is 1, return three
 */
public class ThreeIncreasingAdjacentNumbers {
    public static boolean checkThreeAdjacentNumbers(int[] numbers){
        //for loop to get two values from array
        for (int i = 0; i<numbers.length-2; i++){
            if ((Math.subtractExact(numbers[i],numbers[i+1])==-1) && (Math.subtractExact(numbers[i+1],numbers[i+2])==-1)){
                return true;
            }
        }
        return false;
    }

    public static boolean checkThreeAdjacentNumbersUsingStream(int[] numbers){
        boolean result = IntStream.range(0,numbers.length-2).anyMatch(n-> ((Math.subtractExact(numbers[n],numbers[n+1])==-1)
                && (Math.subtractExact(numbers[n+1],numbers[n+2])==-1)));
        return result;
    }
    public static void main(String[] args) {
        int[] numbers = {1,2,3,5,6};
        System.out.println(Arrays.toString(numbers));
        System.out.println(checkThreeAdjacentNumbers(numbers));
        System.out.println("Using stream : "+checkThreeAdjacentNumbersUsingStream(numbers));
    }
}
