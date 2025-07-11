package takeYouForward.patterns;

import java.util.Scanner;

/**
 * Aryan and his friends are very fond of patterns. For a given integer ‘N’, they want to make the Reverse Letter Triangle.
 * You must print a matrix corresponding to the given Reverse Letter Triangle.
 * Example:
 * Input: ‘N’ = 3
 * Output:
 * A B C
 * A B
 * A
 */
public class ReverseLetterTrianglePattern {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        int n = SCANNER.nextInt();
        for(int i=0;i<n;i++)
        {
            char k='A';
            for(int j=n-i;j<=n && j>0;j--)
            {
                System.out.print(k++ +" ");
            }
            System.out.println();
        }
    }
}
