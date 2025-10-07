package javaCoding.interviewBit.hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
 *
 * Example:
 *
 * Given [100, 4, 200, 1, 3, 2],
 *
 * The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.
 *
 * Your algorithm should run in O(n) complexity.
 */
public class LongestConsecutiveSequence {
    public static int longestConsecutive(final List<Integer> A) {
        if(A == null || A.isEmpty()) return 0;
        HashSet<Integer> set = new HashSet<>(A);
        System.out.println(set);
        int maxLength = 0;
        for(int num: A){
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                maxLength = Math.max(maxLength, currentStreak);
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        //List<Integer> A = new ArrayList<>(List.of(100, 4, 200, 1, 3, 2));
        //List<Integer> A = new ArrayList<>(List.of(97,86,67,19,107,9,8,49,23,46,-4,22,72,4,57,111,20,52,99,2,113,81,7,5,21,0,47,54,76,117,-2,102,34,12,103,69,36,51,105,-3,33,91,37,11,48,106,109,45,58,77,104,60,75,90,3,62,16,119,85,63,87,43,74,13,95,94,56,28,55,66,92,79,27,42,70));
        List<Integer> A = new ArrayList<>(List.of( 6, 4, 5, 2, 3 ));
        System.out.println(longestConsecutive(A));
    }
}
