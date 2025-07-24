package takeYouForward.baisctopics.basicMaths;

import java.util.Scanner;

public class CountAllDigitsOfaNumber {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int n = SCANNER.nextInt();
        //convert the int to string
        Integer count = Integer.toString(n).length();
        System.out.println(count);
    }
}
