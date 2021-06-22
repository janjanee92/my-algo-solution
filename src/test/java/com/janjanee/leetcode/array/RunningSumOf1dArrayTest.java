package com.janjanee.leetcode.array;

import com.janjanee.leetcode.array.RunningSumOf1dArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RunningSumOf1dArrayTest {
    @Test
    void case1() {
        int[] nums = {1, 2, 3, 4};
        int [] expected = {1, 3, 6, 10};
        int[] result = RunningSumOf1dArray.runningSum(nums);
        assertArrayEquals(expected , nums);
    }

    @Test
    void case2() {
        int[] nums = {1, 1, 1, 1, 1};
        int [] expected = {1, 2, 3, 4, 5};
        int[] result = RunningSumOf1dArray.runningSum(nums);
        assertArrayEquals(expected , nums);
    }

    @Test
    void case3() {
        int[] nums = {3, 1, 2, 10, 1};
        int [] expected = {3, 4, 6, 16, 17};
        int[] result = RunningSumOf1dArray.runningSum(nums);
        assertArrayEquals(expected , nums);
    }

    @Test
    void case4() {
        int[] nums = {5, 2, 6, 8, 15, 2};
        int [] expected = {5, 7, 13, 21, 36, 38};
        int[] result = RunningSumOf1dArray.runningSum(nums);
        assertArrayEquals(expected , nums);
    }
}