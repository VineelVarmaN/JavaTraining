package javalearning.learningSamples.TopicWiseSamplePrograms.Lambda;

import java.util.stream.Stream;

public class StreamBuilder {
    public static void main(String[] args) {
        //create a stream using stream builder
        Stream<Object> stringStream = Stream.builder().add("vineel").add("varma").add("nemmani").build();
        stringStream.forEach(System.out::println);
        //2nd option
        Stream.Builder<String> builder = Stream.builder();
        builder.add("apple").add("banana").add("cherry");
        Stream<String> stream = builder.build();
        stream.forEach(System.out::println);
    }
}
