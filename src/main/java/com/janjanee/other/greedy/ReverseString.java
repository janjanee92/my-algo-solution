package com.janjanee.other.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[] counts = {0, 0};

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i == s.length() - 1) {
                counts[c - '0']++;
                break;
            }
            if (c != s.charAt(i + 1)) {
                counts[c - '0']++;
            }
        }
        System.out.println(Math.min(counts[0], counts[1]));
    }
}
