package javalearning.learningSamples.TopicWiseSamplePrograms.collections.arraylist;

import java.util.ArrayList;

public class RemoveElementsInArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Vineel");
        list.add("Varma");
        list.add("Nemmani");
        list.add("Lingaswamy");
        list.add("Nagamani");
        System.out.println("The elements in list : "+list);
        //remove element from array list
        list.remove("Lingaswamy");
        System.out.println("The elements after removing linga swamy from the list : "+list);
        //remove element according to index position
        list.remove(3);
        System.out.println("The elements after removing Nagamani as well from list : "+list);
        //remove element according to specified condition
        list.removeIf(a->a.contains("Nemmani"));
        System.out.println("The elements after removing according to specified condition from list : "+list);

        //create a new array list
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Gopaiah");
        list1.add("Dhanama");
        System.out.println("The elements in the list1 : "+list1);
        //adding list1 to list
        list.addAll(list1);
        System.out.println("The elements after adding list1 to list : "+list);
        //removing the list from another list
        list.removeAll(list1);
        System.out.println("The elements after removing list1 elements from list : "+list);
    }
}
