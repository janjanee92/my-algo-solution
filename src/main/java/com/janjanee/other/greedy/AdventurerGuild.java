package com.janjanee.other.greedy;

import java.util.*;

public class AdventurerGuild {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        Collections.sort(list);

        int result = 0;
        int count = 0;
        int j = 0;
        for (int i = 0; i < n; i++) {
            count++;
            if (count >= list.get(i)) {
                result++;
                count = 0;
            }
        }
        System.out.println(result);
    }
}
