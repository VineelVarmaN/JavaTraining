package javatraining.learningSamples.TopicWiseSamplePrograms.stream_examples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(10,20,30,40,50);
        Optional<Integer> totalSum = numberList.stream().reduce(Integer::sum);
        System.out.println(totalSum.get());
        numberList.stream().reduce(Integer::sum).ifPresent(System.out::println);
    }
}
