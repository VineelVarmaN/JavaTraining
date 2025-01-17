package javalearning.leetcode;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static double median(int[] a1, int[] a2) {
        int[] c = new int[a1.length + a2.length];
        int cLength = c.length;
        for (int i = 0; i < a1.length; i++) {
            c[i] = a1[i];
        }
        for(int i = 0; i<a2.length; i++){
            c[a1.length + i] = a2[i];
        }
        Arrays.sort(c);
        System.out.println("merged Array : " + Arrays.toString(c));
        if (cLength % 2 != 0) {
            double output1 = (double) c[cLength / 2
                    ];
            System.out.println("odd : " + output1);
            return output1;
        }
        else {
            double output2 = (double) (c[(cLength - 1) / 2] + c[cLength / 2]) /2;
            System.out.println("even : " + output2);
            return output2;
            }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        //System.out.println(median(nums1, nums2));
        int[] num3 = {1,2};
        int[] num4 = {3,4};
        System.out.println(median(num3, num4));
    }
}
