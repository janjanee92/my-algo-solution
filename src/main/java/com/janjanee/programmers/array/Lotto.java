package com.janjanee.programmers.array;

import java.util.HashMap;
import java.util.Map;

/**
 * programmers. 로또의 최고 순위와 최저 순위
 * https://programmers.co.kr/learn/courses/30/lessons/77484
 */
public class Lotto {
    public int[] solution(int[] lottos, int[] win_nums) {
        int guessCount = 0;
        int zeroCount = 0;
        for (int lotto : lottos) {
            if (lotto == 0) {
                zeroCount++;
                continue;
            }
            for (int win_num : win_nums) {
                if (lotto == win_num) {
                    guessCount++;
                    break;
                }
            }
        }
        int max = 7 - (guessCount + zeroCount);
        int min = 7 - guessCount;
        if (max > 6) max = 6;
        if (min > 6) min = 6;

        return new int[]{max, min};
    }

    public int[] solution2(int[] lottos, int[] win_nums) {
        int guessCount = 0;
        int zeroCount = 0;

        Map<Integer, Boolean> map = new HashMap<>();
        for (int lotto : lottos) {
            if (lotto == 0) {
                zeroCount++;
                continue;
            }
            map.put(lotto, true);
        }

        for (int win_num : win_nums) {
            if (map.containsKey(win_num)) guessCount++;
        }

        int max = 7 - (guessCount + zeroCount);
        int min = 7 - guessCount;
        if (max > 6) max = 6;
        if (min > 6) min = 6;

        return new int[]{max, min};
    }
}
