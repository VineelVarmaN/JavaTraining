package javapractice.W3Resource.basic_part1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NewArrayWithEndsOfTwoArrays {
    public int[] getNewArray(int[] array1, int[] array2){
        //Create an array of length 2 will contain the first and last element from two arrays
        int[] array3 = new int[2];
        array3[0] = array1[0];
        array3[1] = array2[array2.length-1];
        return array3;
    }
    public int[] getNewArrayUsingStream(int[] array1, int[] array2){
        int[] result = IntStream.concat(Arrays.stream(array1).map(n->array1[0]),
                Arrays.stream(array2).map(n->array2[array2.length-1])).toArray();
        return result;
    }
    public static void main(String[] args) {
        int[] array1 = {50, -20, 0};
        int[] array2 = {5, -50, 10};
        System.out.println("Array1 : "+Arrays.toString(array1));
        System.out.println("Array2 : "+Arrays.toString(array2));
        NewArrayWithEndsOfTwoArrays objNewArrayWithEndsOfTwoArrays = new NewArrayWithEndsOfTwoArrays();
        System.out.println(Arrays.toString(objNewArrayWithEndsOfTwoArrays.getNewArray(array1,array2)));
        //using stream
        System.out.println("Using stream : "+Arrays.toString(objNewArrayWithEndsOfTwoArrays.getNewArrayUsingStream(array1,array2)));
    }
}
