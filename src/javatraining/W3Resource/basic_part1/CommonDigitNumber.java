package javatraining.W3Resource.basic_part1;

public class CommonDigitNumber {
    public boolean checkCommonDigit(int first, int second){
        //check if first integer and second integer is present
        if (first<=0 || second<=0){
            System.out.println("Input parameters are missing");
        }
        if ((first>25 && first<75) && (second>25 && second<75)){
            //check if there is a common digit in both numbers.
            if (first%10 == second%10){
                System.out.println(first%10); //5
                System.out.println(second%10); //5
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int first = 35;
        int second = 45;
        CommonDigitNumber objCommonDigitNumber = new CommonDigitNumber();
        System.out.println(objCommonDigitNumber.checkCommonDigit(first, second));
    }
}
