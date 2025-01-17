package javalearning.learningSamples.TopicWiseSamplePrograms.Lambda;

import java.util.Arrays;
import java.util.List;

public class AllMatchAnyMatch {
    public static void main(String[] args) {
        List<String> namesList = Arrays.asList("Reflection", "Collection", "Stream", "Structure", "Sorting", "State");
        //print all matched elements
        boolean allMatchElements = namesList.stream().allMatch(name->name.contains("e"));
        System.out.println(allMatchElements);
        //any match elements which starts with S
        boolean anyMatchElements1 = namesList.stream().anyMatch(name->name.startsWith("S"));
        System.out.println(anyMatchElements1);
        //all match elements which starts with S
        List<String> filteredList = namesList.stream().filter(name->name.startsWith("S")).toList();
        boolean allMatchElements2 = filteredList.stream().allMatch(name->name.startsWith("S"));
        System.out.println(allMatchElements2);
    }
}
