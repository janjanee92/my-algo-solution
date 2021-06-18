package com.janjanee.leetcode;

/**
 * leetcode 1470. Shuffle the Array
 * https://leetcode.com/problems/shuffle-the-array/
 */
public class ShuffleTheArray {
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        for (int i = 0; i < n; i++) {
            result[i * 2] = nums[i];
            result[i * 2 + 1] = nums[i + n];
        }
        return result;
    }
}
