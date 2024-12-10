package javatraining.javatpoint.arrays;

import java.util.HashMap;

public class PrintFrequencyOfEachElementInArray {
    public static void main(String[] args) {
        int[] input = {1,2,8,3,2,2,2,5,1};
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (int i =0; i<input.length;i++){
            int count = 0;
            for (int j= input.length -1; j< input.length && j>=0;j--){
                if (input[i] == input[j]) {
                    count++;
                    frequency.put(input[i], count);
                }
            }
        }
        System.out.println(frequency);
    }
}
