package takeYouForward.baisctopics.recursion;

import java.util.Scanner;

public class SumOfFirstNNumbers {
    public static final Scanner SCANNER = new Scanner(System.in);
    public int NumbersSum(int N){
      if (N==0){
          return 0;
      }
       return N + NumbersSum(N-1);
    }
    public static void main(String[] args) {
        int n = SCANNER.nextInt();
        SumOfFirstNNumbers sumOfFirstNNumbersObj = new SumOfFirstNNumbers();
        System.out.println(sumOfFirstNNumbersObj.NumbersSum(n));
    }
}
