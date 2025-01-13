package javatraining.learningSamples.TopicWiseSamplePrograms.Lambda;

import java.util.stream.Stream;

public class StreamGenerate {
    public static void main(String[] args) {
        //will generate the random float numbers
        Stream<Double> randomNumbers = Stream.generate(Math::random);
        randomNumbers.limit(5).forEach(System.out::println);
    }
}
