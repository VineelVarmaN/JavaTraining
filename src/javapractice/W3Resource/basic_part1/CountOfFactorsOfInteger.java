package javapractice.W3Resource.basic_part1;

import java.util.stream.IntStream;

public class CountOfFactorsOfInteger {
    public int countOfFactors(int num1){
        int count =0;
        for (int i = 1; i<=num1;i++){
            if (num1%i==0){
                count++;
            }
        }
        return count;
    }
    public long countOfFactorsUsingStream(int num1){
       // long count = IntStream.range(1,25).filter(n->n*n==25).count();
        long count = IntStream.rangeClosed(1,num1).filter(i->num1%i==0).count();
        return count;
    }
    public static void main(String[] args) {
        int num1 = 25;
        System.out.println("Input an integer : "+ num1);
        CountOfFactorsOfInteger objCountOfFactorsOfInteger = new CountOfFactorsOfInteger();
        System.out.println(objCountOfFactorsOfInteger.countOfFactors(num1));
        //using stream
        System.out.println("The count of factors of a number using stream : "+objCountOfFactorsOfInteger.countOfFactorsUsingStream(num1));
    }
}
