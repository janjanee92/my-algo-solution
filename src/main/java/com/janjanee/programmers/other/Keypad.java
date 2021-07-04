package com.janjanee.programmers.other;

/**
 * programmers. 키패드 누르기
 * https://programmers.co.kr/learn/courses/30/lessons/67256
 */
public class Keypad {
    int [][] coordinate = {
            {3, 1},
            {0, 0},
            {0, 1},
            {0, 2},
            {1, 0},
            {1, 1},
            {1, 2},
            {2, 0},
            {2, 1},
            {2, 2}
    };
    int[] lp = {3, 0};
    int[] rp = {3, 2};
    String hand;

    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();

        for (int number : numbers) {
            this.hand = hand.equals("left") ? "L" : "R";
            String finger = push(number);
            answer.append(finger);

            if (finger.equals("L")) {
                lp = coordinate[number];
            }

            if (finger.equals("R")) {
                rp = coordinate[number];
            }
        }
        return answer.toString();
    }

    private String push(int number) {
        if (number == 1 || number == 4 || number == 7) return "L";
        if (number == 3 || number == 6 || number == 9) return "R";

        if (getDistance(lp, number) <  getDistance(rp, number)) return "L";
        if (getDistance(lp, number) >  getDistance(rp, number)) return "R";

        return hand;

    }

    private int getDistance(int[] p, int number) {
        return Math.abs(p[0]-coordinate[number][0]) + Math.abs(p[1]-coordinate[number][1]);
    }

}
