package takeYouForward.patterns;

import java.util.Scanner;

/**
 * Aryan and his friends are very fond of the pattern. They want to make the Reverse N-Number Crown for a given integer' N'.
 * Given 'N', print the corresponding pattern.
 * Example:
 * Input: ‘N’ = 3
 * Output:
 * 1         1
 * 1 2     2 1
 * 1 2 3 3 2 1
 */
public class NumberCrownPattern {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        int n = SCANNER.nextInt();
        //for rows
        for (int i =1; i<=n; i++){
            //for numbers
            for (int j = 0; j<i; j++){
                System.out.print(j+1+" ");
            }
            //for spaces
            for (int j = 0; j<=2*n-(2*i+2); j++){
                System.out.print(" ");
            }
            //for numbers
            for (int j=i; j>0; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
