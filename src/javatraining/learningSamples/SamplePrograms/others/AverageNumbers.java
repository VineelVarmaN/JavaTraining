package javatraining.learningSamples.SamplePrograms.others;

import java.util.Arrays;
import java.util.List;

public class AverageNumbers {
    public static void main(String[] args) {
        averageNumbersWithStream();
        int[] input = {1, 2, 3, 4, 5, 6};
        int avgNums = input.length;
        float output = 0;
        for (int i : input){
            output = output + i;
        }
        System.out.println(output);
        System.out.println("AVERAGE IS: " + (output/avgNums));
    }
    public static void averageNumbersWithStream(){
        List<Integer> input1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        float output1 = (float)(input1.stream().reduce(0,(firstElement, secondElement) -> firstElement + secondElement))/ input1.size();
        System.out.println("AVERAGE1 IS: " + output1);
    }
}
