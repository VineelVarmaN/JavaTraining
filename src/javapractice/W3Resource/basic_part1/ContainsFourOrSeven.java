package javapractice.W3Resource.basic_part1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class ContainsFourOrSeven {
    public boolean checkContainFourOrSeven(int[] array, int num1, int num2){
        //check given array of integers of length is 2
        if (array.length==2){
            //check whether array contains 4 or 7
            if ((array[0]==4 || array[0]==7) || (array[array.length-1]==4 || array[array.length-1]==7)){
                return true;
            }
        }
        return false;
    }
    public boolean checkContainFourOrSevenUsingStream(int[] array, int num1, int num2){
        boolean result = IntStream.of(array.length).allMatch(length->length==2 && (array[0]==4 || array[0]==7)
                || (array[array.length-1]==4 || array[array.length-1]==7));
        return result;
    }
    public static void main(String[] args) {
        int[] array = {5, 7};
        int num1 = 4;
        int num2 = 7;
        System.out.println(Arrays.toString(array));
        ContainsFourOrSeven objContainsFourOrSeven = new ContainsFourOrSeven();
        System.out.println(objContainsFourOrSeven.checkContainFourOrSeven(array, num1, num2));
        //using stream
        System.out.println("Using stream : "+objContainsFourOrSeven.checkContainFourOrSevenUsingStream(array,num1,num2));
    }
}
