package takeYouForward.baisctopics.recursion;

import java.util.Scanner;

public class SumOfNNaturalNumbers {
    public static final Scanner SCANNER = new Scanner(System.in);
    public int FactorialNumber(int n){
        if (n==0){
            return 1;
        }
        return n * FactorialNumber(n-1);
    }

    public static void main(String[] args) {
        int n = SCANNER.nextInt();
        SumOfNNaturalNumbers sumOfNNaturalNumbersObj = new SumOfNNaturalNumbers();
        System.out.println(sumOfNNaturalNumbersObj.FactorialNumber(n));
    }
}
