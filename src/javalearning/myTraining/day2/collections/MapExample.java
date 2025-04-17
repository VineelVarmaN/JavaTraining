package javalearning.myTraining.day2.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * It stores elements in Key, Value pair.
 * The keys should be unique. values can be duplicated
 * If we insert value with duplicate key, it will try to replace the existing value.
 */
public class MapExample {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Java");
        map.put(2,"Git");
        map.put(3,"Maven");
        //print the elements in map
        System.out.println("The map : "+map);

        //changing element value for a key
        map.put(2,"GitHub");
        System.out.println("The map : "+map);

        //removing the element with the help of key from Java HashMap
        map.put(4,"Spring");
        map.remove(3);
        System.out.println("The map : "+map);

        //removing the element value with the help of key and value
        map.remove(2,"GitHub");
        System.out.println("The map : "+map);

    }
}
