package takeYouForward.baisctopics.recursion;

import java.util.Scanner;

public class PrintNto1UsingRecursion {
    private static final Scanner SCANNER = new Scanner(System.in);
    public void printNumbers(int n, int i){
        if (i>n){
            return;
        }
        System.out.println(n);
        printNumbers(n-1,i);
    }

    public static void main(String[] args) {
        int n = SCANNER.nextInt();
        PrintNto1UsingRecursion printNto1UsingRecursionObj = new PrintNto1UsingRecursion();
        printNto1UsingRecursionObj.printNumbers(n,1);
    }
}
