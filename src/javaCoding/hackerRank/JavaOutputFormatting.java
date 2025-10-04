package javaCoding.hackerRank;

import java.util.Scanner;

public class JavaOutputFormatting {
    private static final Scanner scanner = new Scanner(System.in);
    private static final int DESIRED_LENGTH = 3; // Length of the integer
    private static final int STRING_LIMIT = 15; // Updated to match optimal formatting

    public static void main(String[] args) {
        System.out.println("================================");

        for (int i = 0; i < 3; i++) {
            String s = scanner.next(); // Read the string
            int a = scanner.nextInt(); // Read the integer

            // Format and align output in one line
            System.out.printf("%-" + STRING_LIMIT + "s%0" + DESIRED_LENGTH + "d%n", s, a);
        }

        System.out.println("================================");
        scanner.close(); // Closing the scanner resource
    }
}
