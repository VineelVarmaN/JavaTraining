package javalearning.learningSamples.TopicWiseSamplePrograms.collections.hashset;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetFromAnotherCollection {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Vineel");
        names.add("Varma");
        names.add("Nemmani");
        System.out.println("The array list elements : "+names);
        //using hash set for another collection
        HashSet<String> set = new HashSet<>(names);
        set.add("Swathi");
        System.out.println("The elements from set : "+set);
    }
}
