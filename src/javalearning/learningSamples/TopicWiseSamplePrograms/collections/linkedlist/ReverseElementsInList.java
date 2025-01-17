package javalearning.learningSamples.TopicWiseSamplePrograms.collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseElementsInList {
    public void reverseElementsUsingDescendingIterator(){
        LinkedList<String> list = new LinkedList<>();
        list.add("Vineel");
        list.add("Varma");
        list.add("Nemmani");
        System.out.println("The elements in the list : "+list);
        //reverse elements using descending iterator
        Iterator<String> itr = list.descendingIterator();
        while (itr.hasNext()){
            System.out.println("The reversed elements using descending iterator method : "+itr.next());
        }
    }
    public void reverseElementWithOutAnyMethod(){
        LinkedList<String> list = new LinkedList<>();
        list.add("Vineel");
        list.add("Varma");
        list.add("Nemmani");
        list.add("Swathi");
        System.out.println("The elements in the list : "+list);
        //reverse without using any method
        for (int i = list.size()-1; i< list.size() && i>=0; i--){
            System.out.println("The reversed elements with out using any method : "+list.get(i));
        }
    }

    public static void main(String[] args) {
        ReverseElementsInList objReverseElementsInList = new ReverseElementsInList();
        objReverseElementsInList.reverseElementsUsingDescendingIterator();
        objReverseElementsInList.reverseElementWithOutAnyMethod();
    }
}
