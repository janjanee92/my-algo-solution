package com.janjanee.programmers.dfs_bfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TargetNumberTest {


    @Test
    void case1() {
        int[] numbers = {1, 1, 1, 2};
        int target = 3;
        int expected = 3;

        test(numbers, target, expected);

    }

    @Test
    void case2() {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        int expected = 5;

        test(numbers, target, expected);

    }

    private void test(int[] numbers, int target, int expected) {
        TargetNumber tn = new TargetNumber();
        int bfs = tn.solutionBFS(numbers, target);
        int dfs = tn.solutionDFS(numbers, target);

        assertEquals(expected, bfs);
        assertEquals(expected, dfs);
    }

}