package javatraining.learningSamples.TopicWiseSamplePrograms.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class AddingElements {
    public void usingPutMethod(){
        HashMap<Integer,String> names = new HashMap<>();
        names.put(1,"Vineel");
        names.put(2,"Varma");
        names.put(3,"Nemmani");
        System.out.println(names);
        for (Map.Entry<Integer,String> name: names.entrySet()){
            System.out.println(name.getKey()+" : "+name.getValue());
        }
    }
    public void usingPutIfAbsentMethod(){
        HashMap<Integer,String> names1 = new HashMap<>();
        names1.putIfAbsent(1,"Vineel");
        names1.putIfAbsent(1,"Varma");
        names1.putIfAbsent(2,"Vineel");
        System.out.println(names1);
    }
    public void usingPutAllMethod(){
        HashMap<Integer,String> nemmanis = new HashMap<>();
        nemmanis.put(1,"Nemmani");
        nemmanis.put(2,"Vineel");
        System.out.println(nemmanis);
        HashMap<Integer,String> vuppala = new HashMap<>();
        vuppala.put(3,"Vuppala");
        vuppala.put(4,"Swathi");
        System.out.println(vuppala);
        //adding all elements from one map to another map
        nemmanis.putAll(vuppala);
        System.out.println(nemmanis);
    }

    public static void main(String[] args) {
        AddingElements objAddingElements = new AddingElements();
        objAddingElements.usingPutMethod();
        objAddingElements.usingPutIfAbsentMethod();
        objAddingElements.usingPutAllMethod();
    }
}
