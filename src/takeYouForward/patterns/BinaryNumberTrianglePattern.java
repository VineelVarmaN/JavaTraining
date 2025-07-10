package takeYouForward.patterns;

import java.util.Scanner;

/**
 * Aryan and his friends are very fond of the pattern. For a given integer ‘N’, they want to make the N-Binary Number Triangle.
 * You are required to print the pattern as shown in the examples below.
 * Example:
 * Input: ‘N’ = 3
 * Output:
 * 1
 * 0 1
 * 1 0 1
 */
public class BinaryNumberTrianglePattern {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int n = SCANNER.nextInt();
        int start;
        //for rows
        for (int i = 0; i<n; i++){
            if (i%2==0){
                start=1;
            }
            else start=0;
            for (int j = 0; j<=i; j++){
                System.out.print(start);
                start=1-start;
            }
            System.out.println();
        }
    }
}
