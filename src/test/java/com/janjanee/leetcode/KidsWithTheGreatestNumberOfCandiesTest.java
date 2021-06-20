package com.janjanee.leetcode;

import com.janjanee.leetcode.array.KidsWithTheGreatestNumberOfCandies;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KidsWithTheGreatestNumberOfCandiesTest {

    @Test
    void case1() {
        int extraCandies = 3;
        int[] candies = new int[]{2, 3, 5, 1, 3};
        List<Boolean> expected = Arrays.asList(true, true, true, false, true);

        test(candies, extraCandies, expected);
    }

    @Test
    void case2() {
        int extraCandies = 1;
        int[] candies = new int[]{4, 2, 1, 1, 2};
        List<Boolean> expected = Arrays.asList(true, false, false, false, false);

        test(candies, extraCandies, expected);
    }

    @Test
    void case3() {
        int extraCandies = 10;
        int[] candies = new int[]{12, 1, 12};
        List<Boolean> expected = Arrays.asList(true, false, true);

        test(candies, extraCandies, expected);
    }

    private void test(int[] candies, int extraCandies, List<Boolean> expected) {
        assertIterableEquals(expected, KidsWithTheGreatestNumberOfCandies
                .kidsWithCandies(candies, extraCandies));
        assertIterableEquals(expected, KidsWithTheGreatestNumberOfCandies
                .kidsWithCandies2(candies, extraCandies));
        assertIterableEquals(expected, KidsWithTheGreatestNumberOfCandies
                .kidsWithCandies3(candies, extraCandies));
    }
}