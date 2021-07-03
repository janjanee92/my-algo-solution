package com.janjanee.programmers.other;

/**
 * programmers. 예상 대진표
 * https://programmers.co.kr/learn/courses/30/lessons/12985?language=java
 */
public class TournamentTable {
    public int solution(int n, int a, int b) {
        int count = 0;
        while(a != b) {
            a = a / 2 + a % 2;
            b = b / 2 + b % 2;
            count++;
        }
        return count;
    }
}
