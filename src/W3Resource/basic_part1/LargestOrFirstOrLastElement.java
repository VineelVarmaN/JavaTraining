package W3Resource.basic_part1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LargestOrFirstOrLastElement {
    public int getLargestElement(int[] array){
        //get the largest element from array
        int largest = 0;
        for (int i = 0; i<array.length; i++){
            if (array[i]>largest){
                largest = array[i];
            }
        }
        return largest;
    }
    public int getLargestElementUsingStream(int[] array){
        int result = IntStream.of(array).max().getAsInt();
        return result;
    }
    public static void main(String[] args) {
        int[] array = {20, 30, 10};
        System.out.println("Original Array : "+ Arrays.toString(array));
        LargestOrFirstOrLastElement objLargestOrFirstOrLastElement = new LargestOrFirstOrLastElement();
        System.out.println("Larger value between first and last element: "+
                objLargestOrFirstOrLastElement.getLargestElement(array));
        //using stream
        System.out.println("Using Stream : "+objLargestOrFirstOrLastElement.getLargestElementUsingStream(array));
    }
}
