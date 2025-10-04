package javaCoding.W3Resource.basic_part1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LeftShiftArray {
    public static int[] getLeftShiftArray(int[] numbers){
        try{
            //check if array is not empty and has minimum one value
            if (numbers.length>1){
                int temp = numbers[0];
                //iterate the array and left shift the elements
                for (int i = 1; i< numbers.length; i++){
                    //assign values
                    numbers[i-1]=numbers[i];
                }
                numbers[numbers.length-1]=temp;
            }
            else{
                throw new IllegalArgumentException("Array is empty");
            }
        }catch (IllegalArgumentException ex){
            throw ex;
        }
        return numbers;
    }
    public static int[] getLeftShiftArrayUsingStream(int[] numbers1){
        int[] result;
        if (numbers1.length>1){
            int temp = numbers1[0];
            result = IntStream.concat(IntStream.of(Arrays.copyOfRange(numbers1,1,numbers1.length)),
                    IntStream.of(numbers1[numbers1.length-1]=temp)).toArray();

        }
        else {
            throw new IllegalArgumentException("Array is empty");
        }
        return result;
    }
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int[] numbers1 = {6,7,8,9,10};
        System.out.println("The numbers : "+ Arrays.toString(numbers));
        System.out.println(Arrays.toString(getLeftShiftArray(numbers)));
        System.out.println("Using stream : "+Arrays.toString(getLeftShiftArrayUsingStream(numbers1)));
    }
}
