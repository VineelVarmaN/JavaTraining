package javalearning.learningSamples.TopicWiseSamplePrograms.operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumberAtEvenPosition {
        public static void main(String[] args) {
            int[] numbers = {34, 67, 81, 97, 45, 54, 90, 83};
            int[] evenPositionNumbers = new int[numbers.length / 2];
            int index = 0;
            for (int i = 1; i < numbers.length; i += 2) {
                evenPositionNumbers[index++] = numbers[i];
            }
            System.out.println("Numbers at even positions: " + Arrays.toString(evenPositionNumbers));

            int[] numbers1 = {34, 67, 81, 97, 45, 54, 90, 83};

            List<Integer> evenPositionNumber = IntStream.range(0, numbers1.length).filter(i -> i % 2 != 0)
                    .mapToObj(i -> numbers[i]).toList();

            System.out.println("Numbers at even positions: " + evenPositionNumber);
        }
        }
