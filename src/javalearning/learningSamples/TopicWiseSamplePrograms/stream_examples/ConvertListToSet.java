package javalearning.learningSamples.TopicWiseSamplePrograms.stream_examples;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ConvertListToSet {
    public static void main(String[] args) {
        //first create a list with all the duplicate values.
        List<Integer> numberList = Arrays.asList(1,2,3,4,5,4,3,2,1);
        //create a set by using stream() and map all the values and collect those values into set using collectors.
        Set<Integer> numberSet = numberList.stream().collect(Collectors.toSet());
        System.out.println("values from number set : "+numberSet);
        for (Integer number: numberSet){
            System.out.println("each values from numberset : "+number);
        }
    }
}
