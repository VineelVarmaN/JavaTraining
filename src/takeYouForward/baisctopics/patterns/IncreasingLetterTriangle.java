package takeYouForward.baisctopics.patterns;

import java.util.Scanner;

public class IncreasingLetterTriangle {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        int n = SCANNER.nextInt();
        for(int i=0;i<n;i++)
        {
            char k='A';
            for(int j=0;j<=i;j++)
            {
                System.out.print(k++ +" ");
            }
            System.out.println();
        }
    }
}
