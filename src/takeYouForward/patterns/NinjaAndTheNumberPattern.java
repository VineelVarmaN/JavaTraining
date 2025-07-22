package takeYouForward.patterns;

import java.util.Scanner;

public class NinjaAndTheNumberPattern {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int n = SCANNER.nextInt();
        for (int i = 0; i < 2 * n - 1; i++) {
            //for stars
            for (int j = 0; j < 2 * n - 1; j++) {
                //declare top, left, bottom, right
                int top = i;
                int left = j;
                int bottom = 2*n-2-i;
                int right = 2*n-2-j;
                System.out.print(n-Math.min(Math.min(top,bottom),Math.min(left,right)));
            }
            System.out.println();
        }
    }
}
