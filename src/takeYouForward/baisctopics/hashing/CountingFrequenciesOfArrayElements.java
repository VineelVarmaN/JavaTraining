package takeYouForward.baisctopics.hashing;

import java.util.*;

/**
 * Given an array nums of size n which may contain duplicate elements, return a list of pairs
 where each pair contains a unique element from the array and its frequency in the array.
 *
 * You may return the result in any order, but each element must appear exactly once in the
 output.
 *
 * Examples:
 * Input: nums = [1, 2, 2, 1, 3]
 * Output: [[1, 2], [2, 2], [3, 1]]
 * Explanation:
 * - 1 appears 2 times
 * - 2 appears 2 times
 * - 3 appears 1 time
  * Order of output can vary.
 */
public class CountingFrequenciesOfArrayElements {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static List<List<Integer>> countFrequency(int[] nums){
        //create a hastable and store the count of frequncy
        Hashtable<Integer, Integer> inner = new Hashtable<>();
        for (int i = 0; i< nums.length; i++){
            if (!inner.containsKey(nums[i])){
                inner.put(nums[i],1);
            }else {
                inner.put(nums[i],inner.get(nums[i])+1);
            }
        }
        //convert map to List<List<Integer>>
        List<List<Integer>> result = new ArrayList<>();
        //iterate the map
        for (Map.Entry<Integer, Integer> entry : inner.entrySet()){
            //first add the values to single list
            List<Integer> pair = new ArrayList<>();
            pair.add(entry.getKey());
            pair.add(entry.getValue());
            //finally add the single List to 2D double List
            result.add(pair);
        }
        return result;
    }
    public static void main(String[] args) {
      int[] nums = {1, 2, 2, 1, 3};
        System.out.println(nums);
        System.out.println(countFrequency(nums));
    }
}
