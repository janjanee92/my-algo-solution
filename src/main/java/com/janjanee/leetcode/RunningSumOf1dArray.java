package com.janjanee.leetcode;

/**
 * leetcode 1480. Running Sum of 1d Array
 * https://leetcode.com/problems/running-sum-of-1d-array/
 */
public class RunningSumOf1dArray {
    public static int[] runningSum(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i != 0) {
                nums[i] += nums[i - 1];
            }
        }
        return nums;
    }
}
