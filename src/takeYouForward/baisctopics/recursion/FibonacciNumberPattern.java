package takeYouForward.baisctopics.recursion;

import java.util.Scanner;

public class FibonacciNumberPattern {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static int fib(int n){
        if (n<=1) return n;
        int last = fib(n-1);
        int second = fib(n-2);
        return last+second;
    }
    public static void main(String[] args) {
        int n = SCANNER.nextInt();
        System.out.println(fib(n));
    }
}
