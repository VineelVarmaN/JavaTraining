package javatraining.learningSamples.TopicWiseSamplePrograms.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyFindFirst {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("a1","b1","c1","d1","e1");
        Optional<String> findAnyElement = stringList.stream().filter(n->n.contains("c1")).findAny();
        System.out.println(findAnyElement.get());
        Optional<String> findFirstElement = stringList.stream().findFirst();
        System.out.println(findFirstElement.get());
    }
}
