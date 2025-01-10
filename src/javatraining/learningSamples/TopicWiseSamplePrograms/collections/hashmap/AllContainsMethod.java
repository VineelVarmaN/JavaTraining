package javatraining.learningSamples.TopicWiseSamplePrograms.collections.hashmap;

import java.util.HashMap;

public class AllContainsMethod {
    public static void main(String[] args) {
        HashMap<Integer, Integer> numbers = new HashMap<>();
        numbers.put(1, 10);
        numbers.put(2, 20);
        numbers.put(3, 30);
        System.out.println(numbers);
        //contains key method
        System.out.println("map contains given key :: "+numbers.containsKey(1));
        //contains value method
        System.out.println("map contains given value :: "+numbers.containsValue(20));
    }
}
