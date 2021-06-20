package com.janjanee.other.greedy;

import java.util.Arrays;
import java.util.Scanner;


public class LawOfLargeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int first = arr[n - 1];
        int second = arr[n - 2];

        int result;

        if (first == second) {
            result = first * m;
        } else {
            int count = m / k * k;
            result = (first * count) + ((m - count) * second);
        }

        System.out.println(result);
    }
}
