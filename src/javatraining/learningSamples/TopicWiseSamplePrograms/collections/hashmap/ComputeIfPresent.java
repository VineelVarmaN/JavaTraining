package javatraining.learningSamples.TopicWiseSamplePrograms.collections.hashmap;

import java.util.HashMap;

public class ComputeIfPresent {
    public static void main(String[] args) {
        HashMap<Integer,String> names = new HashMap<>();
        names.put(1,"Vineel");
        names.put(2,"Varma");
        System.out.println(names);
        //compute if present
        names.computeIfPresent(1,(key,value)->"Nemmani");
        System.out.println(names);
    }
}
