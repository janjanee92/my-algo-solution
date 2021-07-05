package com.janjanee.other.greedy;

import java.util.Scanner;

public class MultiplyOrAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        long max = s.charAt(0) - '0';

        for (int i = 1; i < s.length(); i++) {
            int num = s.charAt(i) - '0';
            if (num <= 1 || max <= 1) {
                max += num;
            } else {
                max *= num;
            }
        }

        System.out.println(max);
    }
}
