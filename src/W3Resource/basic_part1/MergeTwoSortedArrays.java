package W3Resource.basic_part1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoSortedArrays {
    public static int[] mergeTwoSortedArrays(int[] arrays1, int[] arrays2){
        //create an empty array with two array plus sizes
        int[] result = new int[arrays1.length+arrays2.length];
        //iterate one array
        for (int i = 0; i<arrays1.length; i++){
            //add each element from both arrays
            result[i] = arrays1[i];
            result[i+4] = arrays2[i];
        }
       // System.out.println("orginal array : "+Arrays.toString(result));
        Arrays.sort(result);
        return result;
    }
    public static int[] mergeTwoSortedArraysUsingStream(int[] arrays1, int[] arrays2){
        int[] result = IntStream.concat(IntStream.of(arrays1),IntStream.of(arrays2)).toArray();
        Arrays.sort(result);
        return result;
    }
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4};
        int[] array2 = {2,5,7, 8};
        System.out.println("array1 = "+Arrays.toString(array1));
        System.out.println("array2 = "+Arrays.toString(array2));
        System.out.println("result = "+Arrays.toString(mergeTwoSortedArrays(array1,array2)));
        System.out.println("Using stream : "+Arrays.toString(mergeTwoSortedArraysUsingStream(array1,array2)));
    }
}
