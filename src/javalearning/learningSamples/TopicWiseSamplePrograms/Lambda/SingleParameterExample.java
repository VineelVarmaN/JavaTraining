package javalearning.learningSamples.TopicWiseSamplePrograms.Lambda;

import java.util.ArrayList;
import java.util.List;

public class SingleParameterExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        numbers.forEach(n -> System.out.println(n));
    }
}
