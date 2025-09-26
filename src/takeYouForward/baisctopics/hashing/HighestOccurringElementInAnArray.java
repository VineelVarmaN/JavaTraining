package takeYouForward.baisctopics.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given an array nums of n integers, find the most frequent element in it i.e., the element that occurs the maximum number of times. If there are multiple elements that appear a maximum number of times, find the smallest of them.
 *
 * Examples:
 * Input: nums = [1, 2, 2, 3, 3, 3]
 * Output: 3
 *
 * Explanation: The number 3 appears the most (3 times). It is the most frequent element.
 */
public class HighestOccurringElementInAnArray {
    public static int mostFrequentElement(int[] nums) {
        //first create a hashtable using hashmap
        HashMap<Integer,Integer> countMap = new HashMap<>();
        //add the elements and count
        for (int i =0; i< nums.length; i++){
            if (!countMap.containsKey(nums[i])){
                countMap.put(nums[i],1);
            }else {
                countMap.put(nums[i],countMap.get(nums[i])+1);
            }
        }
        System.out.println(countMap.entrySet());
        //get the maximum count of frequncies of key and return the value
        int temp = 0;
        for (Map.Entry<Integer,Integer> key : countMap.entrySet()){
            if (key.getValue()>=temp){
                temp = key.getValue();
            }
        }
        System.out.println("maximum count : "+temp);

        //create a list to store multiple keys
        List<Integer> matchingKeys = new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry : countMap.entrySet()){
            if (entry.getValue().equals(temp)){
                matchingKeys.add(entry.getKey());
            }
        }
        System.out.println(matchingKeys);
        int smallestKey = Integer.MAX_VALUE;
        for (int key: matchingKeys){
            if (key<smallestKey){
                smallestKey=key;
            }
        }
        return smallestKey;
    }
    public static void main(String[] args) {
        int[] nums = {2, 4, 3, 2, 5, 4};
        System.out.println(nums.toString());
        System.out.println(mostFrequentElement(nums));
    }
}
