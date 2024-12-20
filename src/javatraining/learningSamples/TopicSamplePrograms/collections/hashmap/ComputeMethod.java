package javatraining.learningSamples.TopicSamplePrograms.collections.hashmap;

import java.util.HashMap;

public class ComputeMethod {
    public static void main(String[] args) {
        HashMap<Integer,String> names = new HashMap<>();
        names.put(1,"Vineel");
        names.put(2,"Varma");
        System.out.println(names);
        //compute the value for a key
        names.compute(1, (key,value)-> "Nemmani");
        System.out.println(names);
    }
}
