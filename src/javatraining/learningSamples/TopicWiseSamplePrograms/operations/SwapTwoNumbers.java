package javatraining.learningSamples.TopicWiseSamplePrograms.operations;

public class SwapTwoNumbers {
    static void swappingNumbers(int a, int c){
        int b=a;
        System.out.println("b : " + b);
        a=c;
        System.out.println("a : " + a);
    }

    public static void main(String[] args) {
        swappingNumbers(10, 20);
    }
}
