package W3Resource.basic_part1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayAfterLastTen {
    public static int[] getArrayAfterLastTen(int[] oldArray){
            int indexValueOfTen = 0;
            //check the last occurrence of 10 from array
        for (int i = oldArray.length-1; i<oldArray.length && i>=0; i--){
            if (oldArray[i]==10){
                indexValueOfTen = i;
            }
        }
        //create a new array with the help of copyOf so that new array created from old array
        int[] newArray = Arrays.copyOf(oldArray, indexValueOfTen+1);
        int[] newArray1 = Arrays.copyOfRange(oldArray, indexValueOfTen+1, oldArray.length);
        System.out.println("Using copyOf : "+ Arrays.toString(newArray));
        System.out.println("Using copyOfRange : "+ Arrays.toString(newArray1));
        return newArray;
    }
    public static int[] getArrayAfterLastTenUsingStream(int[] oldArray){
        int[] newArray = IntStream.range(0, oldArray.length).filter(n-> n< oldArray.length && oldArray[n]==10).map(n-> oldArray[n+1]).toArray();
        return newArray;
    }
    public static void main(String[] args) {
        int[] oldArray= {1,5,10,15,20,25};
        System.out.println(Arrays.toString(getArrayAfterLastTen(oldArray)));
        System.out.println("Using Stream : "+ Arrays.toString(getArrayAfterLastTenUsingStream(oldArray)));
    }
}
