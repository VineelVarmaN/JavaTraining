package javatraining.learningSamples.TopicWiseSamplePrograms.operations;

import java.util.ArrayList;

public class ReverseOrderNumbers {
    public static void main(String[] args) {
        int[] numberList = {12, 64, 23, 35,2, 67, 9, 11};
        int position = numberList.length-1;
        for (int i=position; i<numberList.length && i>=0; i--) {
            int result = numberList[i];
            ArrayList<Integer> reverseOrderList = new ArrayList<>();
            reverseOrderList.add(result);
            System.out.println(reverseOrderList);
        }
    }
}
