package W3Resource.basic_part1;

import java.util.stream.IntStream;

public class GroupMatchStartAndEnd {
    //check if first element and last element are same
    //print if all the elements match return true
    public  static boolean checkGroupMatchStartAndEnd(int[] numbers){
        int unmatchedCount = 0;
        try{
            //check if the array length is even
            if (numbers.length%2 !=0){
                throw new IllegalArgumentException("Array length is not even");
            }
            //iterate and check if first and last name are not equal then increment the count by 1
            for (int i = 0; i<numbers.length;i++){
                if (numbers[i] !=numbers[numbers.length-1-i]){
                    unmatchedCount++;
                }
            }
            //check if unmatched count is greater than 1, return false
            if (unmatchedCount>0){
                return false;
            }
        }catch (IllegalArgumentException ex){
            throw ex;
        }
        return true;
    }
    public static boolean checkGroupMatchStartAndEndUsingStream(int[] numbers){
        boolean result = false;
        //check if the array is even length
        if (numbers.length%2==0){
            result = IntStream.range(0, numbers.length).allMatch(n->numbers[n]==numbers[numbers.length-1-n]);
        }
        else {
            throw new IllegalArgumentException("Array is not even");
        }
       return result;
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,2,1};
        System.out.println(checkGroupMatchStartAndEnd(numbers));
        System.out.println(checkGroupMatchStartAndEndUsingStream(numbers));
    }
}
