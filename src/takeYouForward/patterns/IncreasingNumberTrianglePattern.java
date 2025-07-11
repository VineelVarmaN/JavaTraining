package takeYouForward.patterns;

import java.util.Scanner;

/**
 * Aryan and his friends are very fond of patterns. For a given integer ‘N’, they want to make the Increasing Number Triangle.
 * Example:
 * Input: ‘N’ = 3
 * Output:
 * 1
 * 2 3
 * 4 5 6
 */
public class IncreasingNumberTrianglePattern {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        int n = SCANNER.nextInt();
        int k=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(k++ +" ");
            }
            System.out.println();
        }
    }
}
