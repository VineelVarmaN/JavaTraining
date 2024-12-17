package javatraining.learningSamples.TopicSamplePrograms.collections.arraylist;

import java.util.ArrayList;

public class AddElementsInArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //add elements to array list
        list.add("Vineel");
        list.add("LingaSwamy");
        list.add("Nagamani");
        System.out.println("The element in list : "+list);
        //create another list
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Kotaiah");
        list1.add("Mrs.Kotaiah");
        list1.add("Swathi");
        System.out.println("The elements in list1 : "+list1);
        //adding a element in to array list at certain index position
        list1.add(3,"shirisha");
        System.out.println("The elements in list1 after adding a new person : "+list1);
        //adding one array list into another array list at backend
        list.addAll(list1);
        System.out.println("After adding list1 in list : "+list);
        //adding array list at certain index position
        list.addAll(1,list1);
        System.out.println("After adding list1 to list at 1st index position : "+list);
    }
}
