package javaCoding.W3Resource.basic_part1;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesInSortedArray {

    public static HashSet<Integer> getUniqueSortedArray(int[] array){
        //create hash set
        HashSet<Integer> uniqueElements = new HashSet<>();
        //get each element and add to set
        for (int element: array){
            uniqueElements.add(element);
        }
        System.out.println("The length of unique array : "+uniqueElements.size());
        return uniqueElements;
    }
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7};
        System.out.println("The orginal array : "+Arrays.toString(array));
        System.out.println("The length of orginal array : "+array.length);
        System.out.println("The unique array : "+getUniqueSortedArray(array));
    }
}
