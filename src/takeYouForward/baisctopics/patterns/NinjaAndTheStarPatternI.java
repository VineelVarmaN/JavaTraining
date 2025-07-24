package takeYouForward.baisctopics.patterns;

import java.util.Scanner;

public class NinjaAndTheStarPatternI {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        int n = SCANNER.nextInt();
        for (int i = 0; i < n; i++) {
            //for stars
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 ||j==0||j==n-1) {
                    System.out.print("*");

                }
               else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
