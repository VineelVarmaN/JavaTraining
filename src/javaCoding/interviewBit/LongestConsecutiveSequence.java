package javaCoding.interviewBit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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
        int longest = 1;
        List<Integer> minimumLongest = new ArrayList<>();
        List<Integer> uniqueList = A.stream().distinct().sorted().toList();
        //System.out.println(uniqueList);
        //System.out.println(uniqueList.size());
        for (int i = 1; i<uniqueList.size(); i++){
            if (uniqueList.get(i)==uniqueList.get(i-1)+1){
                longest++;
            }
            else {
                minimumLongest.add(longest);
                longest = 1;
            }
        }
        minimumLongest.add(longest);
        //System.out.println(minimumLongest);
     return Collections.max(minimumLongest);
    }
    public static void main(String[] args) {
        //List<Integer> A = new ArrayList<>(List.of(100, 4, 200, 1, 3, 2));
        //List<Integer> A = new ArrayList<>(List.of(97,86,67,19,107,9,8,49,23,46,-4,22,72,4,57,111,20,52,99,2,113,81,7,5,21,0,47,54,76,117,-2,102,34,12,103,69,36,51,105,-3,33,91,37,11,48,106,109,45,58,77,104,60,75,90,3,62,16,119,85,63,87,43,74,13,95,94,56,28,55,66,92,79,27,42,70));
        List<Integer> A = new ArrayList<>(List.of( 6, 4, 5, 2, 3 ));
        System.out.println(longestConsecutive(A));
    }
}
