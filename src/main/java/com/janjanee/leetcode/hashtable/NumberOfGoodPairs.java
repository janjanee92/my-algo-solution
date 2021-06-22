package com.janjanee.leetcode.hashtable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * leetcode 1512. Number of Good Pairs
 * https://leetcode.com/problems/number-of-good-pairs/
 */
public class NumberOfGoodPairs {
    public static int numIdenticalPairsArray(int[] nums) {
        int result = 0;
        int[] count = new int[101];

        for (int n : nums) {
            result += count[n]++;
        }
        return result;
    }

    public static int numIdenticalPairsHashtable(int[] nums) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
            result += map.get(n) - 1;
        }
        return result;
    }

}
