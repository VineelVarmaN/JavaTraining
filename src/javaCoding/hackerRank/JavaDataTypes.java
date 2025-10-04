package javaCoding.hackerRank;

import java.util.Scanner;

public class JavaDataTypes {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //get the first value loop for input parameters T
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            try {
                long n = scanner.nextLong();

                System.out.println(n + " can be fitted in:");
                if (n >= -128 && n <= 127) System.out.println("* byte");
                if (n >= -32768 && n <= 32767) System.out.println("* short");
                if (n >= -2147483648L && n <= 2147483647L) System.out.println("* int");
                if (n >= -9223372036854775808L && n <= 9223372036854775807L) System.out.println("* long");

            } catch (Exception e) {
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }
    }
}
