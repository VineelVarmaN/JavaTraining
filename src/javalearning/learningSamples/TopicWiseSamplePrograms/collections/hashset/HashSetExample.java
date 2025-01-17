package javalearning.learningSamples.TopicWiseSamplePrograms.collections.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Vineel");
        names.add("Varma");
        names.add("Nemmani");
        names.add("Swathi");
        System.out.println(names);
        Iterator<String> itr = names.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
