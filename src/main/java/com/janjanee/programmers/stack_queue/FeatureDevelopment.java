package com.janjanee.programmers.stack_queue;

import java.util.*;

/**
 * programmers. 기능개발
 * https://programmers.co.kr/learn/courses/30/lessons/42586
 */
public class FeatureDevelopment {

    public int[] solution(int[] progresses, int[] speeds) {
        int length = progresses.length;
        List<Integer> list = new ArrayList<>();

        Queue<Integer> q = new LinkedList<>();
        q.add(progresses[0]);

        int idx = 0;
        while (!q.isEmpty()) {
            int p = q.poll();

            if (p < 100 && idx != length - 1) {
                for (int i = 0; i < length; i++) {
                    progresses[i] += speeds[i];
                }
                q.add(progresses[idx]);
            } else {
                int count = 0;
                for (int i = idx + 1; i < length; i++) {
                    if (progresses[i] >= 100) {
                        count++;
                    } else {
                        idx = i;
                        q.add(progresses[idx]);
                        break;
                    }
                }
                list.add(count + 1);
            }

        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
