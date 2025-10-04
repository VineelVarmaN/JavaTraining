package javaCoding.W3Resource.methods;

import java.util.Map;
import java.util.Scanner;

public class ComputeFutureInvestmentValue {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void getCompoundInterest(double amount, double interest, int years){
        //check how many years
        if (years<=0){
            System.out.println("No interest calculated");
        }
        System.out.println("Years     FutureValue");
        //calculate the compound interest
        for (int i =1; i<=years; i++){
            double result = amount*Math.pow(1+ ((interest/100) /12), 12*i);
            System.out.println(i+"     "+result);
        }
    }
    public static void main(String[] args) {
        double amount = SCANNER.nextDouble();
        double interest = SCANNER.nextDouble();
        int years = SCANNER.nextInt();
        getCompoundInterest(amount, interest, years);
    }
}
