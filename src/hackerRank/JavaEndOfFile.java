package hackerRank;

import java.util.Scanner;

public class JavaEndOfFile {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int i = 1;
        while (SCANNER.hasNext()){
            String result = SCANNER.nextLine();
            System.out.println(i+" "+result);
            i++;
        }
        SCANNER.close();
    }
}
