package javatraining.learningSamples.SamplePrograms;

import java.util.ArrayList;
import java.util.List;

public class FactorsOfNumber {
    public static void main(String[] args) {
        int num = 28;
        List<Integer> output = new ArrayList<>();
        for (int i = 1; i<=num; i++){
            if (num % i == 0){
                output.add(i);
            }
        }
        System.out.println("factors of a given number : " + output);
    }
}
