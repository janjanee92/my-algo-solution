package com.janjanee.leetcode.hashtable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfGoodPairsTest {

    @Test
    void case1(){
        int[] nums = {1, 2, 3, 1, 1, 3};
        int expected = 4;
        test(nums, expected);
    }

    @Test
    void case2(){
        int[] nums = {1, 1, 1, 1};
        int expected = 6;
        test(nums, expected);
    }

    @Test
    void case3(){
        int[] nums = {1, 2, 3};
        int expected = 0;
        test(nums, expected);
    }

    private void test(int[] nums, int expected) {
        int result1 = NumberOfGoodPairs.numIdenticalPairsArray(nums);
        int result2 = NumberOfGoodPairs.numIdenticalPairsHashtable(nums);
        assertEquals(expected, result1);
        assertEquals(expected, result2);
    }

}