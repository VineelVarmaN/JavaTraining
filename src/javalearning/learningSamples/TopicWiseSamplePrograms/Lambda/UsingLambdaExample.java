package javalearning.learningSamples.TopicWiseSamplePrograms.Lambda;

import java.util.Arrays;
import java.util.List;

public class UsingLambdaExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        numbers.forEach(number-> System.out.println(number +" "));
        System.out.println();
        //Using map and reduce to calculate the sum of squares
        int sumOfSquares = numbers.stream().map(n -> n * n).reduce(0, Integer::sum);
        System.out.println(sumOfSquares);
        //using filter to get even numbers
        List<Integer> evenNumber = numbers.stream().filter(n -> n % 2 == 0).toList();
        System.out.println(evenNumber);
    }
}
