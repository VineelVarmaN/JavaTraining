package javatraining.learningSamples.TopicWiseSamplePrograms.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class IntermediateOperations {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(IntermediateOperations.class.getName());
        // List of lists of names
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Reflection", "Collection", "Stream"),
                Arrays.asList("Structure", "State", "Flow"),
                Arrays.asList("Sorting", "Mapping", "Reduction", "Stream")
        );
        //convert the list of list to single stream (flatMap), filter the stream with predicate and add the elements to list
        List<String> finalResult = listOfLists.stream().flatMap(List::stream).filter(word-> word.startsWith("S")).toList();
        finalResult.forEach(System.out::println);

        //print the elements without duplicate and also in sorted way which starts from s
        List<String> sortedAndDistinctValues = finalResult.stream().distinct().sorted().toList();
        logger.info("The sorted and distinct values are : ");
        sortedAndDistinctValues.forEach(System.out::println);
    }
}
