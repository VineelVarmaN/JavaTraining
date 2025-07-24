package takeYouForward.baisctopics.patterns;

import java.util.Scanner;

/**
 * Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the N-Star Diamond.
 * Example:
 * Input: ‘N’ = 3
 * Output:
 *   *
 *  ***
 * *****
 * *****
 *  ***
 *   *
 */
public class StarDiamondPattern {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int n = SCANNER.nextInt();
        //for rows
        for (int i = 0; i<n; i++){
            //for spaces
            for (int j = 0; j<n-i-1; j++){
                System.out.print(" ");
            }
            //for stars
            for (int j = 0; j<2*i+1; j++){
                System.out.print("*");
            }
            //for spaces
            for (int j = 0; j<n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        //for bottom rows
        for (int i = 0;i<n; i++){
            //for spaces
            for (int j = 0; j<i; j++){
                System.out.print(" ");
            }
            for (int j=0; j<2*n-(2*i+1); j++){
                System.out.print("*");
            }
            for (int j = 0; j<i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
