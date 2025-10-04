package javaCoding.W3Resource.basic_part1;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;

public class ArrayBeforeLastTen {
    public static int[] getArrayBeforeLastTen(int[] numbers1, int number){
        int indexValueOfLastTen = 0;
        //get the index value of last ten element from array
        for (int i = numbers1.length-1; i< numbers1.length && i>0; i--){
            if (numbers1[i]==number){
                indexValueOfLastTen = i;
            }
        }
        System.out.println("Last ten value index : "+indexValueOfLastTen);
        //create the array from old array with starting index length and end index length
        int[] newArray1 = Arrays.copyOfRange(numbers1,0,indexValueOfLastTen);
        return newArray1;
    }
    public static int[] getArrayBeforeLastTenUsingStream(int[] numbers1, int number){
        int indexValueOfTen = IntStream.range(0,numbers1.length).filter(n-> numbers1[n]==number)
                .findFirst().orElseThrow(()-> new NoSuchElementException("No element matched the criteria"));
        int[] newArray2 = Arrays.copyOfRange(numbers1,0,indexValueOfTen);
        return newArray2;
    }
    public static void main(String[] args) {
        int[] numbers1 = {11, 15, 13, 10, 45, 10, 33, 53};
        int number = 10;
        System.out.println(Arrays.toString(numbers1));
        System.out.println("\n The new Array is : "+Arrays.toString(getArrayBeforeLastTen(numbers1, number)));
        System.out.println("Using stream : "+Arrays.toString(getArrayBeforeLastTenUsingStream(numbers1,number)));
    }
}
