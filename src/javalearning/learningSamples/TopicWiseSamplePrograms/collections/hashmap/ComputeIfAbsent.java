package javalearning.learningSamples.TopicWiseSamplePrograms.collections.hashmap;

import java.util.HashMap;

public class ComputeIfAbsent {
    public static void main(String[] args) {
        HashMap<Integer,Integer> numbers = new HashMap<>();
        numbers.put(1,100);
        numbers.put(2,200);
        System.out.println(numbers);
        // compute if absent
        numbers.computeIfAbsent(2,(val) -> val + 100);
        numbers.computeIfAbsent(3, (value) -> 300);
        System.out.println(numbers);
    }
}
