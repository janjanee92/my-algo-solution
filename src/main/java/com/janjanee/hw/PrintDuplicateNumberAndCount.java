package com.janjanee.hw;

import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

/**
 * Q2. 배열의 모든 중복된 숫자와 횟수 출력 프로그램
 */
public class PrintDuplicateNumberAndCount {

    public static String run(int[] numbers) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : numbers) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        StringJoiner sj = new StringJoiner(",", "[", "]");

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            sj.add(entry.getKey() + ":" + entry.getValue());
        }

        return sj.toString();
    }

}
