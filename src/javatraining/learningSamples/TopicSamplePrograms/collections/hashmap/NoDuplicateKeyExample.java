package javatraining.learningSamples.TopicSamplePrograms.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class NoDuplicateKeyExample {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Vineel");
        map.put(2,"Varma");
        map.put(3,"Nemmani");
        System.out.println(map);
        //iterating the values
        for (Map.Entry<Integer,String> name: map.entrySet()){
            System.out.println(name.getKey()+" : "+name.getValue());
        }
        map.put(3,"Swathi");
        System.out.println(map);
    }
}
