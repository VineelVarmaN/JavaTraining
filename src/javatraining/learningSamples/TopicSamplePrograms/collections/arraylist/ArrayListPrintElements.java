package javatraining.learningSamples.TopicSamplePrograms.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPrintElements {
    public void printTheArrayList(){
        ArrayList<String> list = new ArrayList<>();
        //add() - will add element to array list
        list.add("Vineel");
        list.add("Varma");
        //print the array list with all the elements
        System.out.println("The Array list is : "+list);
    }
    public void iteratingArrayListUsingIterator(){
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Vineel");
        nameList.add("Varma");
        nameList.add("Nemmani");
        //iterate the list using iterator
        Iterator<String> itr = nameList.iterator();
        //using while loop for iteration to check if there is next element in list
        while (itr.hasNext()){
            //print elements one after another till the list gets completed.
            System.out.println("The elements in the name list : "+itr.next());
        }
    }
    public void iterateTheArrayListUsingForEachMethod(){
        ArrayList<String> surNameList = new ArrayList<>();
        surNameList.add("Vuppala");
        surNameList.add("Nemmani");
        //iterate the list using for-each
        for (String surnames: surNameList){
            System.out.println("The surnames elements are : "+surnames);
        }
    }
    public void iterateTheArrayListUsingFor(){
        ArrayList<String> familyNamesList = new ArrayList<>();
        familyNamesList.add("Vineel");
        familyNamesList.add("Varma");
        familyNamesList.add("Nemmani");
        familyNamesList.add("Swathi");
        familyNamesList.add("Vuppala");
        //can iterate the array list using for loop with the list size()
        System.out.println("The size of the array list : "+familyNamesList.size());
        for (int i=0; i<familyNamesList.size(); i++){
            System.out.println(familyNamesList.get(i));
        }
    }
    public static void main(String[] args) {
        ArrayListPrintElements objArrayListExamples = new ArrayListPrintElements();
        objArrayListExamples.printTheArrayList();
        objArrayListExamples.iteratingArrayListUsingIterator();
        objArrayListExamples.iterateTheArrayListUsingForEachMethod();
        objArrayListExamples.iterateTheArrayListUsingFor();
    }
}
