package javatraining.practice.SamplePrograms;


import java.util.Arrays;
import java.util.List;

public class HighestNumberExamples {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 15, -1, 23, 45, 70, 99, -13, -5);
        Integer maxNumber = input.stream().max(Integer :: compare).get();
        System.out.println("HIGHEST NUMBER: " + maxNumber);
        Integer minNumber = input.stream().min(Integer :: compare).get();
        System.out.println("LOWEST NUMBER: " + minNumber);
        int differenceNumber = maxNumber - minNumber;
        System.out.println(differenceNumber);
    }
}
