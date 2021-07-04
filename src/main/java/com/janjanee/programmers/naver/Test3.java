package com.janjanee.programmers.naver;

public class Test3 {
    public int solution(String s, String t) {
        int result = 0;
        while (s.contains(t)) {
            s = s.replace(t, "");
            result++;
        }
        return result;
    }
}
