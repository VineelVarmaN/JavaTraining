package javatraining.learningSamples.TopicSamplePrograms.collections.stack;

import java.util.Stack;

public class PushPopPeekAndIsEmptyExample {
    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();
        //check if stack is empty
        System.out.println("Check if stack is empty : "+numbers.isEmpty());
        //push the elements into stack
        for (int i = 1; i<5; i++){
            numbers.push(i);
            System.out.println(numbers);
        }
        System.out.println("Check if stack is empty : "+numbers.isEmpty());
        //remove the elements from stack
        int poppedNumbers = numbers.pop();
        System.out.println("after popping a element : "+poppedNumbers);
        System.out.println(numbers);
        //just read the last value from stack
        int lastNumber = numbers.peek();
        System.out.println("The last element : "+lastNumber);
        System.out.println(numbers);
        System.out.println(numbers.search(1));
    }
}
