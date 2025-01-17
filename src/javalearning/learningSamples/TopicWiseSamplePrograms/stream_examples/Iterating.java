package javalearning.learningSamples.TopicWiseSamplePrograms.stream_examples;

import java.util.stream.Stream;

public class Iterating {
    public static void main(String[] args) {
        Stream.iterate(1, n-> n+1).filter(n-> n%2 == 0).limit(5).forEach(System.out::println);
    }
}
