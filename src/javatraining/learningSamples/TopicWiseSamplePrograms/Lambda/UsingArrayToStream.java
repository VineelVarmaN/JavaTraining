package javatraining.learningSamples.TopicWiseSamplePrograms.Lambda;

import java.util.Arrays;
import java.util.stream.Stream;

public class UsingArrayToStream {
    public static void main(String[] args) {
        //String array creation with values
        String[] arr = {"a1","b1","c1","d1"};
        //convert array to stream
        Stream<String> arrayStream = Arrays.stream(arr);
        //iterate and print the elements
        arrayStream.forEach(System.out::println);
    }
}
