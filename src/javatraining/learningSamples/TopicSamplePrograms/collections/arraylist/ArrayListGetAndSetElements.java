package javatraining.learningSamples.TopicSamplePrograms.collections.arraylist;

import java.util.ArrayList;

/**
 * create an array list
 * get the element from the list
 * modify existing element with another element using set
 */
public class ArrayListGetAndSetElements {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Vineel");
        list.add("Varma");
        list.add("Swathi");
        //get the element at particular index position
        System.out.println("The name from the list : "+list.get(0));
        //modify the element at given index position
        list.set(0,"Vinnu");
        System.out.println("The name from the list after modify : "+list.get(0));
        //printing all the elements from the list
        for (String nameList: list){
            System.out.println(nameList);
        }
    }
}
