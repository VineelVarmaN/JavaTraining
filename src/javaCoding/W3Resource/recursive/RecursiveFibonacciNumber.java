package javaCoding.W3Resource.recursive;

public class RecursiveFibonacciNumber {
    public static int fibonacciNumber(int number){
        if (number == 0){
            return 0;
        } else if (number == 1) {
            return 1;
        }
        return fibonacciNumber(number-1) + fibonacciNumber(number-2);
    }

    public static void main(String[] args) {
        int number = 10;
        System.out.println(fibonacciNumber(number));
    }
}
