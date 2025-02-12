package javapractice.W3Resource.basic_part1;

import java.util.stream.IntStream;

public class CheckTenExceedsTwentyInArray {
    public static boolean checkCountOfTenInArray(int[] numbers, int number){
        int count = 0;
        //iterate the array till the array length
        for (int i = 0; i<numbers.length; i++){
            //check array element matches with number
            if (numbers[i]==number){
                count++;
            }
        }
        System.out.println(count);
        //check if count exceeds 20
        if (count>20){
            return true;
        }
        return false;
    }
    public static boolean checkCountOfTenInArrayUsingStream(int[] numbers, int number){
        long count = IntStream.range(0,numbers.length).filter(i->numbers[i]==number).count();
        return count>20;
    }
    public static void main(String[] args) {
        int[] numbers = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        int number = 10;
        System.out.println(checkCountOfTenInArray(numbers,number));
        System.out.println(checkCountOfTenInArrayUsingStream(numbers,number));
    }
}
