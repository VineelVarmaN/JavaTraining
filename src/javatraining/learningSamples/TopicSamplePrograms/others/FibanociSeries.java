package javatraining.learningSamples.TopicSamplePrograms.others;

/**
 * need to add two numbers
 * take a number as 0
 * iterate the second number using for loop
 * print the output
 */
public class FibanociSeries {

    static void fibanociSeriesLogic(int limit){
        int num1 = 0, num2 = 1, num3;
        for (int i = 1; i<=limit; i++){
            num3 = num1 + num2;
            System.out.print(num3 + ",");
            num1 = num2;
            num2 = num3;
        }
    }

    public static void main(String[] args) {
        fibanociSeriesLogic(10);
    }
}
