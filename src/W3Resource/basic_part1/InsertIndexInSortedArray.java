package W3Resource.basic_part1;

import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.stream.IntStream;

public class InsertIndexInSortedArray {
    public static int getIndexValue(int[] numbers, int number){
        //check if array is not null
        if (numbers==null){
            throw new InvalidParameterException("Array of number should not be null");
        }
        //sort the array
        Arrays.sort(numbers);
        if (number!=0) {
            //check if given number is present in array, return the index value of that number from array
            //if not present in array, return the size of array
            int foundNumber = IntStream.range(0, numbers.length).filter(n -> numbers[n] == number).findFirst().orElse(numbers.length);
            return foundNumber;
        }
        //if zero populate zero
        return 0;
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,4,5,6};
        int number = 7;
        System.out.println(Arrays.toString(numbers));
        System.out.println(getIndexValue(numbers,number));
    }
}
