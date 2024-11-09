package com.JTraining;

public class ArrayExamples {
    public int minimumNumber(){
        int numbers[] = new int[5];
        int result = 0;
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 5;
        for (int num : numbers){
            if (result<num){
                result = num;

            }
        }
        System.out.println(result);
        System.out.println(numbers.length);
        return result;
    }

    public static void main(String[] args) {
    ArrayExamples objRefArray = new ArrayExamples();
    objRefArray.minimumNumber();
    }
}
