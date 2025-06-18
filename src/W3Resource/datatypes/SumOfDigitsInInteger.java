package W3Resource.datatypes;

import java.util.Scanner;

public class SumOfDigitsInInteger {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static int getSum(int number){
        int result = 0;
        if (number<0 && number>1000){
            System.out.println("Insufficient number");
        }
        String numberString = Integer.toString(number);
        for (int i = 0; i<numberString.length(); i++){
            result += Character.getNumericValue(numberString.charAt(i));
        }
        return result;
    }

    public static void main(String[] args) {
        int number = SCANNER.nextInt();
        System.out.println(getSum(number));
    }
}
