package takeYouForward.baisctopics.hashing;

import java.util.HashMap;
import java.util.Map;

public class HighestOccurringElementInAnArrayOptimised {
    public static int mostFrequentElement(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int maxFreq = 0;
        int result = Integer.MAX_VALUE;

        // Count frequencies and track max frequency + smallest key
        for (int num : nums) {
            //getOrDefault = simplifies conditional logic for counting
            int freq = countMap.getOrDefault(num, 0) + 1;
            countMap.put(num, freq);
            //Combines frequency tracking and smallest element logic in a single condition
            if (freq > maxFreq || (freq == maxFreq && num < result)) {
                maxFreq = freq;
                result = num;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 3, 2, 5, 4};
        System.out.println(mostFrequentElement(nums));
    }

}
