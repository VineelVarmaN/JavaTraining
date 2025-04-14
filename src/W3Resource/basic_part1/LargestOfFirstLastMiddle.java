package W3Resource.basic_part1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LargestOfFirstLastMiddle {
    public int getLargestValue(int[] array){
        //find the largest element between first, last and middle from array
        int temp = 0;
        //to get the values at odd positions, increment the value using even number
        for (int i = 0; i<array.length;i+=2){
            if (array[i]>temp){
                temp = array[i];
            }
        }
        return temp;
    }
    public int getLargestValueUsingStream(int[] array){
        int result = IntStream.range(0,array.length).filter(i-> i%2==0).map(i->array[i]).max().orElse(0);
        return result;
    }
    public static void main(String[] args) {
        int[] array = {20, 30, 40, 50, 67};
        System.out.println("Original Array: "+ Arrays.toString(array));
        LargestOfFirstLastMiddle objLargestOfFirstLastMiddle = new LargestOfFirstLastMiddle();
        System.out.println("Largest element between first, last, and middle values: "
                +objLargestOfFirstLastMiddle.getLargestValue(array));
        //using stream
        System.out.println("Using stream : "+objLargestOfFirstLastMiddle.getLargestValueUsingStream(array));
    }
}
