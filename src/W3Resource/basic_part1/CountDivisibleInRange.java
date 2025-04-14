package W3Resource.basic_part1;

import java.util.stream.IntStream;

public class CountDivisibleInRange {
    public int countDivisible(int num1, int num2, int p){
        int count = 0;
        for (int i = num1; i<=num2; i++){
            if (i%p==0){
                //System.out.println(i);
                count ++;
            }
        }
        return count;
    }

    public Long countDivisibleUsingStream(int num1, int num2, int p){
        Long count = IntStream.range(num1,num2).filter(n->n%p==0).count();
        return count;
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 20;
        int divisible = 3;
        CountDivisibleInRange objCountDivisibleInRange = new CountDivisibleInRange();
        System.out.println("The count divisible in range : "+objCountDivisibleInRange.countDivisible(num1,num2,divisible));
        //using stream
        System.out.println("The count divisible in range using stream : "+objCountDivisibleInRange.countDivisibleUsingStream(num1,num2,divisible));
    }
}
