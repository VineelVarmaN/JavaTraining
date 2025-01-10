package javatraining.learningSamples.TopicWiseSamplePrograms.collections.hashmap;

import java.util.HashMap;

public class RemoveElements {
    public void usingRemoveWithObjectKeyMethod(){
        HashMap<Integer,String> names = new HashMap<>();
        names.put(1,"Vineel");
        names.put(2,"Varma");
        names.put(3,"Nemmani");
        System.out.println(names);
        names.remove(3);
        System.out.println(names);
    }
    public void usingRemoveMethodWithKeyAndValue(){
        HashMap<Integer,String> names1 = new HashMap<>();
        names1.put(1,"Vineel");
        names1.put(2,"Varma");
        names1.put(3,"Nemmani");
        System.out.println(names1);
        names1.remove(2,"Varma");
        System.out.println(names1);
    }
    public void usingClear(){
        HashMap<Integer,String> names2 = new HashMap<>();
        names2.put(1,"Vineel");
        names2.put(2,"Varma");
        names2.put(3,"Nemmani");
        System.out.println(names2);
        names2.clear();
        System.out.println("The elements in names2 : "+names2);
    }

    public static void main(String[] args) {
        RemoveElements objRemoveElements = new RemoveElements();
        objRemoveElements.usingRemoveWithObjectKeyMethod();
        objRemoveElements.usingRemoveMethodWithKeyAndValue();
        objRemoveElements.usingClear();
    }
}
