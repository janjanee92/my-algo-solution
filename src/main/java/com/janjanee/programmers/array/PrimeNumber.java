package com.janjanee.programmers.array;

/**
 * programmers. 소수 만들기
 * https://programmers.co.kr/learn/courses/30/lessons/12977
 */
public class PrimeNumber {
    public int solution(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            int p1 = i + 1;
            int p2 = i + 2;
            if (i == nums.length - 1) break;
            while(p2 != nums.length || p1 != nums.length - 1) {
                int i1 = nums[i] + nums[p1] + nums[p2];

                if (isPrime(i1)) answer++;

                if (p2 == nums.length -1) {
                    p1++;
                    p2 = p1 + 1;
                } else {
                    p2++;
                }
            }
        }
        return answer;
    }

    public static boolean isPrime(int num) {
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
}
