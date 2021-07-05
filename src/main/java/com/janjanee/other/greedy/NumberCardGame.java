package com.janjanee.other.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class NumberCardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] cards = new int[n][m];

        sc.nextLine();

        int max = 0;

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            int min = Arrays.stream(s.split(" "))
                    .mapToInt(Integer::valueOf)
                    .min()
                    .getAsInt();
            max = Math.max(max, min);
        }

        System.out.println(max);
    }
}
