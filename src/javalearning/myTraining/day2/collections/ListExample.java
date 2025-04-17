package javalearning.myTraining.day2.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Java Collections Framework - provides set of classes and interfaces to handle data efficiently
 * key components include:
 *  1.  List(Ordered, allows duplicates)
 *  2.  Set(Unordered, no duplicates)
 *  3.  Map(Key-Value pair)
 *  4.  Record(Immutable data structure)
 */
//List - will maintain the order of elements in which they are added.
//it allows duplicate elements
//it can add Null values as well
public class ListExample {
    public static void main(String[] args) {
        //created an empty array list
        List<String> list = new ArrayList<>();
        //add elements to list
        list.add("Java");
        list.add("Git");
        list.add("Maven");
        list.add("Spring");
        //print the array list
        System.out.println("The list : "+list);
        //iterate the list and print elements
        for (String course : list){
            System.out.println(course);
        }

        //add element at certain index position
        list.add(1,"GitHub");
        System.out.println("The list : "+list);

        //update element for a certain index
        list.set(1,"Google");
        System.out.println("The list : "+list);

        //remove the element from list
        list.remove("Spring");
        System.out.println("The list : "+list);

        //remove the element from list by index
        list.remove(2);
        System.out.println("The list : "+list);
    }
}
