package javaCoding.W3Resource.methods;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindSmallestNumberAmongThree {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        int first = SCANNER.nextInt();
        System.out.println("Input the first number: "+first);
        int second = SCANNER.nextInt();
        System.out.println("Input the first number: "+second);
        int third = SCANNER.nextInt();
        System.out.println("Input the first number: "+third);
        List<Integer> numbers = Arrays.asList(first, second, third);
        int minvalue = numbers.stream().min(Integer::compareTo).orElseThrow();
        System.out.println("The smallest value is "+minvalue );
    }
}
