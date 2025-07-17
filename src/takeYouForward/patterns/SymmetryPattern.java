package takeYouForward.patterns;

import java.util.Scanner;

/**
 * Sam is curious about symmetric patterns, so he decided to create one.
 * For every value of ‘N’, return the symmetry as shown in the example.
 * Example:
 * Input: ‘N’ = 3
 * Output:
 * *         *
 * * *     * *
 * * * * * * *
 * * *     * *
 * *         *
 */
public class SymmetryPattern {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        int n = SCANNER.nextInt();
        //for rows
        for (int i = 0; i<n; i++){
            //for spaces
            for (int j = 0; j<=i; j++){
                System.out.print("*"+" ");
            }
            //for stars
            for (int j = 0; j<2*n-(2*i+2); j++){
                System.out.print(" "+" ");
            }
            //for spaces
            for (int j = 0; j<=i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for (int i = 0; i<n-1; i++){
            //for spaces
            for (int j = 0; j<n-i-1; j++){
                System.out.print("*"+" ");
            }
            //for stars
            for (int j = 0; j<2*i+2; j++){
                System.out.print(" "+" ");
            }
            //for spaces
            for (int j = 0; j<n-i-1; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
