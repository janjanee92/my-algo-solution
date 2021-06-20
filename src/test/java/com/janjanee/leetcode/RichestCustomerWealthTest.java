package com.janjanee.leetcode;

import com.janjanee.leetcode.array.RichestCustomerWealth;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RichestCustomerWealthTest {

    @Test
    void case1() {
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        int result = RichestCustomerWealth.maximumWealth(accounts);
        assertEquals(6, result);
    }

    @Test
    void case2() {
        int[][] accounts = {{1, 5}, {7, 3}, {3, 5}};
        int result = RichestCustomerWealth.maximumWealth(accounts);
        assertEquals(10, result);
    }

    @Test
    void case3() {
        int[][] accounts = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        int result = RichestCustomerWealth.maximumWealth(accounts);
        assertEquals(17, result);
    }
}