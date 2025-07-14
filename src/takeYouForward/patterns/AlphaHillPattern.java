package takeYouForward.patterns;

import java.util.Scanner;

/**
 * Sam is curious about Alpha-Hills, so he decided to create Alpha-Hills of different sizes.
 * An Alpha-hill is represented by a triangle, where alphabets are filled in palindromic order.
 * For every value of ‘N’, help sam to return the corresponding Alpha-Hill.
 * Example:
 * Input: ‘N’ = 3
 * Output:
 *     A
 *   A B A
 * A B C B A
 */
public class AlphaHillPattern {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int n = SCANNER.nextInt();
        //for rows
        for (int i = 0; i<n; i++){
            char c='A';
            //for spaces
            for (int j = 0; j<n-1-i; j++){
                System.out.print(" ");
            }
            //for alphabets
            for (int j = 0; j<2*i+1; j++){
                if (j<i){
                    System.out.print (c++);
                }else {
                    System.out.print(c--);
                }
            }
            //for spaces
            for (int j = 0; j<n-1-i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
