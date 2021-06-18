package com.janjanee.leetcode;

import java.util.*;
import java.util.stream.Collectors;

/**
 * leetcode 1431. Kids With the Greatest Number of Candies
 * https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
 */
public class KidsWithTheGreatestNumberOfCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = getGreatestNumber(candies);

        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }
        return result;
    }

    public static List<Boolean> kidsWithCandies2(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies)
                .max()
                .getAsInt();

        return Arrays.stream(candies)
                .mapToObj(c -> c + extraCandies >= max)
                .collect(Collectors.toList());
    }

    public static List<Boolean> kidsWithCandies3(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>(candies.length);
        int gauge = 0;
        for (int candy : candies) {
            gauge = Math.max(candy, gauge);
        }
        // extraCandies를 N번 더하는 대신 한번 차이값을 구하고 그 값으로 계산
        gauge -= extraCandies;
        for (int candy : candies) {
            ans.add(candy >= gauge);
        }
        return ans;
    }

    private static int getGreatestNumber(int[] candies) {
        return Arrays.stream(candies)
                .max()
                .getAsInt();
    }

    public static void main(String[] args) {
    }
}
