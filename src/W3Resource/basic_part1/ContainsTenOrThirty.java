package W3Resource.basic_part1;

import java.util.stream.IntStream;

public class ContainsTenOrThirty {
    public static boolean checkArrayContainsTenOrThirty(int[] numbers){
        //iterate the array to get each element
        for (int i = 0; i< numbers.length; i++){
            //check if the array element matches with 10 or 30
            if (numbers[i]==10 || numbers[i]==30){
                return true;
            }
        }
        return false;
    }
    public static boolean checkArrayContainsTenOrThirtyUsingStream(int[] numbers){
        return IntStream.range(0, numbers.length).anyMatch(i->(numbers[i]==10 || numbers[i]==30));
    }
    public static void main(String[] args) {
        int[] numbers = {10,20,40,50,60,70};
        System.out.println(checkArrayContainsTenOrThirty(numbers));
        System.out.println("Using Stream : "+checkArrayContainsTenOrThirtyUsingStream(numbers));
    }
}
