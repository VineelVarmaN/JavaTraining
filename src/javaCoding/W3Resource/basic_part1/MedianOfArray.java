package javaCoding.W3Resource.basic_part1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MedianOfArray {
    public static int getMedianValue(int[] array){
        //check if array size is odd or even
        if (array.length%2==0){
            System.out.println("array length is even");
            //if even, get two middle values and return the average
            int result = (array[array.length/2-1]+array[array.length/2])/2;
            return result;
        }
        //if odd return the middle element
        System.out.println("array length is odd");
        return array[array.length/2];
    }
    public static void main(String[] args) {
        int[] array = {10, 2, 38, 22, 38, 23,21};
        System.out.println("Orginal Array: "+ Arrays.toString(array));
        System.out.println("Median of the said array of integers: "+getMedianValue(array));
    }
}
