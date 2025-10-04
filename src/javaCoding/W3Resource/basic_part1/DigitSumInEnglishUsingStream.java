package javaCoding.W3Resource.basic_part1;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DigitSumInEnglishUsingStream {
    private static final Map<Integer, String> digitToWordMap = IntStream.range(0, 10)
            .boxed()
            .collect(Collectors.toMap(
                    i -> i,
                    i -> switch (i) {
                        case 0 -> "Zero";
                        case 1 -> "One";
                        case 2 -> "Two";
                        case 3 -> "Three";
                        case 4 -> "Four";
                        case 5 -> "Five";
                        case 6 -> "Six";
                        case 7 -> "Seven";
                        case 8 -> "Eight";
                        case 9 -> "Nine";
                        default -> "";
                    }));

    public static int sumOfDigits(int num) {
        return Stream.iterate(num, n -> n != 0, n -> n / 10)
                .mapToInt(n -> n % 10)
                .sum();
    }

    public static String digitToWord(int digit) {
        return digitToWordMap.getOrDefault(digit, "");
    }

    public static String getDigitSum(int num) {
        // Calculate the sum of its digits using Stream API
        int sum = sumOfDigits(num);
        System.out.println(sum);

        // Convert the sum to its English word representation
        return digitToWord(sum);
    }

    public static void main(String[] args) {
        int num = 1234; // Example input
        String result = getDigitSum(num);
        System.out.println("Sum of digits in English: " + result);
    }
}
