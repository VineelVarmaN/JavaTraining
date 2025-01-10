package javatraining.learningSamples.TopicWiseSamplePrograms.collections.arraylist;

import java.util.ArrayList;

public class RetainAllMatchingElementsAndIsEmptyFromList {
    public void retainAllElements(){
        ArrayList<String> list = new ArrayList<>();
        list.add("SwathiVineel");
        list.add("Vineel");
        list.add("Nemmani");
        list.add("Varma");
        System.out.println("The elements in list : "+list);
        //create a new array list
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Vuppala");
        list1.add("Swathi");
        list1.add("SwathiVineel");
        list1.add("Varma");
        System.out.println("The elements in list1 : "+list1);
        //need only matched elements from both list using retainAll()
        list.retainAll(list1);
        for (String retainedElement: list){
            System.out.println("The retained element is : "+retainedElement);
        }
    }
    public void checkIsEmptyArrayList(){
        ArrayList<String> list2 = new ArrayList<>();
        System.out.println("Check if array list is empty : "+list2.isEmpty());
        list2.add("Vineel");
        System.out.println("Check if array list is empty after adding a element : "+list2.isEmpty());
    }
    public static void main(String[] args) {
        RetainAllMatchingElementsAndIsEmptyFromList objRetainAllMatchingElementsAndIsEmptyFromList = new RetainAllMatchingElementsAndIsEmptyFromList();
        objRetainAllMatchingElementsAndIsEmptyFromList.retainAllElements();
        objRetainAllMatchingElementsAndIsEmptyFromList.checkIsEmptyArrayList();
    }
}
