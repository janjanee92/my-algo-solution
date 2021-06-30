package com.janjanee.programmers.stack_queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FeatureDevelopmentTest {

    public final FeatureDevelopment fd = new FeatureDevelopment();

    @Test
    void case1() {
        int[] result = fd.solution2(new int[]{93, 30, 55}, new int[]{1, 30, 5});
        assertArrayEquals(new int[]{2, 1}, result);
    }

    @Test
    void case2() {
        int[] result = fd.solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1});
        assertArrayEquals(new int[]{1, 3, 2}, result);
    }

}