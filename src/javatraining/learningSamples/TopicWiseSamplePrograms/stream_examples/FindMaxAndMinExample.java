package javatraining.learningSamples.TopicWiseSamplePrograms.stream_examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindMaxAndMinExample {
    public void getMaximumValue(List<Integer> numberList){
        Optional<Integer> max = numberList.stream().max(Integer::compareTo);
        max.ifPresent(n-> System.out.println("Maximum numbers from the list : "+n));
    }
    public void getMinimumValue(List<Integer> numberList){
        numberList.stream().min(Comparator.naturalOrder()).ifPresent(n-> System.out.println("Minimum numbers from the list : "+n));
    }

    public static void main(String[] args) {
        FindMaxAndMinExample objFindMaxAndMinExample = new FindMaxAndMinExample();
        List<Integer> numberList = Arrays.asList(10,20,30,40,50);
        for(Integer number : numberList){
            System.out.println(number);
        };
        objFindMaxAndMinExample.getMaximumValue(numberList);
        objFindMaxAndMinExample.getMinimumValue(numberList);
    }
}
