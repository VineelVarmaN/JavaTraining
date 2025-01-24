package javapractice.W3Resource.basic_part1;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollatzConjectureSimulation {
    public int getValue(int num){
        System.out.println("value of n : "+ num);
        //repeat the process until num = 1
        while (num != 1) {
            //divide the integer by 2 if it is even
            if (num % 2 == 0) {
                num = num / 2;
            }
            //multiply by 3 and add 1, if it is odd
            else {
                num = num * 3 + 1;
            }
            System.out.println("The output for : "+ num);
        }
        return num;
    }
    public void getValueUsingStream(int num){
        Stream.iterate(num, n->n!=1, n-> n%2==0 ? n/2 : n*3+1).forEach(n-> System.out.println(n));
    }
    public static void main(String[] args) {
        int n = 19;
        CollatzConjectureSimulation objCollatzConjectureSimulation = new CollatzConjectureSimulation();
        System.out.println(objCollatzConjectureSimulation.getValue(n));
        //using stream
        objCollatzConjectureSimulation.getValueUsingStream(n);
    }
}
