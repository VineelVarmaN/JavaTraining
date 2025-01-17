package javapractice.W3Resource.basic_part1;

public class SumOfTwoNumberMatchThirdNumber {
    public boolean twoNumbersMatchThirdNumber(int n1, int n2, int n3){
        //add two numbers
        int temp= n1 + n2;
        //if two numbers match given third number
        if (temp == n3){
            //return true
            return true;
        }
        return false;
    }
    public boolean thirdNumberGreaterThanSecondNumberGreaterThanFirst(int n1, int n2, int n3){
        //if third number greater than second number and second number greater than first number return true.
        if (n3>n2 && n2>n1){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        SumOfTwoNumberMatchThirdNumber objSumOfTwoNumberMatchThirdNumber = new SumOfTwoNumberMatchThirdNumber();
        System.out.println(STR."The result is: \{objSumOfTwoNumberMatchThirdNumber.twoNumbersMatchThirdNumber(5, 10, 15)}");
        System.out.println(STR."The result is: \{objSumOfTwoNumberMatchThirdNumber.thirdNumberGreaterThanSecondNumberGreaterThanFirst(5, 10, 15)}");
    }
}
