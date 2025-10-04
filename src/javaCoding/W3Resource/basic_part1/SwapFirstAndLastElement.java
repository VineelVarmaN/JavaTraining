package javaCoding.W3Resource.basic_part1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SwapFirstAndLastElement {
    public int[] getSwappedFirstAndLastElement(int[] array){
        //check if array length is greater than 1
        if (array.length>1){
            //swap the first and last element of the string
            int temp = array[0];
            array[0]=array[array.length-1];
            array[array.length-1]=temp;
        }
        return array;
    }
    public int[] getSwappedFirstAndLastElementUsingStream(int[] array1){
            return IntStream.range(0,array1.length)
                    //if I value is 0, then assign last value from original array to first element
                    .map(i->i==0 ? array1[array1.length-1]
                    //if I value is array.length-1, then assign the first value from original array to last element
                    : (i==array1.length-1? array1[0]
                     //remaining values will be placed same as original element
                    : array1[i])).toArray();
    }
    public static void main(String[] args) {
        int[] array = {20, 30, 40};
        int[] array1 = {25,35,45};
        System.out.println("Original Array: "+ Arrays.toString(array));
        SwapFirstAndLastElement objSwapFirstAndLastElement = new SwapFirstAndLastElement();
        System.out.println("New array after swaping the first and last elements: "+
                Arrays.toString(objSwapFirstAndLastElement.getSwappedFirstAndLastElement(array)));
        //using stream
        System.out.println("Using Stream : "+
                Arrays.toString(objSwapFirstAndLastElement.getSwappedFirstAndLastElementUsingStream(array1)));
    }
}
