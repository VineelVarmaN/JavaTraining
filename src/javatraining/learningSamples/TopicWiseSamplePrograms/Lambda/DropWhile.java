package javatraining.learningSamples.TopicWiseSamplePrograms.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DropWhile {
        public static void main(String[] args) {
            List<Integer> list = Arrays.asList(2, 2, 3, 4, 5, 6, 7, 8, 9, 10);
            List<Integer> dropWhileList = list.stream().dropWhile(i -> (i % 2 == 0)).toList();
            System.out.println(dropWhileList);
        }
}
