package javapractice.W3Resource.basic_part1;

import java.util.*;
import java.util.stream.IntStream;

public class CheckAdjacent10sOr20s {
    public static boolean getCheckAdjacentValues(int[] integers){
        boolean found1010 = false;
        boolean found2020 = false;
        for (int i = 0; i< integers.length-1;i++){
            //check if an array of integers contains an element 10 and compare next element is 10
            if (integers[i]==10 && integers[i+1]==10){
                found1010 = true;
            }
            //check if an array of integers contains an element 20 and compare next element is 20
            if (integers[i]==20 && integers[i+1]==20){
                found2020 = true;
            }
        }
        return found1010 ^ found2020;
    }

    public static boolean getCheckAdjacentValuesUsingStream(int[] integers){
        boolean has10NextTo10 = IntStream.range(0, integers.length - 1)
                .anyMatch(i -> integers[i] == 10 && integers[i + 1] == 10);

        boolean has20NextTo20 = IntStream.range(0, integers.length - 1)
                .anyMatch(i -> integers[i] == 20 && integers[i + 1] == 20);

        return has10NextTo10 ^ has20NextTo20;
    }
    public static void main(String[] args) {
        int[] integers = {5,8,10,10,6,20,20};
        System.out.println(getCheckAdjacentValues(integers));
        System.out.println(getCheckAdjacentValuesUsingStream(integers));
    }
}
