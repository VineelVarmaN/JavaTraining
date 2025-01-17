package javalearning.learningSamples.TopicWiseSamplePrograms.collections.treeset;

import java.util.TreeSet;

public class NavigableSet {
    public static void main(String args[]){
        TreeSet<String> set=new TreeSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        //will return whole set
        System.out.println("Initial Set: "+set);
        //will return the set in descending order
        System.out.println("Reverse Set: "+set.descendingSet());
        //will return elements from start to till including C because C is true
        System.out.println("Head Set: "+set.headSet("C", true));
        //will return elements from B (because A = false) to till including E because E is true
        System.out.println("SubSet: "+set.subSet("A", false, "E", true));
        //will return elements after C (because C = false) to till end
        System.out.println("TailSet: "+set.tailSet("C", false));
    }
}
