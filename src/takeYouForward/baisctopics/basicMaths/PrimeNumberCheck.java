package takeYouForward.baisctopics.basicMaths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrimeNumberCheck {
    private static final Scanner SCANNER = new Scanner(System.in);
    public boolean isPrime(int n) {
       if (n<=1) return false;
       if (n==2) return true;
       //iterate by adding the i value with 2 so that only odd numbers we will get to check the prime numbers
        //even numbers cannot become prime numbers, so make in for loop the i value should not become even number
        for (int i = 3; i<=n; i+= 2){
            if (n%i==0){
               return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int n = SCANNER.nextInt();
        PrimeNumberCheck primeNumberCheckObj = new PrimeNumberCheck();
        System.out.println(primeNumberCheckObj.isPrime(n));
    }
}
