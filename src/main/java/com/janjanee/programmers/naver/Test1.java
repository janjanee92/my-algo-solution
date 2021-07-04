package com.janjanee.programmers.naver;

import java.util.Arrays;

public class Test1 {
    public int solution(int[] prices, int[] discounts) {
        int answer = 0;
        Arrays.sort(prices);
        Arrays.sort(discounts);

        int j = discounts.length - 1;

        for (int i = prices.length - 1; i >= 0; i--) {
            int price = prices[i];
            int discount = 0;
            if (j >= 0) {
                discount = discounts[j--];
            }
            answer += price / 100 * (100 - discount);
        }
        return answer;
    }
}
