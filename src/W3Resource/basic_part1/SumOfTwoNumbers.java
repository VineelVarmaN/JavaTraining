package W3Resource.basic_part1;

public class SumOfTwoNumbers {
    public int getSumOfTwoNumbers(int first, int second){
        return first + second;
    }

    public static void main(String[] args) {
        int first = 74;
        int second = 36;
        SumOfTwoNumbers objSumOfTwoNumbers = new SumOfTwoNumbers();
        System.out.println(objSumOfTwoNumbers.getSumOfTwoNumbers(first,second));
    }
}
