package com.janjanee.leetcode;

import java.util.Arrays;

/**
 * leetcode 1672. Richest Customer Wealth
 * https://leetcode.com/problems/richest-customer-wealth/
 */
public class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int wealth = 0;
        int sum;
        for (int[] account : accounts) {
            sum = 0;
            for (int money : account) {
                sum += money;
            }
            wealth = Math.max(wealth, sum);
        }
        return wealth;
    }
}
