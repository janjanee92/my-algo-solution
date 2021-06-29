package com.janjanee.programmers.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * programmers. 완주하지 못한 선수
 * https://programmers.co.kr/learn/courses/30/lessons/42576
 */
public class NotCompletePlayer {
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();

        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }

        for (String player : completion) {
            map.replace(player, map.get(player) - 1);
        }

        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                answer = key;
                break;
            }
        }

        return answer;
    }
}
