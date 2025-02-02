package javapractice.W3Resource.basic_part1;

import java.util.stream.IntStream;

public class TwentyAppearsThriceNonConsecutively {
    public static boolean checkTwentyAppearsThrice(int[] numbers, int number){
        int twentyNumberCount = 0;
        //check if twenty appears three times in number array
        for (int i = 0; i<numbers.length; i++){
            if (numbers[i]==number){
                twentyNumberCount ++;
                //check if no 20's are next to each other
                if (i<numbers.length-1 && numbers[i] == numbers[i+1]){
                    return false;
                }
            }
        }
       return twentyNumberCount==3;
    }
    public boolean checkTwentyAppearsThriceUsingStream(int[] numbers, int number){
        long twentyCount = IntStream.range(0, numbers.length).filter(i-> numbers[i]==number).count();
        boolean checkSameNextNumbers = IntStream.range(0, numbers.length-1).anyMatch(i->numbers[i] != numbers[i+1]);
        return twentyCount==3 && checkSameNextNumbers;
    }
    public static void main(String[] args) {
        int number = 20;
        int[] numbers = {5,10,15,20,25,20,30,20,35};
        System.out.println(checkTwentyAppearsThrice(numbers, number));
        System.out.println("Using stream : "+checkTwentyAppearsThrice(numbers, number));
    }
}
