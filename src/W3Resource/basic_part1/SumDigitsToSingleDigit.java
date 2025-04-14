package W3Resource.basic_part1;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SumDigitsToSingleDigit {
    public static long getSumDigitsToSingleDigit( int number){
        long sumDigit = 0;
        //convert the number to string
        String numberString = Integer.toString(number);
        for (int i = 0; i<numberString.length(); i++){
            sumDigit += Character.getNumericValue(numberString.charAt(i));
        }
        return sumDigit;
    }
    public static long getSumDigitsToSingleDigitUsingStream(int number){
        String numberString = Integer.toString(number);
        long result = numberString.chars().map(Character::getNumericValue).sum();
        return result;
    }
    public static void main(String[] args) {
        int number = 12345;
        System.out.println(getSumDigitsToSingleDigit(number));
    }
}
