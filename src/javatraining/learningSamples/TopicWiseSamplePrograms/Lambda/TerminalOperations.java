package javatraining.learningSamples.TopicWiseSamplePrograms.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TerminalOperations {
    public static void main(String[] args) {
        List<String> namesList = Arrays.asList("Reflection", "Collection", "Stream", "Structure", "Sorting", "State");
        //Print the filtered list string
        Optional<String> concatenatedString = namesList.stream().reduce((a, b)->a+" "+b);
        System.out.println("The concatenated string : "+concatenatedString.get());
        //Print the elements using for Each method
        List<String> filteredList = namesList.stream().filter(name->name.startsWith("S")).toList();
        filteredList.forEach(System.out::println);
        //get the count of filtered list
        long filteredListCount = filteredList.stream().count();
        System.out.println("The count of filtered list : "+filteredListCount);
        //print the first filtered element from list.
        Optional<String> firstFilteredString = filteredList.stream().findFirst();
        System.out.println("The first filtered string : "+firstFilteredString);
    }
}
