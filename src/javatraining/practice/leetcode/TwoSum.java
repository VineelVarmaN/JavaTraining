package javatraining.practice.leetcode;
//class AddSumExample1{


import java.util.ArrayList;

//}
public class TwoSum {
    public static void main(String[] args) {
        int[] nums1 = {2,7,11,15};
        int target1 = 9;

        for (int i = 0; i< nums1.length; i++){
            for (int j=1; j< nums1.length; j++){
                if(nums1[i] + nums1[j] == target1){
                    ArrayList<Integer> output1 = new ArrayList<>();
                    output1.add(0, nums1[i]);
                    output1.add(1, nums1[j]);
                    System.out.println(output1);
                }
            }
        }
    }
}
