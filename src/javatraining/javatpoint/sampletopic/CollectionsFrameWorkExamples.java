package javatraining.javatpoint.sampletopic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionsFrameWorkExamples {
    public static void main(String[] args) {
        //ArrayList to store duplicate values
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        System.out.println("The list of values are : " + list);
        System.out.println(list.get(1)); //to get value at given index
        System.out.println(list.getFirst()); //to get first value
        System.out.println(list.getLast()); //to get last value
        System.out.println(list.indexOf(1)); //to get the index value
        //iterator to iterate the values in ArrayList
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        //HashSet to store unique values
        HashSet<Integer> set = new HashSet<>();
        set.add(29);
        set.add(24);
        set.add(29);
        System.out.println(set); //to get all values in set
        System.out.println(set.size()); //to get size of the set
        //iterator to iterate the values in HashSet
        Iterator<Integer> itr1 = set.iterator();
        while (itr1.hasNext()){
            System.out.println(itr1.next());
        }
        //HashMap to store key value pair
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Vineel", 29);
        map.put("Varma", 33);
        map.put("Swathi", 35);
        System.out.println(map);
        System.out.println(map.get("Vineel"));
        System.out.println(map.containsKey("Vineel"));
    }
}
