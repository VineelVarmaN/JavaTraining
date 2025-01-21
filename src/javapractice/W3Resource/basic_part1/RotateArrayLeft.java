package javapractice.W3Resource.basic_part1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class RotateArrayLeft {
    public String getRotatedArray(int[] array){
        //check array length is 3
        if (array.length==3){
            //check the array is rotated to left
            int temp = array[0];
            array[0] = array[1];
            array[1] = array[2];
            array[2] = temp;
        }
        return Arrays.toString(array);
    }
    public int[] getRotateArrayUsingStream(int[] array){
        int[] result = IntStream.concat(IntStream.of(array[1],array[2]),IntStream.of(array[0])).toArray();
        return result;
    }
    public static void main(String[] args) {
        int[] array = {20, 30, 40};
        System.out.println("Original Array: "+Arrays.toString(array));
        RotateArrayLeft objRotateArrayLeft = new RotateArrayLeft();
        System.out.println(objRotateArrayLeft.getRotatedArray(array));
        //using stream
        System.out.println("Using stream : "+Arrays.toString(objRotateArrayLeft.getRotateArrayUsingStream(array)));
    }
}
