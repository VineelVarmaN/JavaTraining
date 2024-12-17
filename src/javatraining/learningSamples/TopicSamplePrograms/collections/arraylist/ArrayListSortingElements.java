package javatraining.learningSamples.TopicSamplePrograms.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;

/**
 * create an Integer array list
 * add elements to the list
 * sort the elements in the list using collections.sort()
 */
public class ArrayListSortingElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(29);
        list.add(3);
        list.add(1998);
        //print the whole list
        System.out.println("The elements of list : "+list);
        //sort the list using collections.sort
        Collections.sort(list);
        System.out.println("The elements after sorting the list : "+list);
    }
}
