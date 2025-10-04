package javaCoding.hackerRank;

import java.util.Scanner;

public class JavaLoopsTwo {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //the input values from system will take upto two queries only. iterate the for loop till i value reaches two
        int q = scanner.nextInt();
        for (int i = 0; i<q; i++){
            //initialize the value
            //  a = first input value
            int a = scanner.nextInt();
            // base Number = 2;
            // b = second input value
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            int result = a;
            //power n = 10;
            //use for loop from 0 to 10 or equal to 10 power
            for (int j = 0; j<n; j++){
                //(a+2power0*b), (a+2power0*b+2power1*b), ...(a+2power0*b+2power1*b+....+2power10-1*b)
                //(1<<j) - bitwise left shit - multiplying by powers of 2
                result += (1<<j)*b;
                System.out.print(result+" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
