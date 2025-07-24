package takeYouForward.baisctopics.patterns;

import java.util.Scanner;

/**
 * Sam is making a Triangular painting for a maths project.
 * An N-dimensional Triangle is represented by the lower triangle of the pattern filled with integers starting from 1.
 * For every value of ‘N’, help sam to print the corresponding N-dimensional Triangle.
 * Example:
 * Input: ‘N’ = 3
 * Output:
 * 1
 * 1 2
 * 1 2 3
 */
public class NTrianglePattern {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        int n = SCANNER.nextInt();
        for (int i = 1; i<n; i++){
            for (int j = 1; j<n; j++){
                if (j<=i){
                    System.out.print(j);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
