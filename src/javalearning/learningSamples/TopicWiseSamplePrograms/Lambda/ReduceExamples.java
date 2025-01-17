package javalearning.learningSamples.TopicWiseSamplePrograms.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExamples {
    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(1,2,3,4,5);
        //print the sum of all the numbers from the list using operations symbol.
        int sumOfAllNumbers = numbersList.stream().reduce(0,(a,b)->a+b);
        System.out.println(sumOfAllNumbers);

        //print the sum of all odd numbers from the list using method reference
        int sumOfAllOddNumbers = numbersList.stream().filter(n-> n%2!=0).reduce(0,(a,b)->a+b);
        System.out.println(sumOfAllOddNumbers);

        //concatenate strings using stream API
        List<String> wordsList = Arrays.asList("Vineel","Varma","Nemmani","Swathi");
        Optional<String> concatenatedString = wordsList.stream().reduce((a, b)->a+b);
        concatenatedString.ifPresent(n-> System.out.println(n));

    }
}
