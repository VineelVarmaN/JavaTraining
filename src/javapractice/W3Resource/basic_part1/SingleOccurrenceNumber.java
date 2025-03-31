package javapractice.W3Resource.basic_part1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SingleOccurrenceNumber {
    public static int numberOccurrenceCount(int[] numbers){
        //create count variable
        int result = 0;
        //take 1 element from array and cross check with all elements from array.
        for (int i = 0; i<numbers.length; i++){
            result ^= numbers[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 10, 20, 30, 40, 40, 30, 50};
        System.out.println("Input data = "+ Arrays.toString(numbers));
        System.out.println(numberOccurrenceCount(numbers));
    }
}
