package javatraining.learningSamples.TopicWiseSamplePrograms.Lambda;

import java.util.logging.Logger;
import java.util.stream.Stream;

public class StreamIterate {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(StreamIterate.class.getName());
        //iterate the values till the limit of the values is reached.
        Stream<Integer> numbers = Stream.iterate(1,n-> n+2);
        logger.info("The iterated values are : ");
        numbers.limit(5).forEach(System.out::println);
    }
}