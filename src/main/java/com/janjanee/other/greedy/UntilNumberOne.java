package com.janjanee.other.greedy;

import java.util.Scanner;

public class UntilNumberOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int count = 0;
        while (true) {
            int target = (n % k);
            count += target;
            n = n - target;

            if (n < k) break;
            n /= k;
            count++;
        }

        count += (n - 1);
        System.out.println(count);
    }
}
