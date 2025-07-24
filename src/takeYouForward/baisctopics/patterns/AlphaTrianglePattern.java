package takeYouForward.baisctopics.patterns;

import java.util.Scanner;

/**
 * Sam is researching on Alpha-Triangles. So, he needs to create them for different integers ‘N’.
 * An Alpha-Triangle is represented by the triangular pattern of alphabets in reverse order.
 * For every value of ‘N’, help sam to print the corresponding Alpha-Triangle.
 * Example:
 * Input: ‘N’ = 3
 * Output:
 * C
 * C B
 * C B A
 */
public class AlphaTrianglePattern {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int n = SCANNER.nextInt();
        for (int i = 0; i<n; i++){
            //to get thr final alphabet according to input
            char ch = (char) ('A' + n-1);
            //for alphabets
            for (int j =0; j<=i; j++){
                System.out.print(ch-- +" ");
            }
            System.out.println();
        }
    }
}
