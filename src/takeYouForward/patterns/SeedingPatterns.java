package takeYouForward.patterns;

import java.util.Scanner;

/**
 * Sam is planting trees on the upper half region (separated by the left diagonal) of the square shared field.
 * For every value of ‘N’, print the field if the trees are represented by ‘*’.
 * Example:
 * Input: ‘N’ = 3
 *
 * Output:
 * * * *
 * * *
 * *
 */
public class SeedingPatterns {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        int n = SCANNER.nextInt();
        for (int i = 1; i<=n;i++){
            for (int j = n; j<=n && j>0; j--){
                if(i<=j)
                {
                    System.out.print("* ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
