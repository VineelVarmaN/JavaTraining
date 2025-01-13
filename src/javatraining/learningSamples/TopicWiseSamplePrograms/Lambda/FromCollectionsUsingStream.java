package javatraining.learningSamples.TopicWiseSamplePrograms.Lambda;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class FromCollectionsUsingStream {
    public static void main(String[] args) {
        //list of string names
        List<String> namesList = Arrays.asList("Java","J2EE","Spring","Git","Java");
        System.out.println("names from list");
        namesList.stream().forEach(System.out::println);
        //set of string names
        Set<String> namesSet = new HashSet<>(namesList);
        System.out.println("names from set");
        namesSet.stream().forEach(System.out::println);
    }
}
