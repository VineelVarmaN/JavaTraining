package javatraining.learningSamples.TopicWiseSamplePrograms.operations;

public class SumOfDigitsOfANumber {
    public static void main(String[] args) {
        int input = 4356;
        int output = 0;
        String stringNumber = Integer.toString(input);
       for (int i = 0; i<stringNumber.length(); i++){
           int a=Character.getNumericValue(stringNumber.charAt(i));
           System.out.println("number at " + i +"is "+stringNumber.charAt(i));
          output = output + a;
           System.out.println("output  " + output);
       }
        System.out.println(output);
    }

}
