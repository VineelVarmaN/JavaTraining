package javalearning.learningSamples.TopicWiseSamplePrograms.Lambda;

import java.util.Arrays;
import java.util.List;

public class TakeWhile {
    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(2,3,4,5,6,7,8);
        //take while - will take each element which matches the predicate and will stop if it gets failed.
        List<Integer> result = numbersList.stream().takeWhile(n->n%2==0).toList();
        result.forEach(System.out::println);
    }
}
