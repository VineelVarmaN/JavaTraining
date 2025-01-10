package javatraining.learningSamples.TopicWiseSamplePrograms.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExamples {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Vineel");
        map.put(2,"Varma");
        System.out.println(map);
        //iterate and print the values
        for (Map.Entry<Integer,String> names : map.entrySet()){
            System.out.println(names.getKey()+" : "+names.getValue());
        }
    }
}
