package takeYouForward.baisctopics.patterns;

import java.util.Scanner;

/**
 * Sam is curious about Alpha-Ramp, so he decided to create Alpha-Ramp of different sizes.
 *
 * An Alpha-Ramp is represented by a triangle, where alphabets are filled from the top in order.
 *
 * For every value of ‘N’, help sam to return the corresponding Alpha-Ramp.
 *
 * Example:
 * Input: ‘N’ = 3
 *
 * Output:
 * A
 * B B
 * C C C
 */
public class AlphaRamp {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        int n = SCANNER.nextInt();
        char k='A';
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
            k++;
        }
    }
}
