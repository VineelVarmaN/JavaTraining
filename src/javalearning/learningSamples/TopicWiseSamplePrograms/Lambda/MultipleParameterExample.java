package javalearning.learningSamples.TopicWiseSamplePrograms.Lambda;

interface FunctionalInterface{
    int operation(int x, int y);
}
public class MultipleParameterExample {
    public static void main(String[] args) {
        FunctionalInterface add = (a, b) -> a + b;
        FunctionalInterface multiply = (a, b) -> a * b;

        // Using the operations
        System.out.println(add.operation(6, 3));  // Output: 9
        System.out.println(multiply.operation(4, 5));
    }
}
