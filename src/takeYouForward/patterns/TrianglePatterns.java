package takeYouForward.patterns;

import java.util.Scanner;

/**
 * Sam is making a Triangular painting for a maths project.
 * An N-dimensional Triangle is represented by the lower triangle of the pattern filled with integers representing the row number.
 * For every value of ‘N’, help sam to print the corresponding Triangle.
 * Example:
 * Input: ‘N’ = 3
 * Output:
 * 1
 * 2 2
 * 3 3 3
 */
public class TrianglePatterns {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        int n = SCANNER.nextInt();
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=i; j++){
                    System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
