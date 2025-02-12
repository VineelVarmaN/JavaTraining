package javapractice.W3Resource.basic_part1;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SpecifiedNumberInAdjacentPairs {
    public static boolean checkSpecifiedNumber(int[] numbers, int specificNumber){
        boolean specificNumberInEveryPair = true;
        //iterate the array
        for (int i = 0; i<numbers.length-1; i++){
            //check if the adjacent pairs has specific number
            if (numbers[i]!=specificNumber && numbers[i+1]!=specificNumber){
                specificNumberInEveryPair = false;
            }
        }
        return specificNumberInEveryPair;
    }
    public static boolean checkSpecificNumberUsingStream(int[] numbers, int specificNumber){
        boolean result = IntStream.range(0, numbers.length-1)
                .allMatch(i->numbers[i]!=specificNumber && numbers[i+1]!=specificNumber);
        return result;
    }
    public static void main(String[] args) {
        int[] numbers = {2,5,3,5,4,5,6};
        //get the user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the specific number : ");
        int specificNumber = scanner.nextInt();
        scanner.close();
        System.out.println(checkSpecifiedNumber(numbers, specificNumber));
        System.out.println("Using Stream : "+checkSpecifiedNumber(numbers, specificNumber));
    }
}
