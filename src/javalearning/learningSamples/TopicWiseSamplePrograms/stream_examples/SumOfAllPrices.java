package javalearning.learningSamples.TopicWiseSamplePrograms.stream_examples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfAllPrices {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(10,20,30,40,50);
        Optional<Integer> sum = numberList.stream().reduce(Integer::sum);
        System.out.println(sum.get());
        //sum of all numbers using reduce method
        numberList.stream().reduce((a,b)->a+b).ifPresent(System.out::println);
    }
}
