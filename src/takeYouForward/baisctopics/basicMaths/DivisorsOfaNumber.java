package takeYouForward.baisctopics.basicMaths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DivisorsOfaNumber {
    private static final Scanner SCANNER = new Scanner(System.in);
    public int[] divisors(int n){
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i<=n; i++){
            if (n%i==0){
                list.add(i);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
    public static void main(String[] args) {
        int n = SCANNER.nextInt();
        DivisorsOfaNumber divisorsOfaNumberObj = new DivisorsOfaNumber();
        System.out.println(Arrays.toString(divisorsOfaNumberObj.divisors(n)));
    }
}
