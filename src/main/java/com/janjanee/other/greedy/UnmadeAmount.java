package com.janjanee.other.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class UnmadeAmount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int target = 1;
        for (int j : arr) {
            if (target < j) break;
            target += j;
        }

        System.out.println(target);
    }
}
