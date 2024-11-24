package com.W3Resource.basic_part1;

public class AverageOfThreeNumbers {
    public double getAverage(int[] input){
        int inputLength = input.length;
        int sum =0;
        for (int i = 0; i<inputLength; i++){
            sum += input[i];
        }
        return (double)sum/inputLength;
    }

    public static void main(String[] args) {
        int[] input = {1,2,3};
        AverageOfThreeNumbers objAverageOfThreeNumbers = new AverageOfThreeNumbers();
        System.out.println(objAverageOfThreeNumbers.getAverage(input));
    }
}
