package com.leetcode.orginal;

public class TwoSumArray {
        public int[] twoSum(int[] nums, int target) {
            int numsLength = nums.length;
            int[] output = new int[2];
            for(int i =0; i<numsLength; i++){
                for(int j= i + 1; j<numsLength; j++){
                    if(nums[i] + nums[j] == target){
                        System.out.println("the " + i + " is: " + nums[i]);
                        System.out.println("the " + j + " is: " + nums[j]);
                        output[0] = i;
                        output[1] = j;
                    }
                }
            }
            return output;
        }
        public static void main(String[] args){
            int[] nums = {2, 7, 11,15};
            int target = 9;
            TwoSumArray objTwoSumArray = new TwoSumArray();
            System.out.println(objTwoSumArray.twoSum(nums, target));
        }
    }
