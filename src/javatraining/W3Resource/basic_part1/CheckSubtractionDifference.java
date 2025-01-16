package javatraining.W3Resource.basic_part1;

public class CheckSubtractionDifference {
    public boolean validateSubtractionDifference(int first, int second, int third){
        if (first <= 0|| second <= 0 ||third <= 0){
            System.out.println("Input param is missing");
        }
        if (Math.abs(second-first) >= 20|| Math.abs(third-second) >= 20|| Math.abs(third-first) >= 20){
            return true;
        }
    return false;
    }


    public static void main(String[] args) {
        int first = 15;
        int second = 20;
        int third = 25;
        CheckSubtractionDifference objCheckSubtractionDifference = new CheckSubtractionDifference();
        System.out.println(objCheckSubtractionDifference.validateSubtractionDifference(first, second, third));
    }
}
