package W3Resource.methods;

import java.util.stream.IntStream;

public class SumOfDigitsInInteger {
    public static int addAllDigitsInInteger(int number){
        int result = 0;
        String number1 = Integer.toString(number);
        for (int i = 0; i<number1.length()-1; i++){
            result = Math.addExact(Character.getNumericValue(number1.charAt(i)),(Character.getNumericValue(number1.charAt(i+1))));
        }
        return result;
    }
    public static void main(String[] args) {
        int number = 25;
        System.out.println(addAllDigitsInInteger(number));
    }
}
