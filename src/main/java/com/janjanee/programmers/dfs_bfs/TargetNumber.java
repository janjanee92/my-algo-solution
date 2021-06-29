package com.janjanee.programmers.dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * programmers. 타겟 넘버
 * https://programmers.co.kr/learn/courses/30/lessons/43165
 */
public class TargetNumber {

    public int solutionDFS(int[] numbers, int target) {
        return dfs(numbers, 0, 0, target);
    }

    private int dfs(int[] numbers, int n, int sum, int target) {
        if (n == numbers.length) {
            if (sum == target)
                return 1;
            return 0;
        }
        return dfs(numbers, n + 1, sum + numbers[n], target) + dfs(numbers, n + 1, sum - numbers[n], target);
    }

    public int solutionBFS(int[] numbers, int target) {
        int answer = 0;
        Queue<Number> queue = new LinkedList<>();
        queue.add(new Number(numbers[0],0));
        queue.add(new Number(-numbers[0], 0));

        while (!queue.isEmpty()) {
            Number n = queue.poll();
            int idx = n.idx;
            int val = n.val;

            if (idx == numbers.length - 1) {
                if (val == target) {
                    answer++;
                }
                continue;
            }
            queue.add(new Number(val + numbers[idx + 1], idx + 1));
            queue.add(new Number(val - numbers[idx + 1], idx + 1));
        }
        return answer;
    }

    class Number {
        int val;
        int idx;

        public Number(int value, int index) {
            this.val = value;
            this.idx = index;
        }
    }
}


