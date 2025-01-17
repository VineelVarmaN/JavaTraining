package javalearning.learningSamples.TopicWiseSamplePrograms.stream_examples;

import java.util.Arrays;
import java.util.List;

public class Count {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9);
        long countValue = numberList.stream().filter(n->n%2==0).count();
        System.out.println(countValue);
    }
}
