package W3Resource.basic_part1;

import java.security.InvalidParameterException;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CheckPowerOfFour {
    public static boolean checkPowerOfFour(int n){
        //(n-1)%3 == 0
        //check number should be positive
        if (n>0) {
            //check power of four
            if ((n-1)%3 == 0){
                return true;
            }
        }
        else {
            throw new InvalidParameterException("Input number should be positive");
        }
        return false;
    }
    public static boolean checkPowerOfFourUsingStream(int n){
        boolean result = IntStream.of(n).filter(num-> {
            if(num<0){
            throw new InvalidParameterException("Input number should be positive");
            }
        return true;
            }).anyMatch(num-> ((num-1)%3 == 0));
        return result;
    }
    public static void main(String[] args) {
        int n = 64;
        System.out.println(checkPowerOfFour(n));
        System.out.println("Using Stream : "+checkPowerOfFourUsingStream(n));
    }
}
