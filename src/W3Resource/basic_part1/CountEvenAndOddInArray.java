package W3Resource.basic_part1;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CountEvenAndOddInArray {
    public static void getEvenAndOddCount(int[] numbers){
        //define even count and odd count variable
        int evenCount = 0;
        int oddCount = 0;
        //check how many even numbers will get and increase the count
        for (int i = 0; i<numbers.length; i++){
            if (numbers[i]%2==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.println("The even numbers count : "+evenCount);
        System.out.println("The odd numbers count : "+oddCount);
    }
    public static void getEvenAndOddCountUsingStream(int[] numbers){
        long evenCount = IntStream.range(0,numbers.length).filter(n->n%2==0).count();
        System.out.println("The even count : "+evenCount);
        long oddCount = IntStream.range(0,numbers.length).filter(n->n%2 !=0).count();
        System.out.println("The odd count : "+oddCount);
    }
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        System.out.println("The input numbers are : "+ Arrays.toString(numbers));
        getEvenAndOddCount(numbers);
        getEvenAndOddCountUsingStream(numbers);
    }
}
