package hackerRank;

import java.util.Scanner;

public class JavaIfElse {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        //integer should be positive
        if (N<0){
            System.out.println("Number should be Positive");
        }
        if (N%2==0){
            //if n is even, check number range is 2 to 5, print Not Weird
            if (N>=2 && N<=5){
                System.out.println("Not Weird");
            }
            //if n is even, check number range is 6 to 20, print Weird
            if (N>=6 && N<=20){
                System.out.println("Weird");
            }
            //if n is even, check number greater than 20, print Not Weird
            if (N>20){
                System.out.println("Not Weird");
            }
        }
        //if n is odd, print Weird
        else {
            System.out.println("Weird");
        }
        scanner.close();
    }
}
