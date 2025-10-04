package javaCoding.W3Resource.basic_part1;

import java.util.stream.IntStream;

public class FirstAndLastOfTwoArrays {
    public boolean getFirstAndLastElement(int[] array1, int[] array2){
        //Check the two array length must be greater or equal to 2
        if (array1.length>=2 && array2.length>=2){
            //first and last element of two integer arrays are the same
            if (array1[0]==array2[0] && array1[array1.length-1]==array2[array2.length-1]){
                return true;
            }
        }
        return false;
    }
    public boolean getFirstAndLastElementUsingStream(int[] array1, int[] array2){
        boolean result = IntStream.of(array1.length,array2.length).
                allMatch(length->length>=2 && array1[0]==array2[0] && array1[array1.length-1]==array2[array2.length-1]);
        return result;
    }
    public static void main(String[] args) {
        int[] array1 = {50, -20, 0, 30, 40, 60, 12};
        int[] array2 = {50, 20, 10, 20, 30, 50, 12};
        FirstAndLastOfTwoArrays objFirstAndLastOfTwoArrays = new FirstAndLastOfTwoArrays();
        System.out.println(objFirstAndLastOfTwoArrays.getFirstAndLastElement(array1,array2));
        //using stream
        System.out.println("Using stream : "+objFirstAndLastOfTwoArrays.getFirstAndLastElementUsingStream(array1,array2));
    }
}
