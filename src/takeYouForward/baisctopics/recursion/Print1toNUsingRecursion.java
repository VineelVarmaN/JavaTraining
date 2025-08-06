package takeYouForward.baisctopics.recursion;

import java.util.Scanner;

public class Print1toNUsingRecursion {
    private static final Scanner SCANNER = new Scanner(System.in);

    public void printNumbers(int i, int n){
        if (i>n){
            return;
        }
        System.out.println(i);
        printNumbers(i+1,n);
    }

    public static void main(String[] args) {
        int n = SCANNER.nextInt();
        Print1toNUsingRecursion print1toNUsingRecursionObj = new Print1toNUsingRecursion();
        print1toNUsingRecursionObj.printNumbers(1,n);
    }
}
