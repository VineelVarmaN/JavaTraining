package W3Resource.basic_part1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MultiplyArrayElements {
    public String getMultiplyArray(int[] array1, int[] array2){
        //create an empty array
        int[] array3 = new int[Math.max(array1.length, array2.length)];
        //using for loop, get the first element from both arrays
        for (int i = 0; i< array3.length; i++){
            //multiply both elements and add it into first array element
            array3[i] = Math.multiplyExact(array1[i],array2[i]);
        }
        //convert the array to string
        return Arrays.toString(array3);
    }
    public String getMultiplyArrayUsingStream(int[] array1, int[] array2){
        int[] result = IntStream.range(0,array1.length).map(i->Math.multiplyExact(array1[i],array2[i])).toArray();
        return Arrays.toString(result);
    }
    public static void main(String[] args) {
        int[] array1 = {1, 3, -5, 4};
        int[] array2 = {1, 4, -5, -2};
        System.out.println("Array1: "+Arrays.toString(array1));
        System.out.println("Array2: "+Arrays.toString(array2));
        MultiplyArrayElements objMultiplyArrayElements = new MultiplyArrayElements();
        System.out.println("Result: "+objMultiplyArrayElements.getMultiplyArray(array1,array2));
        //using stream
        System.out.println("Using stream : "+objMultiplyArrayElements.getMultiplyArrayUsingStream(array1,array2));
    }
}
