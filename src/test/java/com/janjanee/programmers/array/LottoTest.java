package com.janjanee.programmers.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LottoTest {

    public final Lotto lotto = new Lotto();

    @Test
    void case1() {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        int[] expected = {3, 5};

        test(lottos, win_nums, expected);
    }

    @Test
    void case2() {
        int[] lottos = {0, 0, 0, 0, 0, 0};
        int[] win_nums = {38, 19, 20, 40, 15, 25};
        int[] expected = {1, 6};
        test(lottos, win_nums, expected);
    }

    @Test
    void case3() {
        int[] lottos = {45, 4, 35, 20, 3, 9};
        int[] win_nums = {20, 9, 3, 45, 4, 35};
        int[] expected = {1, 1};
        test(lottos, win_nums, expected);
    }

    private void test(int[] lottos, int[] win_nums, int[] expected) {
        int[] result = lotto.solution(lottos, win_nums);
        int[] result2 = lotto.solution2(lottos, win_nums);
        assertArrayEquals(expected, result);
        assertArrayEquals(expected, result2);
    }
}