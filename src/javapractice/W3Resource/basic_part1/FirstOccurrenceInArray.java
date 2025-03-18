package javapractice.W3Resource.basic_part1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FirstOccurrenceInArray {
    public static int getFirstOccurrenceInArray(int[] number, int expectedNumber){
        for (int i = 0; i< number.length; i++){
            if (number[i]==expectedNumber){
                return i;
            }
        }
        return -1;
    }
    public static int getFirstOccurrenceInArrayUsingStream(int[] number, int expectedNumber){
         int result = IntStream.range(0,number.length).filter(n-> number[n]==expectedNumber).findFirst().orElse(-1);
         return result;
    }
    public static void main(String[] args) {
        int[] number = {2,4,6,8};
        int expectedNumber = 6;
        System.out.println("The number array : "+ Arrays.toString(number));
        System.out.println(getFirstOccurrenceInArray(number, expectedNumber));
        System.out.println("using stream : "+getFirstOccurrenceInArrayUsingStream(number, expectedNumber));
    }
}
