package com.janjanee.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShuffleTheArrayTest {

    @Test
    void case1() {
        int[] result = ShuffleTheArray.shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3);
        assertArrayEquals(new int[]{2,3,5,4,1,7}, result);
    }

    @Test
    void case2() {
        int[] result = ShuffleTheArray.shuffle(new int[]{1, 2, 3, 4, 4, 3 ,2 ,1}, 4);
        assertArrayEquals(new int[]{1, 4, 2, 3, 3, 2, 4, 1}, result);
    }
    @Test
    void case3() {
        int[] result = ShuffleTheArray.shuffle(new int[]{1, 1, 2, 2}, 2);
        assertArrayEquals(new int[]{1, 2, 1, 2}, result);
    }
}