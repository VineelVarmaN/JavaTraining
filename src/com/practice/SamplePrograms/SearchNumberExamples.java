package com.practice.SamplePrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SearchNumberExamples {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(34, 67, 81, 97, 45, 54, 90, 83);
        //number is present
        boolean result = numberList.stream().anyMatch(n -> n == 54);
        String numberIsPresent = (result ? "Given number is present in the list" : "Given number is not present in the list");
        System.out.println(numberIsPresent);
        //number is not present
        boolean result1 = numberList.stream().anyMatch(n -> n == 40);
        String numberIsNotPresent = (result1 ? "Given number is present in the list" : "Given number is not present in the list");
        System.out.println(numberIsNotPresent);
        //number position from list
       int input = 54;
       for (int result3: numberList){
           if (input == result3){
               System.out.println("Index of present number :" + numberList.indexOf(result3));
           }

       }

    }
}
