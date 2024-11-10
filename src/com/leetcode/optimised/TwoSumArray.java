package com.leetcode.optimised;

import java.util.HashMap;

public class TwoSumArray {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the indices of the elements
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] output = new int[2];

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement exists in the HashMap
            if (map.containsKey(complement)) {
                output[0] = map.get(complement);
                output[1] = i;
                return output;
            }

            // Add the element and its index to the HashMap
            map.put(nums[i], i);
        }

        // If no solution is found, return an empty array
        return output;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        TwoSumArray objTwoSumArray = new TwoSumArray();
        int[] result = objTwoSumArray.twoSum(nums, target);

        // Print the result in a readable format
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
