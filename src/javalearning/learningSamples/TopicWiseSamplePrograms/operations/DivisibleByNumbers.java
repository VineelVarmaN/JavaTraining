package javalearning.learningSamples.TopicWiseSamplePrograms.operations;

import java.util.Arrays;
import java.util.List;

public class DivisibleByNumbers {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(34, 67, 81, 97, 45, 54, 90, 83);
        long numbersDivisibleByTwo = input.stream().filter(n -> n % 2==0).count();
        System.out.println("Count of numbers divisible by 2 :" + numbersDivisibleByTwo);
        long numbersDivisibleByThree = input.stream().filter(n -> n % 3==0).count();
        System.out.println("Count of numbers divisible by 3 :" + numbersDivisibleByThree);
        long numbersDivisibleByFive = input.stream().filter(n -> n % 5==0).count();
        System.out.println("Count of numbers divisible by 5 :" + numbersDivisibleByFive);
    }
}
