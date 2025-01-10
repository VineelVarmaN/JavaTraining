package javatraining.learningSamples.TopicWiseSamplePrograms.collections.linkedlist;

import java.util.LinkedList;

public class RemoveElements {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        //add nodes to list
        list.add("Vineel");
        list.add("Varma");
        list.add("Nemmani");
        list.add("linga");
        list.add("Nagamani");
        list.add("gopaiah");
        list.add("dhanama");
        System.out.println("The nodes in the list : "+list);
        //create a new Linked List
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Kotaiah");
        list1.add("Swathi");
        list1.add("lingama");
        list1.add("shirisha");
        System.out.println("The elements in the list1 : "+list1);
        //remove specific element from list
        list.remove("gopaiah");
        System.out.println("The elements in the list after removing specific element : "+list);
        //remove element on the basis of specific position
        list.remove(5);
        System.out.println("The elements in the list after removing element from specific position : "+list);
        //adding elements from one list to another list
        list.addAll(list1);
        System.out.println("The elements after adding list1 elements into list : "+list);
        //removing all new elements from the list
        list.removeAll(list1);
        System.out.println("The elements in list after removing list1 elements : "+list);
        //remove first element from the list
        list.removeFirst();
        System.out.println("The elements in the list after removing first element using remove first : "+list);
        //remove last element from the list
        list.removeLast();
        System.out.println("The elements in the list after removing last element using remove last : "+list);
        list.add("Varma");
        //remove first occurrence of element from list
        list.removeFirstOccurrence("Varma");
        System.out.println("The first occurrence of given element will be removed : "+list);
        list.add(0,"linga");
        //remove last occurrence of given element from list
        list.removeLastOccurrence("linga");
        System.out.println("The last occurrence of given element will be removed form list : "+list);
        //print all the elements
        for (String names: list){
            System.out.println(names);
        }
    }
}
