package takeYouForward.baisctopics.basicMaths;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GCDOfTwoNumbers {
    private static final Scanner SCANNER = new Scanner(System.in);

    public int GCD(int n1, int n2){
        int temp =0;
        int max = Math.max(n1, n2);
        int min = Math.min(n1, n2);
        while (min>0){
            temp = max%min;
            max=min;
            min=temp;
        }
       return max;
    }

    public static void main(String[] args) {
        int n1 = SCANNER.nextInt();
        int n2 = SCANNER.nextInt();
        GCDOfTwoNumbers gcdOfTwoNumbersObj = new GCDOfTwoNumbers();
        System.out.println(gcdOfTwoNumbersObj.GCD(n1,n2));
    }
}
