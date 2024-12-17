package javatraining.learningSamples.TopicSamplePrograms.others;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseOrderNumbersExamples {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(12, 64, 23, 35,2, 67, 9, 11);
        List<Integer> output = input.stream().collect(Collectors.toList()).reversed();
        System.out.println(output);

    }
}
