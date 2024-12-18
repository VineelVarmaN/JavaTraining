package javatraining.learningSamples.TopicSamplePrograms.collections.linkedlist;

import java.util.LinkedList;

public class AddElements {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        //add nodes to list
        list.add("Vineel");
        list.add("Varma");
        list.add("Nemmani");
        System.out.println("The nodes in the list : "+list);
        //add elements at particular position
        list.add(1,"Swathi");
        System.out.println("The elements in the list after addition : "+list);
        //create a new Linked List
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Vinnu");
        list1.add("Vinny");
        System.out.println("The elements in the list1 : "+list1);
        //adding list1 in list
        list.addAll(1,list1);
        System.out.println("The elements in the list after adding list1 : "+list);
        //add element to list at first using method
        list.addFirst("linga");
        System.out.println("The elements in the list after adding element using addFirst : "+list);
        //add element at the end in list
        list.addLast("NagaMani");
        System.out.println("The elements in the list after adding element at the end : "+list);
        //print all the elements
        for (String names: list){
            System.out.println(names);
        }
    }
}
