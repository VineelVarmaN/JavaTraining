package takeYouForward.baisctopics.patterns;

import java.util.Scanner;

/**
 * Sam is curious about symmetric patterns, so he decided to create one.
 * For every value of ‘N’, return the symmetry as shown in the example.
 * Example:
 * Input: ‘N’ = 3
 * Output:
 * * * * * * *
 * * *     * *
 * *         *
 * *         *
 * * *     * *
 * * * * * * *
 */
public class SymmetricVoidPattern {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int n = SCANNER.nextInt();
        //for top rows
        for (int i = 0; i<n; i++){
            //for stars
            for (int j = 0; j<n-i; j++){
                System.out.print("*"+" ");
            }
            //for spaces
            for (int j = 0; j<2*i; j++){
                System.out.print(" "+" ");
            }
            //for stars
            for (int j = 0; j<n-i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for (int i = n-1; i<n && i>=0; i--){
            //for stars
            for (int j = 0; j<n-i; j++){
                System.out.print("*"+" ");
            }
            //for spaces
            for (int j = 0; j<2*i; j++){
                System.out.print(" "+" ");
            }
            //for stars
            for (int j = 0; j<n-i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
