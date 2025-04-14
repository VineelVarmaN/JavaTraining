package W3Resource.basic_part1;

import java.util.stream.IntStream;

public class TenBeforeTwentyCheck {
    public static boolean checkTenBeforeTwenty(int[] numbers){
        boolean found10 = false;
        for (int i = 0; i<numbers.length-1; i++){
            if (numbers[i]==10){
                found10 = true;
            }
            if (found10 && numbers[i]==20){
                return true;
            }
        }
        return false;
    }
    public  static boolean checkTenBeforeTwentyUsingStream(int[] numbers){
        boolean found10 = IntStream.range(0, numbers.length).anyMatch(n->numbers[n]==10);
        boolean found20 = IntStream.range(0, numbers.length).anyMatch(n-> numbers[n]==20 && found10);
        return found20;
    }
    public static void main(String[] args) {
        int[] numbers = {0,5,10,15,18,20,25};
        System.out.println(checkTenBeforeTwenty(numbers));
        System.out.println(checkTenBeforeTwentyUsingStream(numbers));
    }
}
